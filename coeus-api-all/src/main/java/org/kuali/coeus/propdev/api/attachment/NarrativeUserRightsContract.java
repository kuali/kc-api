
package org.kuali.coeus.propdev.api.attachment;

import org.kuali.coeus.propdev.api.core.NumberedProposal;

public interface NarrativeUserRightsContract extends NumberedProposal {
    Integer getModuleNumber();
    String getUserId();
    String getAccessType();
}
