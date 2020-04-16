/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2020 Kuali, Inc. - All Rights Reserved
 * %%
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 * 
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 * #L%
 */

package org.kuali.coeus.common.api.org;

import org.kuali.coeus.common.api.org.audit.OrganizationAuditContract;
import org.kuali.coeus.common.api.org.type.OrganizationTypeContract;

import java.util.Date;
import java.util.List;

public interface OrganizationContract {

    String getOrganizationId();

    String getAddress();

    String getAgencySymbol();

    String getAnimalWelfareAssurance();

    String getCableAddress();

    String getCageNumber();

    Integer getCognizantAuditor();

    Integer getLobbyingRegistrant();

    Integer getLobbyingIndividual();

    String getComGovEntityCode();

    String getCongressionalDistrict();

    Integer getContactAddressId();

    String getCounty();

    String getDodacNumber();

    String getDunsNumber();

    String getDunsPlusFourNumber();

    /**
     * The Unique Entity ID.
     */
    String getUei();

    String getFederalEmployerId();

    String getHumanSubAssurance();

    Date getIncorporatedDate();

    String getIncorporatedIn();

    String getIndirectCostRateAgreement();

    String getIrsTaxExemption();

    String getStateEmployeeClaim();

    String getStateTaxExemptNum();

    String getNsfInstitutionalCode();

    Integer getNumberOfEmployees();

    Integer getOnrResidentRep();

    String getOrganizationName();

    String getPhsAccount();

    Date getScienceMisconductComplDate();

    String getTelexNumber();

    String getVendorCode();

    List<? extends OrganizationYnqContract> getOrganizationYnqs();

    List<? extends OrganizationTypeContract> getOrganizationTypes();

    List<? extends OrganizationIndirectcostContract> getOrganizationIdcs();

    List<? extends OrganizationAuditContract> getOrganizationAudits();
}
