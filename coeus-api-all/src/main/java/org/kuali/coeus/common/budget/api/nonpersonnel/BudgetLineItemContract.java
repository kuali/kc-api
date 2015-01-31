/*
 * Kuali Coeus, a comprehensive research administration system for higher education.
 * 
 * Copyright 2005-2015 Kuali, Inc.
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
package org.kuali.coeus.common.budget.api.nonpersonnel;

import org.kuali.coeus.common.budget.api.core.category.BudgetCategoryContract;
import org.kuali.coeus.common.budget.api.core.CostElementContract;
import org.kuali.coeus.common.budget.api.core.IdentifiableBudget;
import org.kuali.coeus.common.budget.api.personnel.BudgetPersonnelDetailsContract;
import org.kuali.coeus.propdev.api.hierarchy.HierarchicalProposal;
import org.kuali.coeus.sys.api.model.ScaleTwoDecimal;

import java.util.Date;
import java.util.List;

public interface BudgetLineItemContract extends IdentifiableBudget, HierarchicalProposal {

    Long getBudgetLineItemId();

    Long getBudgetPeriodId();

    Integer getLineItemNumber();

    Integer getBudgetPeriod();

    Boolean getApplyInRateFlag();

    Integer getBasedOnLineItem();

    String getBudgetJustification();

    String getGroupName();

    ScaleTwoDecimal getTotalCostSharingAmount();

    Date getEndDate();

    ScaleTwoDecimal getLineItemCost();

    String getLineItemDescription();

    Integer getLineItemSequence();

    Boolean getOnOffCampusFlag();

    Integer getQuantity();

    Date getStartDate();

    ScaleTwoDecimal getUnderrecoveryAmount();

    Boolean getSubmitCostSharingFlag();

    Boolean getFormulatedCostElementFlag();

    List<? extends BudgetLineItemCalculatedAmountContract> getBudgetLineItemCalculatedAmounts();

    List<? extends BudgetPersonnelDetailsContract> getBudgetPersonnelDetailsList();

    Integer getSubAwardNumber();

    List<? extends BudgetRateAndBaseContract> getBudgetRateAndBaseList();

    List<? extends BudgetFormulatedCostDetailContract> getBudgetFormulatedCosts();

    BudgetCategoryContract getBudgetCategory();

    CostElementContract getCostElementBO();

    ScaleTwoDecimal getCostSharingAmount();
}
