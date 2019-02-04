
package org.kuali.coeus.common.api.custom.attr;


import org.kuali.coeus.sys.api.model.IdentifiableNumeric;
import org.kuali.coeus.sys.api.model.Named;

public interface CustomAttributeContract extends IdentifiableNumeric, Named {

    Integer getDataLength();
    String getDataTypeCode();
    String getDefaultValue();
    String getGroupName();
    String getLabel();
    String getLookupClass();
    String getLookupReturn();
    CustomAttributeDataTypeContract getCustomAttributeDataType();

}
