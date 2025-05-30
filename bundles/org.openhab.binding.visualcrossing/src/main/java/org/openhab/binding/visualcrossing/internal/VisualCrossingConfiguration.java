/*
 * Copyright (c) 2010-2025 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.visualcrossing.internal;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;

/**
 * The {@link VisualCrossingConfiguration} class contains fields mapping thing configuration parameters.
 *
 * @author Martin Grzeslowski - Initial contribution
 */
@NonNullByDefault
public class VisualCrossingConfiguration {
    @Nullable
    public String apiKey;
    @Nullable
    public String location;
    @Nullable
    public String lang;
    public String hostname = "https://weather.visualcrossing.com";
    public int refreshInterval = 3600;
    public int httpRetries = 3;
}
