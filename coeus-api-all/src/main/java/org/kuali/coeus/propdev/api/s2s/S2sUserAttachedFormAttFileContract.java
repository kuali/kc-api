
package org.kuali.coeus.propdev.api.s2s;

import org.kuali.coeus.sys.api.model.IdentifiableNumeric;

public interface S2sUserAttachedFormAttFileContract extends IdentifiableNumeric {
	
    Long getS2sUserAttachedFormAttId();
    
    byte[] getAttachment();
}
