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
public class ListClriskModelsRequest extends RpcAcsRequest<ListClriskModelsResponse> {
	   

	private String dataNode;

	private Long productId;

	private String sortType;

	private String modelName;

	private String ruleName;

	private Long pageNumber;

	private Long pageSize;

	private String productName;

	private String ruleCode;

	private String selectType;

	private String triggerMode;

	private String modelCode;

	private String sortField;

	private String status;
	public ListClriskModelsRequest() {
		super("SOFA", "2019-08-15", "ListClriskModels", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDataNode() {
		return this.dataNode;
	}

	public void setDataNode(String dataNode) {
		this.dataNode = dataNode;
		if(dataNode != null){
			putBodyParameter("DataNode", dataNode);
		}
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
		if(productId != null){
			putBodyParameter("ProductId", productId.toString());
		}
	}

	public String getSortType() {
		return this.sortType;
	}

	public void setSortType(String sortType) {
		this.sortType = sortType;
		if(sortType != null){
			putBodyParameter("SortType", sortType);
		}
	}

	public String getModelName() {
		return this.modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
		if(modelName != null){
			putBodyParameter("ModelName", modelName);
		}
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putBodyParameter("RuleName", ruleName);
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		if(productName != null){
			putBodyParameter("ProductName", productName);
		}
	}

	public String getRuleCode() {
		return this.ruleCode;
	}

	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
		if(ruleCode != null){
			putBodyParameter("RuleCode", ruleCode);
		}
	}

	public String getSelectType() {
		return this.selectType;
	}

	public void setSelectType(String selectType) {
		this.selectType = selectType;
		if(selectType != null){
			putBodyParameter("SelectType", selectType);
		}
	}

	public String getTriggerMode() {
		return this.triggerMode;
	}

	public void setTriggerMode(String triggerMode) {
		this.triggerMode = triggerMode;
		if(triggerMode != null){
			putBodyParameter("TriggerMode", triggerMode);
		}
	}

	public String getModelCode() {
		return this.modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
		if(modelCode != null){
			putBodyParameter("ModelCode", modelCode);
		}
	}

	public String getSortField() {
		return this.sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
		if(sortField != null){
			putBodyParameter("SortField", sortField);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	@Override
	public Class<ListClriskModelsResponse> getResponseClass() {
		return ListClriskModelsResponse.class;
	}

}
