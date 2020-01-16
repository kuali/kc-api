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

package org.kuali.coeus.common.budget.api.income;

import org.kuali.coeus.common.budget.api.period.BudgetPeriodContract;

import org.kuali.coeus.common.budget.api.core.IdentifiableBudget;
import org.kuali.coeus.propdev.api.hierarchy.HierarchicalProposal;
import org.kuali.coeus.sys.api.model.Describable;
import org.kuali.coeus.sys.api.model.ScaleTwoDecimal;

public interface BudgetProjectIncomeContract extends IdentifiableBudget, Describable, HierarchicalProposal {

    Integer getDocumentComponentId();

    Long getBudgetPeriodId();

    BudgetPeriodContract getBudgetPeriod();

    Integer getBudgetPeriodNumber();

    ScaleTwoDecimal getProjectIncome();

}
