/* Copyright © 2005-2018 Kuali, Inc. - All Rights Reserved
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 *
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 */
package org.kuali.coeus.propdev.api.specialreview;

import org.kuali.coeus.common.api.compliance.core.SpecialReviewContract;
import org.kuali.coeus.propdev.api.core.NumberedProposal;
import org.kuali.coeus.propdev.api.hierarchy.HierarchicalProposal;
import org.kuali.coeus.sys.api.model.IdentifiableNumeric;

import java.util.List;
import java.util.Map;

public interface ProposalSpecialReviewContract extends NumberedProposal, IdentifiableNumeric, SpecialReviewContract, HierarchicalProposal {

    List<? extends ProposalSpecialReviewExemptionContract> getSpecialReviewExemptions();

    ProposalSpecialReviewAttachmentContract getSpecialReviewAttachment();


}
