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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.nodes.info;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoIngestInfo
@JsonpDeserializable
public final class NodeInfoIngestInfo implements JsonpSerializable {
	private final NodeInfoIngestDownloader downloader;

	// ---------------------------------------------------------------------------------------------

	public NodeInfoIngestInfo(Builder builder) {

		this.downloader = Objects.requireNonNull(builder.downloader, "downloader");

	}

	public NodeInfoIngestInfo(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code downloader}
	 */
	public NodeInfoIngestDownloader downloader() {
		return this.downloader;
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

		generator.writeKey("downloader");
		this.downloader.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoIngestInfo}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoIngestInfo> {
		private NodeInfoIngestDownloader downloader;

		/**
		 * API name: {@code downloader}
		 */
		public Builder downloader(NodeInfoIngestDownloader value) {
			this.downloader = value;
			return this;
		}

		/**
		 * API name: {@code downloader}
		 */
		public Builder downloader(
				Function<NodeInfoIngestDownloader.Builder, ObjectBuilder<NodeInfoIngestDownloader>> fn) {
			return this.downloader(fn.apply(new NodeInfoIngestDownloader.Builder()).build());
		}

		/**
		 * Builds a {@link NodeInfoIngestInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoIngestInfo build() {

			return new NodeInfoIngestInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoIngestInfo}
	 */
	public static final JsonpDeserializer<NodeInfoIngestInfo> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoIngestInfo::setupNodeInfoIngestInfoDeserializer, Builder::build);

	protected static void setupNodeInfoIngestInfoDeserializer(DelegatingDeserializer<NodeInfoIngestInfo.Builder> op) {

		op.add(Builder::downloader, NodeInfoIngestDownloader._DESERIALIZER, "downloader");

	}

}
