/*
 * Kuali Coeus, a comprehensive research administration system for higher education.
 * 
 * Copyright 2005-2015 The Kuali, Inc.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.kuali.coeus.common.budget.api.core;

import org.kuali.coeus.common.budget.api.distribution.BudgetCostShareContract;
import org.kuali.coeus.common.budget.api.distribution.BudgetUnrecoveredFandAContract;
import org.kuali.coeus.common.budget.api.income.BudgetProjectIncomeContract;
import org.kuali.coeus.common.budget.api.period.BudgetPeriodContract;
import org.kuali.coeus.common.budget.api.personnel.BudgetPersonContract;
import org.kuali.coeus.common.budget.api.rate.BudgetLaRateContract;
import org.kuali.coeus.common.budget.api.rate.BudgetRateContract;
import org.kuali.coeus.common.budget.api.rate.RateClassContract;
import org.kuali.coeus.propdev.api.budget.subaward.BudgetSubAwardsContract;
import org.kuali.coeus.sys.api.model.DocumentNumbered;
import org.kuali.coeus.sys.api.model.RecordedCreate;
import org.kuali.coeus.sys.api.model.ScaleTwoDecimal;

import java.util.Date;
import java.util.List;

public interface BudgetContract extends IdentifiableBudget, DocumentNumbered, RecordedCreate {

    Integer getBudgetVersionNumber();

    ScaleTwoDecimal getCostSharingAmount();

    Date getEndDate();

    Date getStartDate();

    String getOhRateTypeCode();

    ScaleTwoDecimal getResidualFunds();

    ScaleTwoDecimal getTotalCost();

    ScaleTwoDecimal getTotalDirectCost();

    ScaleTwoDecimal getTotalIndirectCost();

    ScaleTwoDecimal getTotalCostLimit();

    ScaleTwoDecimal getTotalDirectCostLimit();

    ScaleTwoDecimal getUnderrecoveryAmount();

    String getComments();

    Boolean getModularBudgetFlag();

    String getOnOffCampusFlag();

    Boolean getSubmitCostSharingFlag();

    RateClassContract getUrRateClass();

    RateClassContract getRateClass();

    String getBudgetJustification();

    String getBudgetAdjustmentDocumentNumber();

    List<? extends BudgetRateContract> getBudgetRates();
    
    List<? extends BudgetLaRateContract> getBudgetLaRates();
    
    List<? extends BudgetProjectIncomeContract> getBudgetProjectIncomes();
    
    List<? extends BudgetCostShareContract> getBudgetCostShares();
    
    List<? extends BudgetUnrecoveredFandAContract> getBudgetUnrecoveredFandAs();
    
    List<? extends BudgetPersonContract> getBudgetPersons();
    
    List<? extends BudgetSubAwardsContract> getBudgetSubAwards();

    List<? extends BudgetPeriodContract> getBudgetPeriods();
}
