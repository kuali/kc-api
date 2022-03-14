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

package org.kuali.coeus.propdev.api.s2s;

public interface S2sProviderService {
    /**
     * This method retrieves and S2S Provider by code. The code cannot be blank.
     * Will return null if non is found.
     *
     * @param code the provider code.  Cannot be blank.
     * @return the S2sProvider or null.
     * @throws java.lang.IllegalArgumentException if code is blank
     */
    S2sProviderContract findS2SProviderByCode(String code);
}
