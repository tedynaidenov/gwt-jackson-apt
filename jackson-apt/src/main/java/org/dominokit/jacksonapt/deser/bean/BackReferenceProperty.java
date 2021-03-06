/*
 * Copyright 2013 Nicolas Morel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dominokit.jacksonapt.deser.bean;

import org.dominokit.jacksonapt.JsonDeserializationContext;

/**
 * <p>BackReferenceProperty interface.</p>
 *
 * @author Nicolas Morel
 * @version $Id: $
 */
public interface BackReferenceProperty<T, R> {

    /**
     * <p>setBackReference</p>
     *
     * @param value     a T object.
     * @param reference a R object.
     * @param ctx       a {@link org.dominokit.jacksonapt.JsonDeserializationContext} object.
     */
    void setBackReference(T value, R reference, JsonDeserializationContext ctx);
}
