/*
 * Kuali Coeus, a comprehensive research administration system for higher education.
 * 
 * Copyright 2005-2015 Kuali, Inc.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
