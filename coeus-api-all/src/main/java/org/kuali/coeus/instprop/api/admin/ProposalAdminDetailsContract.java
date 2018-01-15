/* Copyright © 2005-2018 Kuali, Inc. - All Rights Reserved
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 *
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 */
package org.kuali.coeus.instprop.api.admin;

import java.util.Date;

public interface ProposalAdminDetailsContract {

    Date getDateSubmittedByDept();

    Date getDateReturnedToDept();

    Date getDateApprovedByOsp();

    Date getDateSubmittedToAgency();

    Date getInstPropCreateDate();

    String getInstPropCreateUser();

    String getSignedBy();

    boolean getSubmissionType();

    Long getProposalAdminDetailId();

    String getDevProposalNumber();

    Long getInstProposalId();
}
