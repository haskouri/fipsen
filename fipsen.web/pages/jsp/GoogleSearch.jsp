<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

<head>

<title>Fipsen - Google Search Application</title>

<script
	src="http://www.google.com/jsapi?key=ABQIAAAAyi5fYMN7A4Gcxv7W6JhpLhTo_GGT8SM_Ez0DOrzwj6QKCVw3ahTXS3W_CvbS3kU1zDQVSl4RRG-h0Q"
	type="text/javascript"></script>

<script language="Javascript" type="text/javascript">

    //<![CDATA[
    google.load("search", "1");
    var myEngine;
    function OnLoad() 
    {
      // Create a search control

      var searchControl = new google.search.SearchControl();
      myEngine = searchControl;
      // Add in a full set of searchers

      //var localSearch = new google.search.LocalSearch();

      //searchControl.addSearcher(localSearch);

      //searchControl.addSearcher(new google.search.WebSearch());
      searchControl.addSearcher(new google.search.VideoSearch());
      searchControl.addSearcher(new google.search.BlogSearch());

      // Set the Local Search center point

      //localSearch.setCenterPoint(" New York ,  NY ");



      // Tell the searcher to draw itself and tell it where to attach

      searchControl.draw(document.getElementById("searchcontrol"));

      // Execute an inital search

      //searchControl.execute("Google");

    }

    google.setOnLoadCallback(OnLoad);

    //]]>
    function fipsenSearch()
    {
    	myEngine.execute("Fares Ibney Yusuf");
    }

    </script>

</head>

<body>

<div id="searchcontrol">Loading...</div>


<a href="#" onclick="fipsenSearch();return false;">Here</a>


</body>

</html>