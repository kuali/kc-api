/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2020 Kuali, Inc. - All Rights Reserved
 * %%
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 * 
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 * #L%
 */

package org.kuali.coeus.common.budget.api.period;

import org.kuali.coeus.common.budget.api.core.IdentifiableBudget;
import org.kuali.coeus.common.budget.api.nonpersonnel.BudgetLineItemContract;
import org.kuali.coeus.sys.api.model.ScaleTwoDecimal;

import java.util.Date;
import java.util.List;

public interface BudgetPeriodContract extends IdentifiableBudget {

    Long getBudgetPeriodId();

    Integer getBudgetPeriod();
    
    String getComments();
    
    ScaleTwoDecimal getCostSharingAmount();
    
    Date getEndDate();
    
    Date getStartDate();
    
    ScaleTwoDecimal getTotalCost();
    
    ScaleTwoDecimal getTotalCostLimit();
    
    ScaleTwoDecimal getTotalDirectCost();
    
    ScaleTwoDecimal getTotalIndirectCost();
    
    ScaleTwoDecimal getUnderrecoveryAmount();
    
    List<? extends BudgetLineItemContract> getBudgetLineItems();
    
    Integer getNumberOfParticipants();
    
    ScaleTwoDecimal getDirectCostLimit();
}
