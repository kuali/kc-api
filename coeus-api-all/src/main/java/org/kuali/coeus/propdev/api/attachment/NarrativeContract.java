/* Copyright © 2005-2018 Kuali, Inc. - All Rights Reserved
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 *
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 */
package org.kuali.coeus.propdev.api.attachment;

import org.kuali.coeus.propdev.api.hierarchy.HierarchicalProposal;

import java.util.List;

public interface NarrativeContract extends HierarchicalProposal {

     String getProposalNumber();

     Integer getModuleNumber();

     String getComments();

     String getContactName();

     String getEmailAddress();

     Integer getModuleSequenceNumber();

     String getModuleTitle();

     String getPhoneNumber();

     NarrativeTypeContract getNarrativeType();

     NarrativeStatusContract getNarrativeStatus();

     List<? extends NarrativeUserRightsContract> getNarrativeUserRights();

     NarrativeAttachmentContract getNarrativeAttachment();
}
