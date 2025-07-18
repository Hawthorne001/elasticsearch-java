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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch.indices.get_data_stream_options.DataStreamWithOptions;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
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

// typedef: indices.get_data_stream_options.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices.get_data_stream_options.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetDataStreamOptionsResponse implements JsonpSerializable {
	private final List<DataStreamWithOptions> dataStreams;

	// ---------------------------------------------------------------------------------------------

	private GetDataStreamOptionsResponse(Builder builder) {

		this.dataStreams = ApiTypeHelper.unmodifiableRequired(builder.dataStreams, this, "dataStreams");

	}

	public static GetDataStreamOptionsResponse of(Function<Builder, ObjectBuilder<GetDataStreamOptionsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code data_streams}
	 */
	public final List<DataStreamWithOptions> dataStreams() {
		return this.dataStreams;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (ApiTypeHelper.isDefined(this.dataStreams)) {
			generator.writeKey("data_streams");
			generator.writeStartArray();
			for (DataStreamWithOptions item0 : this.dataStreams) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetDataStreamOptionsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetDataStreamOptionsResponse> {
		private List<DataStreamWithOptions> dataStreams;

		/**
		 * Required - API name: {@code data_streams}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>dataStreams</code>.
		 */
		public final Builder dataStreams(List<DataStreamWithOptions> list) {
			this.dataStreams = _listAddAll(this.dataStreams, list);
			return this;
		}

		/**
		 * Required - API name: {@code data_streams}
		 * <p>
		 * Adds one or more values to <code>dataStreams</code>.
		 */
		public final Builder dataStreams(DataStreamWithOptions value, DataStreamWithOptions... values) {
			this.dataStreams = _listAdd(this.dataStreams, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code data_streams}
		 * <p>
		 * Adds a value to <code>dataStreams</code> using a builder lambda.
		 */
		public final Builder dataStreams(
				Function<DataStreamWithOptions.Builder, ObjectBuilder<DataStreamWithOptions>> fn) {
			return dataStreams(fn.apply(new DataStreamWithOptions.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetDataStreamOptionsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetDataStreamOptionsResponse build() {
			_checkSingleUse();

			return new GetDataStreamOptionsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetDataStreamOptionsResponse}
	 */
	public static final JsonpDeserializer<GetDataStreamOptionsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetDataStreamOptionsResponse::setupGetDataStreamOptionsResponseDeserializer);

	protected static void setupGetDataStreamOptionsResponseDeserializer(
			ObjectDeserializer<GetDataStreamOptionsResponse.Builder> op) {

		op.add(Builder::dataStreams, JsonpDeserializer.arrayDeserializer(DataStreamWithOptions._DESERIALIZER),
				"data_streams");

	}

}
