/* Copyright © 2005-2018 Kuali, Inc. - All Rights Reserved
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 *
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 */
package org.kuali.coeus.common.budget.api.core;

import org.kuali.coeus.common.budget.api.core.category.BudgetCategoryContract;
import org.kuali.coeus.common.budget.api.rate.ValidCeRateTypeContract;
import org.kuali.coeus.sys.api.model.Describable;
import org.kuali.coeus.sys.api.model.Inactivatable;

import java.util.List;

public interface CostElementContract extends Describable, Inactivatable {
    
    String getCostElement();
    
    String getBudgetCategoryCode();
    
    Boolean getOnOffCampusFlag();

    String getFinancialObjectCode();

    List<? extends ValidCeRateTypeContract> getValidCeRateTypes();

    BudgetCategoryContract getBudgetCategory();
}
