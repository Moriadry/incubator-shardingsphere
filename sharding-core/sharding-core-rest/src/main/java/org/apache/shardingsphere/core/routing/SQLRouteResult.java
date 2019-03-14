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

package org.apache.shardingsphere.core.routing;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.core.optimizer.GeneratedKey;
import org.apache.shardingsphere.core.parse.parser.sql.SQLStatement;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * SQL route result.
 * 
 * @author gaohongtao
 * @author zhangliang
 * @author zhaojun
 */
@RequiredArgsConstructor
@Getter
public final class SQLRouteResult {
    
    private final SQLStatement sqlStatement;
    
    private final GeneratedKey generatedKey;
    
    private final Collection<RouteUnit> routeUnits = new LinkedHashSet<>();
    
    public SQLRouteResult(final SQLStatement sqlStatement) {
        this(sqlStatement, null);
    }
}
