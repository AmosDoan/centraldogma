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

package com.linecorp.centraldogma.server.internal.admin.decorator;

import javax.annotation.Nullable;

import com.linecorp.centraldogma.server.internal.admin.authentication.User;
import com.linecorp.centraldogma.server.internal.admin.model.ProjectRole;

/**
 * A decorator for access control. It only allows a request from an administrator and a user who has
 * a {@link ProjectRole#OWNER} role.
 */
public class ProjectOwnersOnly extends ProjectAccessController {

    @Override
    protected boolean isAllowedRole(User user, @Nullable ProjectRole projectRole) {
        return user == User.ADMIN || projectRole == ProjectRole.OWNER;
    }
}
