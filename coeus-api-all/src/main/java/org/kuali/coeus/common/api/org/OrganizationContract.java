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
