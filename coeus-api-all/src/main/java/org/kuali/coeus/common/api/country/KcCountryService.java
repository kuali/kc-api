/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2019 Kuali, Inc. - All Rights Reserved
 * %%
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 * 
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 * #L%
 */

package org.kuali.coeus.common.api.country;


public interface KcCountryService {

    /**
     * This method retrieves a country by country code.  If the country is not found null is returned.
     * The country code cannot be blank.
     *
     * @param code the country code.  cannot be blank.
     * @return the country or null if not found.
     * @throws java.lang.IllegalArgumentException if the code is blank
     */
    CountryContract getCountry(String code);

    /**
     * This method retrieves a country by alternate country code.  The alternate country code is usually a three digit
     * code. If the country is not found null is returned. The alternate country code cannot be blank.
     *
     * @param alternateCode the alternate country code.  cannot be blank.
     * @return the country or null if not found.
     * @throws java.lang.IllegalArgumentException if the alternateCode is blank
     */
    CountryContract getCountryByAlternateCode(String alternateCode);
}
