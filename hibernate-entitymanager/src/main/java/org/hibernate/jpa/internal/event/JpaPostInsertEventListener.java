/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2009-2011, Red Hat Inc. or third-party contributors as
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
package org.hibernate.jpa.internal.event;

import org.hibernate.event.spi.PostInsertEvent;
import org.hibernate.event.spi.PostInsertEventListener;

/**
 * @author <a href="mailto:kabir.khan@jboss.org">Kabir Khan</a>
 */
public class JpaPostInsertEventListener implements PostInsertEventListener, CallbackHandlerConsumer {
	EntityCallbackHandler callbackHandler;

	@Override
	public void setCallbackHandler(EntityCallbackHandler callbackHandler) {
		this.callbackHandler = callbackHandler;
	}

	public JpaPostInsertEventListener() {
		super();
	}

	public JpaPostInsertEventListener(EntityCallbackHandler callbackHandler) {
		this.callbackHandler = callbackHandler;
	}

	@Override
	public void onPostInsert(PostInsertEvent event) {
		Object entity = event.getEntity();
		callbackHandler.postCreate( entity );
	}
}
