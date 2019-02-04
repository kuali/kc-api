
package org.kuali.coeus.common.api.custom.attr;

import org.kuali.coeus.sys.api.model.DocumentNumbered;
import org.kuali.coeus.sys.api.model.IdentifiableNumeric;

public interface CustomAttributeDocValueContract extends IdentifiableNumeric, DocumentNumbered {

    String getValue();
    CustomAttributeContract getCustomAttribute();
}
