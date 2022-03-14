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

package org.kuali.coeus.common.budget.api.core.category;


import java.util.List;

public interface BudgetCategoryMapService {

    /**
     * Finds the {@link org.kuali.coeus.common.budget.api.core.category.BudgetCategoryMapContract}s by targetCategoryCode and mappingName.  Will return an empty
     * List if no items exist.
     * @param targetCategoryCode the target category code.  Cannot be blank.
     * @param mappingName the mapping name.  Cannot be blank.
     * @return a list of {@link org.kuali.coeus.common.budget.api.core.category.BudgetCategoryMapContract}s or an empty list.
     * @throws IllegalArgumentException if the targetCategoryCode is blank, if the mappingName is blank
     */
    List<? extends BudgetCategoryMapContract> findCatMapByTargetAndMappingName(String targetCategoryCode, String mappingName);

    /**
     * Finds the {@link BudgetCategoryMapContract}s by mappingName.  Will return an empty
     * List if no items exist.
     * @param mappingName the mapping name.  Cannot be blank.
     * @return a list of {@link BudgetCategoryMapContract}s or an empty list.
     * @throws IllegalArgumentException if the mappingName is blank
     */
    List<? extends BudgetCategoryMapContract> findCatMapByMappingName(String mappingName);

    /**
     * Finds the {@link org.kuali.coeus.common.budget.api.core.category.BudgetCategoryMappingContract}s by targetCategoryCode and mappingName.  Will return an empty
     * List if no items exist.
     * @param targetCategoryCode the target category code.  Cannot be blank.
     * @param mappingName the mapping name.  Cannot be blank.
     * @return a list of {@link org.kuali.coeus.common.budget.api.core.category.BudgetCategoryMappingContract}s or an empty list.
     * @throws IllegalArgumentException if the targetCategoryCode is blank, if the mappingName is blank
     */
    List<? extends BudgetCategoryMappingContract> findCatMappingByTargetAndMappingName(String targetCategoryCode, String mappingName);

    /**
     * Finds the {@link BudgetCategoryMappingContract}s by mappingName.  Will return an empty
     * List if no items exist.
     * @param mappingName the mapping name.  Cannot be blank.
     * @return a list of {@link BudgetCategoryMappingContract}s or an empty list.
     * @throws IllegalArgumentException if the mappingName is blank
     */
    List<? extends BudgetCategoryMappingContract> findCatMappingByMappingName(String mappingName);
}
