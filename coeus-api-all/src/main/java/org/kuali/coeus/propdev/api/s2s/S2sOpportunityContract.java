/* Copyright © 2005-2018 Kuali, Inc. - All Rights Reserved
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 *
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 */
package org.kuali.coeus.propdev.api.s2s;

import org.kuali.coeus.propdev.api.core.NumberedProposal;

import java.util.Calendar;
import java.util.List;

public interface S2sOpportunityContract extends NumberedProposal {

    Calendar getClosingDate();

    String getCompetetionId();

    String getInstructionUrl();

    Calendar getOpeningDate();

    String getOpportunity();

    String getRevisionOtherDescription();

    String getSchemaUrl();

    String getOpportunityId();

    String getOpportunityTitle();

    String getFundingOpportunityNumber();

    String getOfferingAgency();

    String getAgencyContactInfo();

    boolean isMultiProject();

    S2sProviderContract getS2sProvider();

    S2sRevisionTypeContract getS2sRevisionType();

    S2sSubmissionTypeContract getS2sSubmissionType();

    List<? extends S2sOppFormsContract> getS2sOppForms();

    List<? extends S2sOpportunityCfdaContract> getS2sOpportunityCfdas();
}
