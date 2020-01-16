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

package org.kuali.coeus.common.api.ynq;


public enum YnqConstant {
    YES ("Y", "Yes"),
    NO("N", "No"),
    NA("X", "N/A"),
    YES_NO("YN", "Yes,No"),
    YES_NO_NA("YNX", "Yes,No,N/A"),
    YES_NA("YX", "Yes,N/A"),
    NO_NA("NX", "No,N/A"),
    NONE("", "None");

    private final String code;   
    private final String description; 
    YnqConstant(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String code()   
    { 
        return code; 
    }

    public String description() 
    { 
        return description; 
    }

}

