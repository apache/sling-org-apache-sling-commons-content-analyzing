/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.sling.commons.content.analyzing;

import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.osgi.annotation.versioning.ProviderType;

/**
 * Service for analyzing content.
 */
@ProviderType
public interface ContentAnalyzer {

    /**
     * @param input      the stream from which the content is read for analyzing
     * @param parameters the parameters for the analyzing operation
     * @param report     the report to which the findings of the analyzing operation are added
     * @return {@link java.util.concurrent.CompletableFuture} for signaling completion
     */
    @NotNull CompletableFuture<Void> analyze(@NotNull final InputStream input, @Nullable final Map<String, Object> parameters, @NotNull final Map<String, Object> report);

}
