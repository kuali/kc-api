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

package org.kuali.coeus.propdev.api.s2s;

import org.kuali.coeus.propdev.api.core.NumberedProposal;

import java.util.Calendar;
import java.util.List;

public interface S2sOpportunityContract extends NumberedProposal {

    String getPackageId();

    Calendar getClosingDate();

    String getCompetitionId();

    String getCompetitionTitle();

    String getInstructionUrl();

    Calendar getOpeningDate();

    String getOpportunity();

    String getRevisionOtherDescription();

    String getSchemaUrl();

    String getOpportunityId();

    /**
     * alias of fundingOpportunityTitle
     */
    String getOpportunityTitle();

    String getFundingOpportunityNumber();

    String getOfferingAgency();

    String getAgencyContactInfo();

    boolean isMultiProject();

    String getComponentType();

    String getOverallSchemaUrl();

    String getOverallSchema();

    S2sProviderContract getS2sProvider();

    S2sRevisionTypeContract getS2sRevisionType();

    S2sSubmissionTypeContract getS2sSubmissionType();

    List<? extends S2sOppFormsContract> getS2sOppForms();

    List<? extends S2sOpportunityCfdaContract> getS2sOpportunityCfdas();
}
