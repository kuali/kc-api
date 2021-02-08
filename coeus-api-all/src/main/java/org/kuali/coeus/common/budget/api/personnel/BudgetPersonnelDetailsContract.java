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

package org.kuali.coeus.common.budget.api.personnel;

import org.kuali.coeus.common.budget.api.core.IdentifiableBudget;
import org.kuali.coeus.sys.api.model.ScaleTwoDecimal;
import org.kuali.coeus.sys.api.model.Sequenceable;

import java.util.Date;
import java.util.List;

public interface BudgetPersonnelDetailsContract extends IdentifiableBudget, Sequenceable {

    Long getBudgetPersonnelLineItemId();

    Long getBudgetLineItemId();
    
    Integer getLineItemNumber();
    
    Integer getBudgetPeriod();
    
    Boolean getOnOffCampusFlag();
    
    Date getEndDate();
    
    Date getStartDate();
    
    String getBudgetJustification();
    
    ScaleTwoDecimal getCostSharingAmount();
    
    String getLineItemDescription();
    
    Boolean getApplyInRateFlag();
    
    Integer getPersonNumber();
    
    ScaleTwoDecimal getCostSharingPercent();
    
    String getJobCode();
    
    ScaleTwoDecimal getPercentCharged();
    
    ScaleTwoDecimal getPercentEffort();
    
    String getPeriodTypeCode();
    
    String getPersonId();
    
    ScaleTwoDecimal getSalaryRequested();

    Integer getPersonSequenceNumber();
    
    ScaleTwoDecimal getUnderrecoveryAmount();
    
    Boolean getSubmitCostSharingFlag();

    BudgetPersonContract getBudgetPerson();

    List<? extends BudgetPersonnelCalculatedAmountContract> getBudgetPersonnelCalculatedAmounts();
}
