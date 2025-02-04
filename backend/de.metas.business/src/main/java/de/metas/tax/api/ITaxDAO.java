package de.metas.tax.api;

import de.metas.bpartner.BPartnerId;
import de.metas.i18n.ITranslatableString;
import de.metas.location.CountryId;
import de.metas.organization.OrgId;
import de.metas.tax.model.I_C_VAT_SmallBusiness;
import de.metas.util.ISingletonService;
import de.metas.util.lang.Percent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Value;
import org.adempiere.exceptions.ExemptTaxNotFoundException;
import org.compiere.model.I_C_TaxCategory;

import javax.annotation.Nullable;
import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

public interface ITaxDAO extends ISingletonService
{

	Tax getTaxById(int taxRepoId);

	Tax getTaxById(TaxId taxRepoId);

	Tax getTaxByIdOrNull(int taxRepoId);

	/**
	 * @return true if the given bpartner currently has a {@link I_C_VAT_SmallBusiness} record.
	 */
	boolean retrieveIsTaxExemptSmallBusiness(BPartnerId bPartnerId, Timestamp date);

	/**
	 * @throws ExemptTaxNotFoundException if no tax exempt found
	 */
	TaxId retrieveExemptTax(OrgId orgId);

	Tax getDefaultTax(TaxCategoryId taxCategoryId);
	
	/**
	 * If the taxBL can't find a tax, it shall return this one instead
	 *
	 * @return placeholder tax that is used when no other tax was found
	 */
	TaxId retrieveNoTaxFoundId(Properties ctx);

	int findTaxCategoryId(TaxCategoryQuery query);

	I_C_TaxCategory getTaxCategoryById(TaxCategoryId id);

	ITranslatableString getTaxCategoryNameById(TaxCategoryId id);

	Optional<TaxCategoryId> getTaxCategoryIdByName(@NonNull String name);

	Percent getRateById(@NonNull TaxId taxId);

	Optional<Tax> getByIfPresent(@NonNull TaxQuery taxQuery);

	/**
	 * Get tax category by criteria.
	 * IF a VatCodeId is provided, and that code is associated with a {@code C_Tax} whose category is marked as IsManualTax, then that tax is used regardless of other query parameters.
	 */
	@Nullable
	Tax getBy(final TaxQuery taxQuery);

	@Nullable
	Tax getTaxFromVatCodeIfManualOrNull(@Nullable VatCodeId vatCodeId);

	List<Tax> getChildTaxes(@NonNull TaxId taxId);

	@Builder
	@Value
	class TaxCategoryQuery
	{
		@AllArgsConstructor
		@Getter
		public enum VATType
		{
			RegularVAT("N"), ReducedVAT("R"), TaxExempt("E");

			private final String value;
		}

		@NonNull
		VATType type;

		@NonNull
		CountryId countryId;
	}
}
