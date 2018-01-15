/* Copyright © 2005-2018 Kuali, Inc. - All Rights Reserved
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 *
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
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
