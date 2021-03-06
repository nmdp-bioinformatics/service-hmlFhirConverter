package org.nmdp.hmlfhirconverter.service.base;

/**
 * Created by Andrew S. Brown, Ph.D., <abrown3@nmdp.org>, on 1/25/17.
 * <p>
 * service-hmlFhirConverter
 * Copyright (c) 2012-2017 National Marrow Donor Program (NMDP)
 * <p>
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation; either version 3 of the License, or (at
 * your option) any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; with out even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public
 * License for more details.
 * <p>
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library;  if not, write to the Free Software Foundation,
 * Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307  USA.
 * <p>
 * > http://www.fsf.org/licensing/licenses/lgpl.html
 * > http://www.opensource.org/licenses/lgpl-license.php
 */

import org.nmdp.hmlfhirconvertermodels.dto.TypeaheadQuery;

import org.springframework.data.domain.Page;

import java.util.List;

public interface IMongoCrudRepositoryService<T, U> {
    T getById(String id);
    Page<T> findByMaxReturn(Integer maxResults, Integer pageNumber);
    List<T> getTypeaheadItems(Integer maxResults, TypeaheadQuery typeaheadQuery);
    List<T> createItems(List<U> items);
    T updateItem(U item);
    Boolean deleteItem(String id);
    Boolean deleteItem(U item);
}
