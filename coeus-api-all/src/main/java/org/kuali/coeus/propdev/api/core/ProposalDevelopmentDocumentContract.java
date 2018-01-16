/* Copyright © 2005-2018 Kuali, Inc. - All Rights Reserved
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 *
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 */
package org.kuali.coeus.propdev.api.core;

import org.kuali.coeus.common.api.custom.attr.CustomAttributeDocValueContract;
import org.kuali.coeus.sys.api.model.DocumentNumbered;

import java.util.List;

public interface ProposalDevelopmentDocumentContract extends DocumentNumbered {

    boolean isProposalDeleted();

    DevelopmentProposalContract getDevelopmentProposal();

    List<? extends CustomAttributeDocValueContract> getCustomDataList();
}
