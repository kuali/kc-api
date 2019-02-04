
package org.kuali.coeus.propdev.api.budget.editable;

import org.kuali.coeus.propdev.api.core.NumberedProposal;

public interface BudgetChangedDataContract extends NumberedProposal {

    Integer getChangeNumber();

    String getColumnName();

    String getChangedValue();
    
    String getComments();
    
    String getDisplayValue();
    
    String getOldDisplayValue();

    BudgetColumnsToAlterContract getEditableColumn();
}
