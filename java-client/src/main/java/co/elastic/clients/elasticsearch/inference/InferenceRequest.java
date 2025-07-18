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

package co.elastic.clients.elasticsearch.inference;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

// typedef: inference.inference.Request

/**
 * Perform inference on the service.
 * <p>
 * This API enables you to use machine learning models to perform specific tasks
 * on data that you provide as an input. It returns a response with the results
 * of the tasks. The inference endpoint you use can perform one specific task
 * that has been defined when the endpoint was created with the create inference
 * API.
 * <p>
 * For details about using this API with a service, such as Amazon Bedrock,
 * Anthropic, or HuggingFace, refer to the service-specific documentation.
 * <blockquote>
 * <p>
 * info The inference APIs enable you to use certain services, such as built-in
 * machine learning models (ELSER, E5), models uploaded through Eland, Cohere,
 * OpenAI, Azure, Google AI Studio, Google Vertex AI, Anthropic, Watsonx.ai, or
 * Hugging Face. For built-in models and models uploaded through Eland, the
 * inference APIs offer an alternative way to use and manage trained models.
 * However, if you do not plan to use the inference APIs to use these models or
 * if you want to use non-NLP models, use the machine learning trained model
 * APIs.
 * </p>
 * </blockquote>
 *
 * @see <a href="../doc-files/api-spec.html#inference.inference.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class InferenceRequest extends RequestBase implements JsonpSerializable {
	private final String inferenceId;

	private final List<String> input;

	@Nullable
	private final String inputType;

	@Nullable
	private final String query;

	@Nullable
	private final JsonData taskSettings;

	@Nullable
	private final TaskType taskType;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private InferenceRequest(Builder builder) {

		this.inferenceId = ApiTypeHelper.requireNonNull(builder.inferenceId, this, "inferenceId");
		this.input = ApiTypeHelper.unmodifiableRequired(builder.input, this, "input");
		this.inputType = builder.inputType;
		this.query = builder.query;
		this.taskSettings = builder.taskSettings;
		this.taskType = builder.taskType;
		this.timeout = builder.timeout;

	}

	public static InferenceRequest of(Function<Builder, ObjectBuilder<InferenceRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The unique identifier for the inference endpoint.
	 * <p>
	 * API name: {@code inference_id}
	 */
	public final String inferenceId() {
		return this.inferenceId;
	}

	/**
	 * Required - The text on which you want to perform the inference task. It can
	 * be a single string or an array. <blockquote>
	 * <p>
	 * info Inference endpoints for the <code>completion</code> task type currently
	 * only support a single string as input.
	 * </p>
	 * </blockquote>
	 * <p>
	 * API name: {@code input}
	 */
	public final List<String> input() {
		return this.input;
	}

	/**
	 * Specifies the input data type for the text embedding model. The
	 * <code>input_type</code> parameter only applies to Inference Endpoints with
	 * the <code>text_embedding</code> task type. Possible values include:
	 * <ul>
	 * <li><code>SEARCH</code></li>
	 * <li><code>INGEST</code></li>
	 * <li><code>CLASSIFICATION</code></li>
	 * <li><code>CLUSTERING</code> Not all services support all values. Unsupported
	 * values will trigger a validation exception. Accepted values depend on the
	 * configured inference service, refer to the relevant service-specific
	 * documentation for more info.</li>
	 * </ul>
	 * <blockquote>
	 * <p>
	 * info The <code>input_type</code> parameter specified on the root level of the
	 * request body will take precedence over the <code>input_type</code> parameter
	 * specified in <code>task_settings</code>.
	 * </p>
	 * </blockquote>
	 * <p>
	 * API name: {@code input_type}
	 */
	@Nullable
	public final String inputType() {
		return this.inputType;
	}

	/**
	 * The query input, which is required only for the <code>rerank</code> task. It
	 * is not required for other tasks.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final String query() {
		return this.query;
	}

	/**
	 * Task settings for the individual inference request. These settings are
	 * specific to the task type you specified and override the task settings
	 * specified when initializing the service.
	 * <p>
	 * API name: {@code task_settings}
	 */
	@Nullable
	public final JsonData taskSettings() {
		return this.taskSettings;
	}

	/**
	 * The type of inference task that the model performs.
	 * <p>
	 * API name: {@code task_type}
	 */
	@Nullable
	public final TaskType taskType() {
		return this.taskType;
	}

	/**
	 * The amount of time to wait for the inference request to complete.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
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

		if (ApiTypeHelper.isDefined(this.input)) {
			generator.writeKey("input");
			generator.writeStartArray();
			for (String item0 : this.input) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.inputType != null) {
			generator.writeKey("input_type");
			generator.write(this.inputType);

		}
		if (this.query != null) {
			generator.writeKey("query");
			generator.write(this.query);

		}
		if (this.taskSettings != null) {
			generator.writeKey("task_settings");
			this.taskSettings.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InferenceRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<InferenceRequest> {
		private String inferenceId;

		private List<String> input;

		@Nullable
		private String inputType;

		@Nullable
		private String query;

		@Nullable
		private JsonData taskSettings;

		@Nullable
		private TaskType taskType;

		@Nullable
		private Time timeout;

		/**
		 * Required - The unique identifier for the inference endpoint.
		 * <p>
		 * API name: {@code inference_id}
		 */
		public final Builder inferenceId(String value) {
			this.inferenceId = value;
			return this;
		}

		/**
		 * Required - The text on which you want to perform the inference task. It can
		 * be a single string or an array. <blockquote>
		 * <p>
		 * info Inference endpoints for the <code>completion</code> task type currently
		 * only support a single string as input.
		 * </p>
		 * </blockquote>
		 * <p>
		 * API name: {@code input}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>input</code>.
		 */
		public final Builder input(List<String> list) {
			this.input = _listAddAll(this.input, list);
			return this;
		}

		/**
		 * Required - The text on which you want to perform the inference task. It can
		 * be a single string or an array. <blockquote>
		 * <p>
		 * info Inference endpoints for the <code>completion</code> task type currently
		 * only support a single string as input.
		 * </p>
		 * </blockquote>
		 * <p>
		 * API name: {@code input}
		 * <p>
		 * Adds one or more values to <code>input</code>.
		 */
		public final Builder input(String value, String... values) {
			this.input = _listAdd(this.input, value, values);
			return this;
		}

		/**
		 * Specifies the input data type for the text embedding model. The
		 * <code>input_type</code> parameter only applies to Inference Endpoints with
		 * the <code>text_embedding</code> task type. Possible values include:
		 * <ul>
		 * <li><code>SEARCH</code></li>
		 * <li><code>INGEST</code></li>
		 * <li><code>CLASSIFICATION</code></li>
		 * <li><code>CLUSTERING</code> Not all services support all values. Unsupported
		 * values will trigger a validation exception. Accepted values depend on the
		 * configured inference service, refer to the relevant service-specific
		 * documentation for more info.</li>
		 * </ul>
		 * <blockquote>
		 * <p>
		 * info The <code>input_type</code> parameter specified on the root level of the
		 * request body will take precedence over the <code>input_type</code> parameter
		 * specified in <code>task_settings</code>.
		 * </p>
		 * </blockquote>
		 * <p>
		 * API name: {@code input_type}
		 */
		public final Builder inputType(@Nullable String value) {
			this.inputType = value;
			return this;
		}

		/**
		 * The query input, which is required only for the <code>rerank</code> task. It
		 * is not required for other tasks.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable String value) {
			this.query = value;
			return this;
		}

		/**
		 * Task settings for the individual inference request. These settings are
		 * specific to the task type you specified and override the task settings
		 * specified when initializing the service.
		 * <p>
		 * API name: {@code task_settings}
		 */
		public final Builder taskSettings(@Nullable JsonData value) {
			this.taskSettings = value;
			return this;
		}

		/**
		 * The type of inference task that the model performs.
		 * <p>
		 * API name: {@code task_type}
		 */
		public final Builder taskType(@Nullable TaskType value) {
			this.taskType = value;
			return this;
		}

		/**
		 * The amount of time to wait for the inference request to complete.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The amount of time to wait for the inference request to complete.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link InferenceRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InferenceRequest build() {
			_checkSingleUse();

			return new InferenceRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InferenceRequest}
	 */
	public static final JsonpDeserializer<InferenceRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			InferenceRequest::setupInferenceRequestDeserializer);

	protected static void setupInferenceRequestDeserializer(ObjectDeserializer<InferenceRequest.Builder> op) {

		op.add(Builder::input, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "input");
		op.add(Builder::inputType, JsonpDeserializer.stringDeserializer(), "input_type");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::taskSettings, JsonData._DESERIALIZER, "task_settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.inference}".
	 */
	public static final Endpoint<InferenceRequest, InferenceResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.inference",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _inferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _inferenceId;
				if (request.taskType() != null)
					propsSet |= _taskType;

				if (propsSet == (_inferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.inferenceId, buf);
					return buf.toString();
				}
				if (propsSet == (_taskType | _inferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskType.jsonValue(), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.inferenceId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _inferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _inferenceId;
				if (request.taskType() != null)
					propsSet |= _taskType;

				if (propsSet == (_inferenceId)) {
					params.put("inferenceId", request.inferenceId);
				}
				if (propsSet == (_taskType | _inferenceId)) {
					params.put("taskType", request.taskType.jsonValue());
					params.put("inferenceId", request.inferenceId);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, InferenceResponse._DESERIALIZER);
}
