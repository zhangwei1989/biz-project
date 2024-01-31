/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.apache.biz.web.mvc.controller;

import com.apache.biz.api.ApiRequest;
import com.apache.biz.api.ApiResponse;
import com.apache.biz.api.interfaces.UserRegistrationRestService;
import com.apache.biz.api.model.User;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

/**
 * @author
 * @since
 */
@RestController
public class UserRegistrationRestController implements UserRegistrationRestService {

    @Override
    public ApiResponse<Boolean> registerUser(@RequestBody @Validated User user) {
        return ApiResponse.ok(Boolean.TRUE);
    }

    @Override
    public ApiResponse<Boolean> registerUser(@RequestBody @Validated ApiRequest<User> userRequest) {
        return ApiResponse.ok(Boolean.TRUE);
    }

}
