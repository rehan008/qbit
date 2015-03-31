/*
 * Copyright (c) 2015. Rick Hightower, Geoff Chandler
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * QBit - The Microservice lib for Java : JSON, WebSocket, REST. Be The Web!
 */
package io.advantageous.qbit.meta;

import io.advantageous.boon.core.Lists;

import java.util.Collections;
import java.util.List;

public class ContextMeta {

    public static ContextMeta context(final String rootURI, final ServiceMeta... services) {
        return new ContextMeta(rootURI, Lists.list(services));
    }

    private final String rootURI;
    private final List<ServiceMeta> services;


    public ContextMeta(final String rootURI, final List<ServiceMeta> services) {
        this.rootURI = rootURI;
        this.services = Collections.unmodifiableList(services);
    }

    public String getRootURI() {
        return rootURI;
    }

    public List<ServiceMeta> getServices() {
        return services;
    }
}
