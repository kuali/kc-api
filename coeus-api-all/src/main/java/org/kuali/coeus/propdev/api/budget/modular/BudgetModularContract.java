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

package org.kuali.coeus.propdev.api.budget.modular;

import org.kuali.coeus.sys.api.model.ScaleTwoDecimal;

import java.util.List;

public interface BudgetModularContract {
    Long getBudgetPeriodId();
    
    Long getBudgetId();
    
    Integer getBudgetPeriod();
    
    ScaleTwoDecimal getDirectCostLessConsortiumFna();
    
    ScaleTwoDecimal getConsortiumFna();
    
    ScaleTwoDecimal getTotalDirectCost();

    List<? extends BudgetModularIdcContract> getBudgetModularIdcs();
}
