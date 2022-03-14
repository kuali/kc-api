/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2022 Kuali, Inc. - All Rights Reserved
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */

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
