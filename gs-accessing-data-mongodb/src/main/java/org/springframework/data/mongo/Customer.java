/*
 * Copyright 2012-2013 the original author or authors.
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

package org.springframework.data.mongo;

import org.springframework.data.annotation.Id;


public class Customer {

	@Id
	private String id;

	private String firstName;
	private String lastName;
	private String type;
	private int mobile;
	public Customer() {
	}

	public Customer(String firstName, String lastName, String type,int mobile) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.type = type;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%s, firstName='%s', lastName='%s']", id,
				firstName, lastName);
	}

}