/*******************************************************************************
 * Copyright (c) 2011, 2012 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SAP AG - initial API and implementation
 *******************************************************************************/
package org.eclipse.tycho.core.facade;

import java.io.File;
import java.util.Properties;

public class MavenContextImpl implements MavenContext {

    private File localRepositoryRoot;
    private MavenLogger mavenLogger;
    private boolean offline;
    private Properties mergedProperties;

    public MavenContextImpl(File localRepositoryRoot, boolean offline, MavenLogger mavenLogger,
            Properties mergedProperties) {
        this.localRepositoryRoot = localRepositoryRoot;
        this.offline = offline;
        this.mavenLogger = mavenLogger;
        this.mergedProperties = mergedProperties;
    }

    public File getLocalRepositoryRoot() {
        return localRepositoryRoot;
    }

    public MavenLogger getLogger() {
        return mavenLogger;
    }

    public boolean isOffline() {
        return offline;
    }

    public Properties getMergedProperties() {
        return mergedProperties;
    }

}
