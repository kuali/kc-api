
package org.kuali.coeus.propdev.api.editable;

import org.kuali.coeus.propdev.api.core.NumberedProposal;

public interface ProposalChangedDataContract extends NumberedProposal {

    Integer getChangeNumber();

    String getColumnName();

    String getChangedValue();
    
    String getComments();
    
    String getDisplayValue();
    
    String getOldDisplayValue();

    ProposalColumnsToAlterContract getEditableColumn();
}
