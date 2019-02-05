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

package org.kuali.coeus.common.api.ynq;

import org.kuali.coeus.sys.api.model.Describable;

public interface YnqExplanationTypeContract extends Describable {
    String getExplanationType();
}
