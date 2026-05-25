/*
 *  Copyright 2017 Marcelo Grossi
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0*
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.github.magrossi.log4j2.elasticsearch;

import org.apache.http.HttpHost;
import org.apache.logging.log4j.core.config.Node;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginBuilderAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginBuilderFactory;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.ValidHost;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.ValidPort;
import java.net.InetAddress;

/**
 * Plugin to hold an http address.
 *
 * @see HttpHost
 */
@SuppressWarnings("WeakerAccess")
@Plugin(name = "HttpAddress", category = Node.CATEGORY, printObject = true)
public class HttpAddress {

    private HttpHost httpHost;

    private HttpAddress(final InetAddress host, final int port, final String scheme) {
        this.httpHost = new HttpHost(host, port, scheme);
    }

    public HttpHost getHttpHost() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @PluginBuilderFactory
    public static Builder newBuilder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class Builder implements org.apache.logging.log4j.core.util.Builder<HttpAddress> {

        @PluginBuilderAttribute
        private String scheme = "http";

        @PluginBuilderAttribute
        @ValidHost
        @Required(message = "Host address is required")
        private InetAddress host = InetAddress.getLoopbackAddress();

        @PluginBuilderAttribute
        @ValidPort
        private int port = 9200;

        public Builder withScheme(final String scheme) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder withHost(final InetAddress host) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder withPort(final int port) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public HttpAddress build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
