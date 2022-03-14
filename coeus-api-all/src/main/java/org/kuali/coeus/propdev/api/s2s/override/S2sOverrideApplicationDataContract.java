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

package org.kuali.coeus.propdev.api.s2s.override;

import org.kuali.coeus.sys.api.model.Identifiable;
import org.kuali.coeus.sys.api.model.KcFile;
import org.kuali.coeus.sys.api.model.Sha1Hashable;

import java.util.List;

public interface S2sOverrideApplicationDataContract  extends Identifiable, KcFile, Sha1Hashable {
    String getApplication();
    List<? extends S2sOverrideAttachmentContract> getAttachments();
}
