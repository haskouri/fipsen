package com.fipsen.core.data;

import java.util.List;

public class NewsData extends AbstractData 
{
	private String headingText;
	private String headingUrl;
	private ImageData leadImage;
	private List<ImageData> images;
	private String body;
	private String newsDate;
	private String collectionDate;
	private String filePath;
	
	
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getHeadingText() {
		return headingText;
	}
	public void setHeadingText(String headingText) {
		this.headingText = headingText;
	}
	public String getHeadingUrl() {
		return headingUrl;
	}
	public void setHeadingUrl(String headingUrl) {
		this.headingUrl = headingUrl;
	}
	public ImageData getLeadImage() {
		return leadImage;
	}
	public void setLeadImage(ImageData leadImage) {
		this.leadImage = leadImage;
	}
	public List<ImageData> getImages() {
		return images;
	}
	public void setImages(List<ImageData> images) {
		this.images = images;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getNewsDate() {
		return newsDate;
	}
	public void setNewsDate(String newsDate) {
		this.newsDate = newsDate;
	}
	public String getCollectionDate() {
		return collectionDate;
	}
	public void setCollectionDate(String collectionDate) {
		this.collectionDate = collectionDate;
	}	
}
