/* Copyright © 2005-2018 Kuali, Inc. - All Rights Reserved
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 *
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 */
package org.kuali.coeus.common.budget.api.nonpersonnel;

import org.kuali.coeus.common.budget.api.core.IdentifiableBudget;
import org.kuali.coeus.common.budget.api.rate.RateClassContract;
import org.kuali.coeus.sys.api.model.ScaleTwoDecimal;

public interface AbstractBudgetCalculatedAmountContract extends IdentifiableBudget {
    
    Integer getBudgetPeriod();
    
    Integer getLineItemNumber();
    
    String getRateTypeCode();
    
    Boolean getApplyRateFlag();
    
    ScaleTwoDecimal getCalculatedCost();
    
    ScaleTwoDecimal getCalculatedCostSharing();
    
    String getRateTypeDescription();
    
    Long getBudgetLineItemId();

    RateClassContract getRateClass();
}
