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
