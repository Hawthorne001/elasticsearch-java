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

package co.elastic.clients.elasticsearch.cluster.stats;

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
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

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

// typedef: cluster.stats.SparseVectorStats

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.SparseVectorStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class SparseVectorStats implements JsonpSerializable {
	private final long valueCount;

	// ---------------------------------------------------------------------------------------------

	private SparseVectorStats(Builder builder) {

		this.valueCount = ApiTypeHelper.requireNonNull(builder.valueCount, this, "valueCount", 0);

	}

	public static SparseVectorStats of(Function<Builder, ObjectBuilder<SparseVectorStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code value_count}
	 */
	public final long valueCount() {
		return this.valueCount;
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

		generator.writeKey("value_count");
		generator.write(this.valueCount);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SparseVectorStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SparseVectorStats> {
		private Long valueCount;

		/**
		 * Required - API name: {@code value_count}
		 */
		public final Builder valueCount(long value) {
			this.valueCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SparseVectorStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SparseVectorStats build() {
			_checkSingleUse();

			return new SparseVectorStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SparseVectorStats}
	 */
	public static final JsonpDeserializer<SparseVectorStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SparseVectorStats::setupSparseVectorStatsDeserializer);

	protected static void setupSparseVectorStatsDeserializer(ObjectDeserializer<SparseVectorStats.Builder> op) {

		op.add(Builder::valueCount, JsonpDeserializer.longDeserializer(), "value_count");

	}

}
