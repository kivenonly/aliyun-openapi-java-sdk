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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeKeywordLibRequest extends RpcAcsRequest<DescribeKeywordLibResponse> {
	
	public DescribeKeywordLibRequest() {
		super("Green", "2017-08-23", "DescribeKeywordLib", "green");
	}

	private String sourceIp;

	private String serviceModule;

	private String lang;

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getServiceModule() {
		return this.serviceModule;
	}

	public void setServiceModule(String serviceModule) {
		this.serviceModule = serviceModule;
		if(serviceModule != null){
			putQueryParameter("ServiceModule", serviceModule);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<DescribeKeywordLibResponse> getResponseClass() {
		return DescribeKeywordLibResponse.class;
	}

}
