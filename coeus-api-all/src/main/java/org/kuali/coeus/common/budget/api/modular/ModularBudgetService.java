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
package org.kuali.coeus.common.budget.api.modular;

import org.kuali.coeus.common.budget.api.core.BudgetContract;
import org.kuali.coeus.common.budget.api.period.BudgetPeriodContract;
import org.kuali.coeus.propdev.api.budget.modular.BudgetModularContract;

import java.util.List;

/**
 * This service allows Modular Budget information to be retrieved for populating forms
 */
public interface ModularBudgetService {

    /**
     * This service method retrieves Modular Budget information for a given budget.
     * Its primary function is to allow retrieval from either the existing budget representation
     * or from the new Modular Budget microservice.
     *
     * @param budget the Budget document to use for retrieving the Modular Budget. Cannot be null.
     * @return a list of Modular Budget entries for each period in the input budget.
     */
    List<? extends BudgetModularContract> getModularBudgetAmounts(BudgetContract budget);

    /**
     * Given a list of Modular Budget amount objects, returns the correct associated with
     * the passed-in budget period based on the "budgetPeriod" property in both.
     *
     * @param modularAmounts The list of Modular Budget amounts to iterate through
     * @param period The Budget Period of the associated desired modular amounts
     * @return the Modular Budget amount that corresponds to the passed-in Budget Period
     */
    default BudgetModularContract getModularBudgetForPeriod(List<? extends BudgetModularContract> modularAmounts, BudgetPeriodContract period) {
        return modularAmounts.stream()
                .filter(modular -> period.getBudgetPeriod().equals(modular.getBudgetPeriod()))
                .findFirst().orElse(null);
    }

}
