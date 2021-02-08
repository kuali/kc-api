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

package org.kuali.coeus.common.budget.api.nonpersonnel;

import org.kuali.coeus.common.budget.api.rate.FormulatedTypeContract;
import org.kuali.coeus.sys.api.model.ScaleTwoDecimal;

public interface BudgetFormulatedCostDetailContract {
    
    Long getBudgetFormulatedCostDetailId();

    Long getBudgetLineItemId();

    Integer getFormulatedNumber();

    ScaleTwoDecimal getUnitCost();
    
    Integer getCount();
    
    Integer getFrequency();
    
    ScaleTwoDecimal getCalculatedExpenses();

    FormulatedTypeContract getFormulatedType();
}
