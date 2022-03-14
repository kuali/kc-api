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

package org.kuali.coeus.propdev.api.location;

import org.kuali.coeus.common.api.address.Addressable;
import org.kuali.coeus.common.api.org.OrganizationContract;
import org.kuali.coeus.common.api.rolodex.RolodexContract;
import org.kuali.coeus.propdev.api.core.NumberedProposal;

import java.util.List;

public interface ProposalSiteContract extends NumberedProposal, Addressable {

    Integer getSiteNumber();

    String getLocationName();

    Integer getLocationTypeCode();

    OrganizationContract getOrganization();

    RolodexContract getRolodex();

    List<? extends CongressionalDistrictContract> getCongressionalDistricts();

    String getFirstCongressionalDistrictName();

}
