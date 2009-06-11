package com.fipsen.web.actionsupport;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Advertisement
{
	private List<AdImage> upperAds;
	private List<AdImage> lowerAds;
	private List<AdImage> banner;
	
	
	public List<AdImage> getUpperAds()
	{
		return upperAds;
	}

	public void setUpperAds(List<AdImage> upperAds)
	{
		this.upperAds = upperAds;
	}

	public List<AdImage> getLowerAds()
	{
		return lowerAds;
	}

	public void setLowerAds(List<AdImage> lowerAds)
	{
		this.lowerAds = lowerAds;
	}
	
	

	public List<AdImage> getBanner()
	{
		return banner;
	}

	public void setBanner(List<AdImage> banner)
	{
		this.banner = banner;
	}

	public void prepareAdvertisements()
	{		
		URL r = getClass().getResource("/");
		String root = r.getPath();
		root = root.replace("/WEB-INF/classes/", "/conf");
		if(root.startsWith("/"))
		{
			root = root.replaceFirst("/", "");
		}
		//WebApplicationContextUtils.getRequiredWebApplicationContext(null)
		/*Map m = ActionContext.getContext().getApplication();
		System.out.println( ActionContext.getContext().getApplication().containsValue("fipsen") );
		*/
		
		Properties propertieFile = new Properties();
		try
		{
			/*File f = new File("./tmp");
			System.out.println(f.getAbsolutePath());
			*/
			propertieFile.load(new FileInputStream(root + "/adv.prop"));//r.getFile()));
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(upperAds == null)
		{
			upperAds = new ArrayList<AdImage>();
		}
		if(lowerAds == null)
		{
			lowerAds = new ArrayList<AdImage>();
		}
		if(banner == null)
		{
			banner = new ArrayList<AdImage>();
		}
		
		
		String upperAdNo = propertieFile.getProperty("upperAdNo");
		int upperAdCount = new Integer(upperAdNo);
		AdImage image = null;
		
		for ( int i = 1; i <= upperAdCount;i++)
		{
			image = new AdImage();
			image.setImage( propertieFile.getProperty("upper-ad-" + i+".image") );
			image.setUrl(  propertieFile.getProperty("upper-ad-" + i +".url") );
			image.setHeight(propertieFile.getProperty("upper-ad-"+i+".height"));
			image.setWidth(propertieFile.getProperty("upper-ad-"+i+".width"));
			upperAds.add(image);
		}
		
		String lowerAdNo = propertieFile.getProperty("lowerAdNo");
		int lowerAdCount = new Integer(lowerAdNo);
		//AdImage image = null;
		
		for ( int i = 1; i <= lowerAdCount;i++)
		{
			image = new AdImage();
			image.setImage( propertieFile.getProperty("lower-ad-" + i+".image") );
			image.setUrl(  propertieFile.getProperty("lower-ad-" + i +".url") );
			image.setHeight(propertieFile.getProperty("lower-ad-"+i+".height"));
			image.setWidth(propertieFile.getProperty("lower-ad-"+i+".width"));
			lowerAds.add(image);
		}
		
		String bannerNo = propertieFile.getProperty("bannerPicNo");
		int bannerAdCount = new Integer(bannerNo);
		//AdImage image = null;
		
		for ( int i = 1; i <= bannerAdCount;i++)
		{
			image = new AdImage();
			image.setImage( propertieFile.getProperty("banner-ad-" + i+".image") );
			image.setUrl(  propertieFile.getProperty("banner-ad-" + i +".url") );
			image.setHeight(propertieFile.getProperty("banner-ad-"+i+".height"));
			image.setWidth(propertieFile.getProperty("banner-ad-"+i+".width"));
			banner.add(image);
		}
		
		
	}
	
	public static void main(String[] args)
	{
		Advertisement ad = new Advertisement();
		ad.prepareAdvertisements();
	}

}
