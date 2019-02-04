
package org.kuali.coeus.propdev.api.s2s;

import org.kuali.coeus.sys.api.model.IdentifiableNumeric;

public interface S2sUserAttachedFormFileContract extends IdentifiableNumeric {

	Long getS2sUserAttachedFormId();
	
	byte[] getFormFile();
	
	String getXmlFile();
}
