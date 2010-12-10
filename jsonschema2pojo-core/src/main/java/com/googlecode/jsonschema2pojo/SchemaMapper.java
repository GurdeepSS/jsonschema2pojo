/**
 * Copyright © 2010 Nokia
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.googlecode.jsonschema2pojo;

import java.io.IOException;
import java.io.InputStream;

import com.googlecode.jsonschema2pojo.rules.ArrayRule;
import com.googlecode.jsonschema2pojo.rules.DescriptionRule;
import com.googlecode.jsonschema2pojo.rules.EnumRule;
import com.googlecode.jsonschema2pojo.rules.ObjectRule;
import com.googlecode.jsonschema2pojo.rules.OptionalRule;
import com.googlecode.jsonschema2pojo.rules.PropertiesRule;
import com.googlecode.jsonschema2pojo.rules.PropertyRule;
import com.googlecode.jsonschema2pojo.rules.TypeRule;
import com.sun.codemodel.JCodeModel;

/**
 * Generates Java types from a JSON schema
 */
public interface SchemaMapper {

    /**
     * Reads a schema and adds generated types to the given code model.
     * 
     * @param codeModel
     *            the java code-generation context that should be used to
     *            generated new types
     * @param className
     *            the name of the parent class the represented by this schema
     * @param packageName
     *            the target package that should be used for generated types
     * @param schemaContent
     *            the schema document content
     * @throws IOException
     *             if the schema content cannot be read
     */
    void generate(JCodeModel codeModel, String className, String packageName, InputStream schemaContent) throws IOException;

    ArrayRule getArrayRule();

    DescriptionRule getDescriptionRule();

    EnumRule getEnumRule();

    ObjectRule getObjectRule();

    OptionalRule getOptionalRule();

    PropertiesRule getPropertiesRule();

    PropertyRule getPropertyRule();

    TypeRule getTypeRule();

}