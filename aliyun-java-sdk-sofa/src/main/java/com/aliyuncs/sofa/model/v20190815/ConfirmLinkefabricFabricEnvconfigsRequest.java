/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ConfirmLinkefabricFabricEnvconfigsRequest extends RpcAcsRequest<ConfirmLinkefabricFabricEnvconfigsResponse> {
	   

	private String configKey;

	private String configFlowInfo;
	public ConfirmLinkefabricFabricEnvconfigsRequest() {
		super("SOFA", "2019-08-15", "ConfirmLinkefabricFabricEnvconfigs", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConfigKey() {
		return this.configKey;
	}

	public void setConfigKey(String configKey) {
		this.configKey = configKey;
		if(configKey != null){
			putBodyParameter("ConfigKey", configKey);
		}
	}

	public String getConfigFlowInfo() {
		return this.configFlowInfo;
	}

	public void setConfigFlowInfo(String configFlowInfo) {
		this.configFlowInfo = configFlowInfo;
		if(configFlowInfo != null){
			putBodyParameter("ConfigFlowInfo", configFlowInfo);
		}
	}

	@Override
	public Class<ConfirmLinkefabricFabricEnvconfigsResponse> getResponseClass() {
		return ConfirmLinkefabricFabricEnvconfigsResponse.class;
	}

}
