/*
 * Copyright 2023-2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.ai.chat.client.advisor.api;

import org.springframework.ai.chat.client.ChatClientRequest;

/**
 * The Call Around Advisor Chain is used to invoke the next Around Advisor in the chain.
 * Used for non-streaming responses.
 *
 * @author Christian Tzolov
 * @author Dariusz Jedrzejczyk
 * @since 1.0.0
 * @deprecated in favor of {@link CallAdvisorChain}
 */
@Deprecated
public interface CallAroundAdvisorChain extends AdvisorChain {

	/**
	 * Invokes the next Around Advisor in the CallAroundAdvisorChain with the given
	 * request.
	 * @param advisedRequest the request containing the data to be processed by the next
	 * advisor in the chain.
	 * @return the response generated by the next advisor in the chain.
	 * @deprecated in favor of {@link CallAdvisorChain#nextCall(ChatClientRequest)}
	 */
	@Deprecated
	AdvisedResponse nextAroundCall(AdvisedRequest advisedRequest);

}
