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

package org.kuali.coeus.common.api.unit;

import java.util.List;

public interface UnitRepositoryService {

    /**
     * Finds a unit by unit number.  The unit number cannot be blank.
     * @param unitNumber the unit number.  Cannot be blank.
     * @return the unit or null if not found.
     * @throws java.lang.IllegalArgumentException if the unitNumber is blank
     */
    UnitContract findUnitByUnitNumber(String unitNumber);

    /**
     * Finds the top unit in the hierarchy.
     * @return the unit or null if not found.
     */
    UnitContract findTopUnit();
    
    /**
     * Finds the hierarchy for unit,including all the parent units and the unit itself.
     * If no matching Units are found an empty list is returned.
     * The unit number cannot be blank.
     *
     * @param unitNumber the unit number.  cannot be blank.
     * @return a list of Units or an empty list if not found.
     * @throws java.lang.IllegalArgumentException if the unitNumber is blank
     */
    List<UnitContract> getUnitHierarchyForUnit(String unitNumber);
}
