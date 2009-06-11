package com.fipsen.scavenger.processor;

import com.fipsen.scavenger.standalonutilities.htmlfilter.NodeListFilter;
import com.fipsen.scavenger.standalonutilities.htmlfilter.PostFilter;

public abstract class AbstractProcessor {
	private String parseExperssion;
	private NodeListFilter nodeListFilter;
	private PostFilter postFilter;

	public abstract Object process(String filePath) throws Exception;

	public String getParseExperssion() {
		return parseExperssion;
	}

	public PostFilter getPostFilter() {
		return postFilter;
	}

	public void setPostFilter(PostFilter postFilter) {
		this.postFilter = postFilter;
	}

	public void setParseExperssion(String parseExperssion) {
		this.parseExperssion = parseExperssion;
	}

	public NodeListFilter getNodeListFilter() {
		return nodeListFilter;
	}

	public void setNodeListFilter(NodeListFilter nodeListFilter) {
		this.nodeListFilter = nodeListFilter;
	}

}
