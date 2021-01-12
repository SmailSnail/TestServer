/*
 * Copyright (C) 2020 xuexiangjys(xuexiangjys@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.xuexiang.server.api.response;

import com.xuexiang.server.model.User;

/**
 * 登录信息
 *
 * @author xuexiang
 * @since 2018/8/6 下午6:14
 */
public class LoginInfo {

    private User user;

    private String token;

    public User getUser() {
        return user;
    }

    public LoginInfo setUser(User user) {
        this.user = user;
        return this;
    }

    public String getToken() {
        return token;
    }

    public LoginInfo setToken(String token) {
        this.token = token;
        return this;
    }
}

