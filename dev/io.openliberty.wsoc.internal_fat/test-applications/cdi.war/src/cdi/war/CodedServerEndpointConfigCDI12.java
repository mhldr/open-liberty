/*******************************************************************************
 * Copyright (c) 2015 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package cdi.war;

import java.util.List;
import java.util.Map;

import javax.websocket.Decoder;
import javax.websocket.Encoder;
import javax.websocket.Extension;
import javax.websocket.server.ServerEndpointConfig;

public class CodedServerEndpointConfigCDI12 implements ServerEndpointConfig {

    public CodedServerEndpointConfigCDI12() {}

    @Override
    public String getPath() {
        return "/ProgrammaticExtendEndpointCDI12";
    }

    @Override
    public Class<?> getEndpointClass() {

        Class<?> cl = ProgrammaticExtendCDIServerCDI12EP.class;
        return cl;
    }

    @Override
    public List<Class<? extends Decoder>> getDecoders() {
        return null;
    }

    @Override
    public List<Class<? extends Encoder>> getEncoders() {
        return null;
    }

    @Override
    public Map<String, Object> getUserProperties() {
        return null;
    }

    @Override
    public Configurator getConfigurator() {
        ServerEndpointConfig.Configurator x = new ServerEndpointConfig.Configurator();
        return x;
    }

    @Override
    public List<Extension> getExtensions() {
        return null;
    }

    @Override
    public List<String> getSubprotocols() {
        return null;
    }

}
