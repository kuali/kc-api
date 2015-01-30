/*
 * Kuali Coeus, a comprehensive research administration system for higher education.
 * 
 * Copyright 2005-2015 The Kuali, Inc.
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
package org.kuali.coeus.propdev.api.person;

import org.kuali.coeus.common.api.person.KcPersonContract;
import org.kuali.coeus.common.api.person.attr.CitizenshipTypeContract;
import org.kuali.coeus.propdev.api.hierarchy.HierarchicalProposal;
import org.kuali.coeus.propdev.api.person.creditsplit.ProposalPersonCreditSplitContract;
import org.kuali.coeus.sys.api.model.ScaleTwoDecimal;

import java.util.Date;
import java.util.List;

public interface ProposalPersonContract extends ProposalPersonLink, HierarchicalProposal {
    
    boolean getConflictOfInterestFlag();

    boolean isOtherSignificantContributorFlag();

    ScaleTwoDecimal getPercentageEffort();

    Boolean getFedrDebrFlag();

    Boolean getFedrDelqFlag();

    Integer getRolodexId();

    String getProposalPersonRoleId();
    
    Boolean getOptInUnitStatus();
    
    Boolean getOptInCertificationStatus();
    
    String getProjectRole();
    
    Integer getOrdinalPosition();
    
    String getPersonId();
    
    String getSocialSecurityNumber();
    
    String getLastName();
    
    String getFirstName();
    
    String getMiddleName();
    
    String getFullName();
    
    String getPriorName();
    
    String getUserName();
    
    String getEmailAddress();
    
    Date getDateOfBirth();
    
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
    
    Date getVisaRenewalDate();
    
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
    
    String getHomeUnit();
    
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
    
    String getState();
    
    String getPostalCode();
    
    String getCountryCode();
    
    String getFaxNumber();
    
    String getPagerNumber();
    
    String getMobilePhoneNumber();
    
    String getEraCommonsUserName();
    
    String getDivision();

    CitizenshipTypeContract getCitizenshipType();

    ProposalInvestigatorCertificationContract getCertification();

    List<? extends ProposalPersonYnqContract> getProposalPersonYnqs();

    List<? extends ProposalPersonUnitContract> getUnits();

    List<? extends ProposalPersonDegreeContract> getProposalPersonDegrees();

    List<? extends ProposalPersonCreditSplitContract> getCreditSplits();

    boolean isInvestigator();

    boolean isPrincipalInvestigator();

    boolean isCoInvestigator();

    boolean isKeyPerson();

    boolean isMultiplePi();

    KcPersonContract getPerson();
}
