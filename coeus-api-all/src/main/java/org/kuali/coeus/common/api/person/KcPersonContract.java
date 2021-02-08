/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2021 Kuali, Inc. - All Rights Reserved
 * %%
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 * 
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 * #L%
 */

package org.kuali.coeus.common.api.person;

import org.kuali.coeus.common.api.address.Addressable;
import org.kuali.coeus.common.api.unit.UnitContract;
import org.kuali.coeus.sys.api.model.Inactivatable;

public interface KcPersonContract extends Inactivatable, Addressable {

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

    String getNsfId();

    UnitContract getUnit();

    String getPhoneNumber(); 

    String getContactOrganizationName(); 

    String getOrganizationIdentifier(); 

    String getCampusCode();
}
