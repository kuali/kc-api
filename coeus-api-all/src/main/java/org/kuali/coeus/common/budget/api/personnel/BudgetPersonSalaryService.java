/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2022 Kuali, Inc. - All Rights Reserved
 * %%
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
 * #L%
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
