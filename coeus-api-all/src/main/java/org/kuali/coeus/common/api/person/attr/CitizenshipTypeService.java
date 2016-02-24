/*
 * Kuali Coeus, a comprehensive research administration system for higher education.
 * 
 * Copyright 2005-2016 Kuali, Inc.
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
package org.kuali.coeus.common.api.person.attr;

import org.kuali.coeus.propdev.api.person.ProposalPersonContract;

public interface CitizenshipTypeService {
    
	/**
	 * Retrieves the proposal persons CitizenshipType. The default implementation of this method will determine the source of the data based on two parameters.
	 * When the parameter "PI_CITIZENSHIP_FROM_CUSTOM_DATA" is set to 0 it will retrieve the value from an external source, in which case a service override must have implemented the 
	 * protected getCitizenshipDataFromExternalSource method in this service, otherwise an UnsupportedOperationException will be thrown. Within the system there are two possible 
	 * sources for the data. When the parameter "ALLOW_PROPOSAL_PERSON_TO_OVERRIDE_KC_PERSON_EXTENDED_ATTRIBUTES"
	 * is set to true, this value will be retrieved from the proposal person record allowing each proposal to override the citizenship type for each person. When this parameter
	 * is turned off, the value is retrieved from the KC Extended Attributes record for the person. 
	 * @param proposalPerson
	 * @return the CitizenshipType for each person. It will return CitizenshipType.NOT_AVAILABLE when unavailable or the citizenship code is not recognized as a valid value.
	 * @throws java.lang.IllegalArgumentException if the proposalPerson is null
	 * @throws java.lang.UnsupportedOperationException if the PI_CITIZENSHIP_FROM_CUSTOM_DATA is disabled and getCitizenshipDataFromExternalSource has not been overridden
	 */
    CitizenshipType getPersonCitizenshipType(ProposalPersonContract proposalPerson);

}
