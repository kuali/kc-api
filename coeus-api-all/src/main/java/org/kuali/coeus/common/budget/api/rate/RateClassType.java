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

/**
 * This class represents different possible enumerations of RateClassType
 */
public enum RateClassType {
    INFLATION("I"),
    OVERHEAD("O"),
    EMPLOYEE_BENEFITS("E"),
    LAB_ALLOCATION("L"),
    LA_SALARIES("Y"),
    VACATION("V"),
    OTHER("X");
    private final String rateClassType;
    RateClassType(String rateClassType){
        this.rateClassType = rateClassType;
    }
    public String getRateClassType(){
        return rateClassType;
    }
}
