/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2021 Kuali, Inc. - All Rights Reserved
 * %%
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 * 
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 * #L%
 */

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
