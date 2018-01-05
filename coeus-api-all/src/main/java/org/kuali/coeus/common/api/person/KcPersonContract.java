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
package org.kuali.coeus.common.api.person;

import org.kuali.coeus.common.api.unit.UnitContract;
import org.kuali.coeus.sys.api.model.Inactivatable;

public interface KcPersonContract extends Inactivatable {

    String getPersonId(); 

    String getSocialSecurityNumber();

    String getLastName();

    String getFirstName(); 

    String getMiddleName(); 

    String getFullName(); 

    String getPriorName();

    String getUserName(); 

    String getEmailAddress();

    String getDateOfBirth(); 

    Integer getAge();

    Integer getAgeByFiscalYear(); 

    String getGender(); 

    String getRace(); 

    String getEducationLevel(); 

    String getDegree(); 

    String getMajor(); 

    Boolean getHandicappedFlag(); 

    String getHandicapType(); 

    Boolean getVeteranFlag();

    String getVeteranType(); 

    String getVisaCode();

    String getVisaType(); 

    String getVisaRenewalDate();

    Boolean getHasVisa(); 

    String getOfficeLocation(); 

    String getOfficePhone();

    String getSecondaryOfficeLocation(); 

    String getSecondaryOfficePhone();

    String getSchool(); 

    String getYearGraduated(); 

    String getDirectoryDepartment(); 

    String getSaluation(); 

    String getCountryOfCitizenship(); 

    String getPrimaryTitle(); 

    String getDirectoryTitle(); 

    Boolean getFacultyFlag(); 

    Boolean getGraduateStudentStaffFlag(); 

    Boolean getResearchStaffFlag(); 

    Boolean getServiceStaffFlag(); 

    Boolean getSupportStaffFlag(); 

    Boolean getOtherAcademicGroupFlag(); 

    Boolean getMedicalStaffFlag(); 

    Boolean getVacationAccrualFlag(); 

    Boolean getOnSabbaticalFlag(); 

    String getIdProvided(); 

    String getIdVerified(); 

    String getAddressLine1(); 

    String getAddressLine2(); 

    String getAddressLine3(); 

    String getCity(); 

    String getCounty(); 

    Integer getCitizenshipTypeCode(); 

    String getState(); 

    String getPostalCode(); 

    String getCountryCode(); 

    String getFaxNumber(); 

    String getPagerNumber(); 

    String getMobilePhoneNumber(); 

    String getEraCommonsUserName();

    String getIdentifier();

    Long getNsfId();

    UnitContract getUnit();

    String getPhoneNumber(); 

    String getContactOrganizationName(); 

    String getOrganizationIdentifier(); 

    String getCampusCode();
}
