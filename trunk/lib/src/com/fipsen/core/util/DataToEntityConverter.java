package com.fipsen.core.util;

import com.fipsen.core.data.ImageData;
import com.fipsen.core.data.NewsData;
import com.fipsen.core.data.TopCelebrityData;
import com.fipsen.core.data.VideoData;
import com.fipsen.core.entity.EntityConstants;
import com.fipsen.core.entity.Image;
import com.fipsen.core.entity.News;
import com.fipsen.core.entity.TopCelebrity;
import com.fipsen.core.entity.Video;

public class DataToEntityConverter 
{
	public static News convertToNews(NewsData newsData)
	{
		News news = new News();
		news.setOid(IDGenerator.generateOID("nws").substring(0, 19));
		news.setDate(newsData.getCollectionDate());
		news.setDetails(newsData.getBody());
		news.setHeading(newsData.getHeadingText());
		news.setLeadImage(convertToImage(newsData.getLeadImage()));
		news.getLeadImage().setReferenceid(news.getOid());
		news.getLeadImage().setType(EntityConstants.NEWS);
		news.setTime(System.currentTimeMillis()+"");
		news.setNewsurl(StringProcessorUtil.generateNewsURL(newsData.getHeadingUrl()));
		return news;
	}
	
	public static Image convertToImage(ImageData imageData)
	{
		Image image = new Image();
		image.setAltertag(imageData.getAlt());
		image.setOid(IDGenerator.generateOID("img").substring(0,19));
		image.setPath(imageData.getFilePath());
		image.setUrl(imageData.getUrl());
		image.setTitle(imageData.getTitle());
		
		//image.set
		
		return image;
	}
	
	public static Video convertToVideo( VideoData videoData)
	{
		Video video = new Video();
		video.setOid(IDGenerator.generateOID("vdo").substring(0,19));
		video.setDate(videoData.getCollectionDate());
		video.setDetails(videoData.getDetails());
		video.setVideourl(videoData.getUrl());
		video.setLeadImage(convertToImage( videoData.getLeadImage()));
		video.getLeadImage().setReferenceid(video.getOid());
		video.getLeadImage().setType(EntityConstants.VIDEO);
		
		return video;
	}
	
	public static TopCelebrity convertToTopCelebrity(TopCelebrityData topCelebrityData)
	{
		TopCelebrity topCelebrity = new TopCelebrity();
		topCelebrity.setOid(IDGenerator.generateOID("tpc").substring(0,19));
		topCelebrity.setFirstName( topCelebrityData.getName());
		topCelebrity.setLastName("");
		topCelebrity.setMiddleName("");
		topCelebrity.setPosition(topCelebrityData.getPosition());
		
		return topCelebrity;
	}

}
