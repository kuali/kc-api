
package org.kuali.coeus.common.api.person.attr;

/**
 * 
 * This class manages enums for the following CitizenshipTypes: US_CITIZEN_OR_NONCITIZEN_NATIONAL, 
 * PERMANENT_RESIDENT_OF_US, NON_US_CITIZEN_WITH_TEMPORARY_VISA, PERMANENT_RESIDENT_OF_US_PENDING.
 */
public enum CitizenshipType {
    US_CITIZEN_OR_NONCITIZEN_NATIONAL("U.S. Citizen or noncitizen national"), 
    PERMANENT_RESIDENT_OF_US("Permanent Resident of U.S."), 
    NON_US_CITIZEN_WITH_TEMPORARY_VISA("Non-U.S. Citizen with temporary visa"),
    PERMANENT_RESIDENT_OF_US_PENDING("Permanent Resident of U.S. Pending"),
    NOT_RESIDING_IN_US("Not Residing in the U.S"),
    TEMP_VISA_ALSO_APPLIED_FOR_PERM_RESIDENT_STATUS("Temporary Visa also applied for permanent resident status"),
    NOT_AVAILABLE("N/A");

    private final String citizenShip;

    CitizenshipType(String citizenShip) {
        this.citizenShip = citizenShip;
    }

    public String getCitizenShip() {
        return citizenShip;
    }
}
