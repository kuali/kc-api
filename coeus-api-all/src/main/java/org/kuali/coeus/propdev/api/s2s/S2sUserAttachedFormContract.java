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

package org.kuali.coeus.propdev.api.s2s;

import org.kuali.coeus.propdev.api.core.NumberedProposal;
import org.kuali.coeus.sys.api.model.Describable;
import org.kuali.coeus.sys.api.model.IdentifiableNumeric;

import java.util.List;

public interface S2sUserAttachedFormContract extends IdentifiableNumeric, NumberedProposal, Describable {
    
    String getNamespace();
    
    String getFormName();
    
    String getFormFileName();


    List<? extends S2sUserAttachedFormAttContract> getS2sUserAttachedFormAtts();

	List<? extends S2sUserAttachedFormFileContract> getS2sUserAttachedFormFileList();

}
