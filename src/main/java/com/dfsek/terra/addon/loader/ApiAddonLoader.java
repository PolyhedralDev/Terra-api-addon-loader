/*
 * Copyright (c) 2020-2021 Polyhedral Development
 *
 * The Terra Core Addons are licensed under the terms of the MIT License. For more details,
 * reference the LICENSE file in this module's root directory.
 */

package com.dfsek.terra.addon.loader;

import java.nio.file.Path;
import java.util.Collections;

import ca.solostudios.strata.Versions;
import ca.solostudios.strata.version.Version;

import com.dfsek.terra.api.addon.BaseAddon;
import com.dfsek.terra.api.addon.bootstrap.BootstrapBaseAddon;


public class ApiAddonLoader implements BootstrapBaseAddon<BaseAddon> {
    private static final Version VERSION = Versions.getVersion(1, 0, 0);
    @Override
    public Iterable<BaseAddon> loadAddons(Path addonsFolder, ClassLoader parent) {
        return Collections.emptySet();
    }
    
    @Override
    public String getID() {
        return "API";
    }
    
    @Override
    public Version getVersion() {
        return VERSION;
    }
}
