/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.olingo.odata2.core.uri;

import org.apache.olingo.odata2.api.edm.EdmProperty;
import org.apache.olingo.odata2.api.uri.KeyPredicate;

/**
 *  
 */
public class KeyPredicateImpl implements KeyPredicate {

  public KeyPredicateImpl(final String literal, final EdmProperty property) {
    super();
    this.literal = literal;
    this.property = property;
  }

  private String literal;
  private EdmProperty property;

  @Override
  public String getLiteral() {
    return literal;
  }

  public void setValue(final String value) {
    literal = value;
  }

  @Override
  public EdmProperty getProperty() {
    return property;
  }

  public void setProperty(final EdmProperty property) {
    this.property = property;
  }

  @Override
  public String toString() {
    return "KeyPredicate: literal=" + literal + ", propertyName=" + property;
  }

}
