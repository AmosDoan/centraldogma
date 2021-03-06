/*
 * Copyright 2017 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.linecorp.centraldogma.common;

/**
 * A {@link RuntimeException} that is raised when the syntax validation or the evaluation of a {@link Query}
 * has failed.
 */
public class QueryException extends RuntimeException {

    private static final long serialVersionUID = -432784402820790354L;

    /**
     * Creates a new instance.
     */
    public QueryException() {}

    /**
     * Creates a new instance.
     */
    public QueryException(String message) {
        super(message);
    }

    /**
     * Creates a new instance.
     */
    public QueryException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Creates a new instance.
     */
    public QueryException(Throwable cause) {
        super(cause);
    }

    /**
     * Creates a new instance.
     */
    protected QueryException(String message, Throwable cause, boolean enableSuppression,
                             boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
