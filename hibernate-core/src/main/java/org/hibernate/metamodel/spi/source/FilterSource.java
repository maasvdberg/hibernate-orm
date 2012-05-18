/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2012, Red Hat Inc. or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Inc.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.hibernate.metamodel.spi.source;

/**
 * Defines the source of filter information.  May have an associated {@link FilterDefinitionSource}.
 * Relates to both {@code <filter/>} and {@link org.hibernate.annotations.Filter @Filter}
 *
 * @author Steve Ebersole
 */
public interface FilterSource {
	/**
	 * Get the name of the filter being described.
	 *
	 * @return The name.
	 */
	public String getName();

	/**
	 * Get the condition associated with the filter.  Can be {@code null} in the case of a filter described
	 * further by a "filter def" which contains the condition text.
	 *
	 * @return The condition defined on the filter.
	 *
	 * @see {@link FilterDefinitionSource#getCondition()}
	 */
	public String getCondition();
}