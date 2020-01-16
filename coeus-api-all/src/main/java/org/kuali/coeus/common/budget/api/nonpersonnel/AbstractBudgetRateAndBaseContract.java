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

package org.kuali.coeus.common.budget.api.nonpersonnel;

import org.kuali.coeus.common.budget.api.core.IdentifiableBudget;
import org.kuali.coeus.common.budget.api.rate.RateClassContract;
import org.kuali.coeus.sys.api.model.ScaleTwoDecimal;

import java.util.Date;

public interface AbstractBudgetRateAndBaseContract extends IdentifiableBudget {
    
    Integer getBudgetPeriod();

    Integer getLineItemNumber();

    String getRateClassCode();

    Integer getRateNumber();

    String getRateTypeCode();

    ScaleTwoDecimal getAppliedRate();

    ScaleTwoDecimal getBaseCostSharing();

    ScaleTwoDecimal getCalculatedCost();

    ScaleTwoDecimal getCalculatedCostSharing();

    Date getEndDate();

    Boolean getOnOffCampusFlag();

    Date getStartDate();

    RateClassContract getRateClass();
}
