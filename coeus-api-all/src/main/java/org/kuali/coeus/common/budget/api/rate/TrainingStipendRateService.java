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
package org.kuali.coeus.common.budget.api.rate;


import java.util.Date;

public interface TrainingStipendRateService {

    /**
     * This method finds the closest matching {@link TrainingStipendRateContract} based on the following rules.
     *
     * The Training Stipend Rate's effective date must be less than or equal to the passed in effective date.
     * The Training Stipend Rate's career level must be equal to the passed in career level.
     * The Training Stipend Rate's experience level must be equal to the passed in experience level.
     *
     * If at the end of this match, multiple Training Stipend Rates match then the one with the latest effective date
     * is returned.  This is considered the "closest match".
     *
     * Note: that this method only considers the date portion of a {@link Date} for effective date comparisons.
     * Also note that a TrainingStipendRate without an effective date will never be considered a match.
     *
     * @param effectiveDate the effective date of the training stipend rate must be less than or equal to.  Cannot be null.
     * @param careerLevel the career level of the training stipend rate. Cannot be blank.
     * @param experienceLevel the experience level of the training stipend rate
     * @return the closest matching {@link TrainingStipendRateContract} or null if there is no match
     * @throws java.lang.IllegalArgumentException if the effectiveDate is null, if the careerLevel is blank
     */
    TrainingStipendRateContract findClosestMatchTrainingStipendRate(Date effectiveDate, String careerLevel, int experienceLevel);
}
