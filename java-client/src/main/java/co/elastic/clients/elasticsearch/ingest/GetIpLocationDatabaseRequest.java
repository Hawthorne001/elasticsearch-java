/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: ingest.get_ip_location_database.Request

/**
 * Get IP geolocation database configurations.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ingest.get_ip_location_database.Request">API
 *      specification</a>
 */

public class GetIpLocationDatabaseRequest extends RequestBase {
	private final List<String> id;

	// ---------------------------------------------------------------------------------------------

	private GetIpLocationDatabaseRequest(Builder builder) {

		this.id = ApiTypeHelper.unmodifiable(builder.id);

	}

	public static GetIpLocationDatabaseRequest of(Function<Builder, ObjectBuilder<GetIpLocationDatabaseRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Comma-separated list of database configuration IDs to retrieve. Wildcard
	 * (<code>*</code>) expressions are supported. To get all database
	 * configurations, omit this parameter or use <code>*</code>.
	 * <p>
	 * API name: {@code id}
	 */
	public final List<String> id() {
		return this.id;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetIpLocationDatabaseRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetIpLocationDatabaseRequest> {
		@Nullable
		private List<String> id;

		/**
		 * Comma-separated list of database configuration IDs to retrieve. Wildcard
		 * (<code>*</code>) expressions are supported. To get all database
		 * configurations, omit this parameter or use <code>*</code>.
		 * <p>
		 * API name: {@code id}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>id</code>.
		 */
		public final Builder id(List<String> list) {
			this.id = _listAddAll(this.id, list);
			return this;
		}

		/**
		 * Comma-separated list of database configuration IDs to retrieve. Wildcard
		 * (<code>*</code>) expressions are supported. To get all database
		 * configurations, omit this parameter or use <code>*</code>.
		 * <p>
		 * API name: {@code id}
		 * <p>
		 * Adds one or more values to <code>id</code>.
		 */
		public final Builder id(String value, String... values) {
			this.id = _listAdd(this.id, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetIpLocationDatabaseRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetIpLocationDatabaseRequest build() {
			_checkSingleUse();

			return new GetIpLocationDatabaseRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ingest.get_ip_location_database}".
	 */
	public static final Endpoint<GetIpLocationDatabaseRequest, GetIpLocationDatabaseResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ingest.get_ip_location_database",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.id()))
					propsSet |= _id;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ingest");
					buf.append("/ip_location");
					buf.append("/database");
					return buf.toString();
				}
				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ingest");
					buf.append("/ip_location");
					buf.append("/database");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _id = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.id()))
					propsSet |= _id;

				if (propsSet == 0) {
				}
				if (propsSet == (_id)) {
					params.put("id", request.id.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, GetIpLocationDatabaseResponse._DESERIALIZER);
}
