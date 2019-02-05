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

package org.kuali.coeus.propdev.api.s2s;

import java.util.List;

import org.kuali.coeus.propdev.api.core.NumberedProposal;
import org.kuali.coeus.sys.api.model.IdentifiableNumeric;
import org.kuali.coeus.sys.api.model.KcFile;

public interface S2sUserAttachedFormAttContract extends IdentifiableNumeric, KcFile, NumberedProposal {

    Long getS2sUserAttachedFormId();

    String getContentId();

	List<? extends S2sUserAttachedFormAttFileContract> getS2sUserAttachedFormAttFiles();
}
