/* Copyright © 2005-2018 Kuali, Inc. - All Rights Reserved
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 *
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 */
package org.kuali.coeus.common.budget.api.personnel;

import org.kuali.coeus.sys.api.model.ScaleTwoDecimal;

public interface BudgetPersonSalaryService {

    /**
     * Finds the base salary for the first Budget Period.  The Budget Period are retrieved by
     * budgetId, personId, and budgetPeriod.  The personId can either be a personId or rolodexId.
     *
     * @param budgetId The budget Id. cannot be null.
     * @param personId The personId or rolodexId.  Cannot be blank.
     * @param budgetPeriod the budget period. Cannot be null.
     * @return the base salary of null if no matching periods exist.
     * @throws java.lang.IllegalArgumentException if budgetId is null, if personId is blank, if budgetPeriod is null
     */
    ScaleTwoDecimal findBaseSalaryForFirstPeriod(Long budgetId, String personId, Integer budgetPeriod);
}
