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


import java.util.List;

public interface S2sFormConfigurationService {

    /**
     * Finds an s2s form configuration by form name.  The form name cannot be null or blank.
     * @param formName the form name.  cannot be null or blank.
     * @return an s2s form configuration or null if not found.
     * @throws java.lang.IllegalArgumentException if the form Name is blank
     */
    S2sFormConfigurationContract findS2sFormConfigurationByFormName(String formName);

    /**
     * Finds all s2s form configurations.
     * @return an s2s form configuration or an empty list if non is found.
     */
    List<? extends S2sFormConfigurationContract> findAllS2sFormConfigurations();
}
