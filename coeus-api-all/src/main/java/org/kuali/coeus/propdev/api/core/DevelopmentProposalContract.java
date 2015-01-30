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
package org.kuali.coeus.propdev.api.core;

import org.kuali.coeus.award.api.core.AwardTypeContract;
import org.kuali.coeus.common.api.noo.NoticeOfOpportunityContract;
import org.kuali.coeus.common.api.rolodex.RolodexContract;
import org.kuali.coeus.common.api.sponsor.SponsorContract;
import org.kuali.coeus.common.api.type.ActivityTypeContract;
import org.kuali.coeus.common.api.type.ProposalTypeContract;
import org.kuali.coeus.common.api.unit.UnitContract;
import org.kuali.coeus.propdev.api.abstrct.ProposalAbstractContract;
import org.kuali.coeus.propdev.api.attachment.NarrativeContract;
import org.kuali.coeus.propdev.api.budget.ProposalDevelopmentBudgetExtContract;
import org.kuali.coeus.propdev.api.budget.editable.BudgetChangedDataContract;
import org.kuali.coeus.propdev.api.editable.ProposalChangedDataContract;
import org.kuali.coeus.propdev.api.keyword.PropScienceKeywordContract;
import org.kuali.coeus.propdev.api.location.ProposalSiteContract;
import org.kuali.coeus.propdev.api.person.ProposalPersonContract;
import org.kuali.coeus.propdev.api.person.attachment.ProposalPersonBiographyContract;
import org.kuali.coeus.propdev.api.s2s.S2sAppSubmissionContract;
import org.kuali.coeus.propdev.api.s2s.S2sOppFormsContract;
import org.kuali.coeus.propdev.api.s2s.S2sOpportunityContract;
import org.kuali.coeus.propdev.api.s2s.S2sUserAttachedFormContract;
import org.kuali.coeus.propdev.api.specialreview.ProposalSpecialReviewContract;
import org.kuali.coeus.propdev.api.state.ProposalStateContract;
import org.kuali.coeus.propdev.api.ynq.ProposalYnqContract;
import org.kuali.coeus.sys.api.model.RecordedUpdate;

import java.util.Date;
import java.util.List;

public interface DevelopmentProposalContract extends NumberedProposal, RecordedUpdate {
    
    String getContinuedFrom();

    Date getRequestedStartDateInitial();

    Date getRequestedEndDateInitial();

    String getTitle();

    String getCurrentAwardNumber();

    Date getDeadlineDate();

    String getDeadlineTime();

    String getDeadlineType();

    String getCfdaNumber();

    String getProgramAnnouncementNumber();

    String getSponsorProposalNumber();

    String getNsfCode();

    Boolean getSubcontracts();

    String getAgencyDivisionCode();

    String getAgencyProgramCode();

    String getProgramAnnouncementTitle();

    String getMailBy();

    String getMailType();

    String getMailAccountNumber();

    String getMailDescription();

    String getNumberOfCopies();

    String getCreationStatusCode();

    Boolean getSubmitFlag();

    String getHierarchyStatus();

    String getHierarchyOriginatingChildProposalNumber();

    String getHierarchyParentProposalNumber();

    Integer getHierarchyLastSyncHashCode();

    String getHierarchyBudgetType();

    String getProposalNumberForGG();

    String getOpportunityIdForGG();

    String getAgencyRoutingIdentifier();

    String getPrevGrantsGovTrackingID();

    ProposalTypeContract getProposalType();

    NoticeOfOpportunityContract getNoticeOfOpportunity();

    AwardTypeContract getAnticipatedAwardType();

    ProposalStateContract getProposalState();

    RolodexContract getRolodex();

    SponsorContract getSponsor();

    UnitContract getOwnedByUnit();

    SponsorContract getPrimeSponsor();

    ActivityTypeContract getActivityType();

    List<? extends ProposalSiteContract> getProposalSites();

    List<? extends ProposalSpecialReviewContract> getPropSpecialReviews();

    List<? extends PropScienceKeywordContract> getPropScienceKeywords();

    List<? extends ProposalPersonContract> getProposalPersons();

    List<? extends S2sOppFormsContract> getS2sOppForms();

    List<? extends S2sAppSubmissionContract> getS2sAppSubmission();

    List<? extends S2sUserAttachedFormContract> getS2sUserAttachedForms();

    List<? extends ProposalYnqContract> getProposalYnqs();

    List<? extends ProposalChangedDataContract> getProposalChangedDataList();

    List<? extends BudgetChangedDataContract> getBudgetChangedDataList();

    List<? extends NarrativeContract> getNarratives();

    List<? extends ProposalAbstractContract> getProposalAbstracts();

    List<? extends NarrativeContract> getInstituteAttachments();

    List<? extends ProposalPersonBiographyContract> getPropPersonBios();

    List<? extends ProposalDevelopmentBudgetExtContract> getBudgets();

    ProposalDevelopmentBudgetExtContract getFinalBudget();

    ProposalDevelopmentBudgetExtContract getLatestBudget();

    S2sOpportunityContract getS2sOpportunity();

    ProposalSiteContract getApplicantOrganization();

    ProposalSiteContract getPerformingOrganization();

    List<? extends ProposalSiteContract> getPerformanceSites();

    List<? extends ProposalSiteContract> getOtherOrganizations();

    List<? extends ProposalPersonContract> getInvestigators();

    Boolean getGrantsGovSelectFlag();
}
