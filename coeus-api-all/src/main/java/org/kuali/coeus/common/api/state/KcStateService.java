/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2022 Kuali, Inc. - All Rights Reserved
 * %%
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
 * #L%
 */

package org.kuali.coeus.common.api.state;

public interface KcStateService {

    /**
     * This method retrieves a state by country code and state code.  If the state is not found null is returned.
     * Both the country code and state code cannot be blank.
     *
     * @param countryCode the country code.  cannot be blank.
     * @param code the state code.  cannot be blank.
     * @return the state or null if not found.
     * @throws java.lang.IllegalArgumentException if the countryCode, code is blank
     */
    StateContract getState(String countryCode, String code);
}
