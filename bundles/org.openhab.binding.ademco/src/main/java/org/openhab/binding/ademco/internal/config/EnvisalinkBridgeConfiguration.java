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
package org.openhab.binding.ademco.internal.config;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * The {@link EnvisalinkBridgeConfiguration} class contains fields mapping thing configuration parameters.
 * 
 * @author WeeMin Chan - Initial contribution
 */

@NonNullByDefault
public class EnvisalinkBridgeConfiguration {

    public final static String IP_ADDRESS = "ipAddress";
    /**
     * The IP address of the Envisalink Ethernet TCP interface
     */
    public String ipAddress = "";

    /**
     * The port number of the Envisalink Ethernet TCP interface
     */
    public Integer port = 4025;

    /**
     * The password of the Envisalink Ethernet TCP interface
     */
    public String password = "";

    /**
     * The Socket connection timeout for the Envisalink Ethernet TCP interface
     */
    public Integer connectionTimeout = 5000;

    /**
     * The Panel Poll Period. Can be set in range 1-15 minutes. Default is 1 minute;
     */

    public Integer pollPeriod = 1;
}
