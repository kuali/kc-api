
package org.kuali.coeus.propdev.api.attachment;


import org.kuali.coeus.propdev.api.core.NumberedProposal;
import org.kuali.coeus.sys.api.model.KcFile;

public interface NarrativeAttachmentContract extends KcFile, NumberedProposal {
    Integer getModuleNumber();
}
