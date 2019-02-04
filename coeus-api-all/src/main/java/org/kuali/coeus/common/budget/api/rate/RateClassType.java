
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
