
package org.kuali.coeus.propdev.api.attachment;

import org.kuali.coeus.propdev.api.core.NumberedProposal;
import org.kuali.coeus.propdev.api.hierarchy.HierarchicalProposal;

import java.util.List;

public interface NarrativeContract extends HierarchicalProposal, NumberedProposal {

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
