/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2019 Kuali, Inc. - All Rights Reserved
 * %%
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 * 
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 * #L%
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
