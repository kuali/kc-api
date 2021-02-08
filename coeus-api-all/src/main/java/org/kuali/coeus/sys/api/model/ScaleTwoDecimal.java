/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2021 Kuali, Inc. - All Rights Reserved
 * %%
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 * 
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 * #L%
 */

package org.kuali.coeus.sys.api.model;

import java.math.BigDecimal;

/**
 * This class is a wrapper around {@link java.math.BigDecimal}. It exposes the only the
 * needed functionality of {@link java.math.BigDecimal}, uses a standard
 * {@link java.math.RoundingMode} of {@link java.math.RoundingMode#HALF_UP}
 * and uses a standard SCALE of 2.
 *
 * This class is, like {@link java.math.BigDecimal}, immutable; even methods which
 * might be expected to change the value actually just return a new instance
 * with the new value.
 */
public final class ScaleTwoDecimal extends AbstractDecimal<ScaleTwoDecimal> {

    private static final long serialVersionUID = 1602860735060812811L;

    public static final int SCALE = 2;

    public static final ScaleTwoDecimal ZERO = new ScaleTwoDecimal(0);
    public static final ScaleTwoDecimal ONE_HUNDRED = new ScaleTwoDecimal(100);
    /**
     * This constructor should never be called except during JAXB unmarshalling.
     */
    private ScaleTwoDecimal() {
        super();
    }

    public ScaleTwoDecimal(String value) {
        super(value, SCALE);
    }

    public ScaleTwoDecimal(int value) {
        super(value, SCALE);
    }

    public ScaleTwoDecimal(double value) {
        super(value, SCALE);
    }

    public ScaleTwoDecimal(BigDecimal value) {
        super(value, SCALE);
    }

    private ScaleTwoDecimal(String value, int scale) {
        super(value, scale);
    }

    private ScaleTwoDecimal(int value, int scale) {
        super(value, scale);
    }

    private ScaleTwoDecimal(double value, int scale) {
        super(value, scale);
    }

    private ScaleTwoDecimal(BigDecimal value, int scale) {
        super(value, scale);
    }

    @Override
    protected ScaleTwoDecimal newInstance(int value) {
        return new ScaleTwoDecimal(value);
    }

    @Override
    protected ScaleTwoDecimal newInstance(BigDecimal value, int scale) {
        return new ScaleTwoDecimal(value, scale);
    }

    @Override
    protected ScaleTwoDecimal zero() {
        return ZERO;
    }

    @Override
    protected ScaleTwoDecimal oneHundred() {return ONE_HUNDRED; }

    /**
     * return {@link #ZERO} if the object is null
     * @param value the passed in value or {@link #ZERO}
     */
    public static ScaleTwoDecimal returnZeroIfNull(ScaleTwoDecimal value){
        return value==null ? ScaleTwoDecimal.ZERO : value;
    }
}
