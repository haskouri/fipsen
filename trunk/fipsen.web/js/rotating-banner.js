var nStories = 10;
var currentDiv = 0;
var animeDiv = null;

function animateContent(frameName, id) {
    clearTimeout(animeDiv);
    var lastDiv = currentDiv;
    if ((currentDiv + id) >= nStories) {
        currentDiv = 0;
    } else {
        if ((currentDiv + id) < 0) {
            currentDiv = nStories-1;
        } else {
            currentDiv += id;
        }
    }
    var fader1 = new Fadomatic(document.getElementById(frameName + lastDiv), 10, 100);
    var fader2 = new Fadomatic(document.getElementById(frameName + currentDiv), 10, 0);
    fader1.fadeOut();
    fader2.fadeIn();
    animeDiv = setTimeout('animateContent(\'' + frameName + '\', 1)', 10000);
}
function pauseContent() {
    clearTimeout(animeDiv);
}
function initStories(frameName) {
    for (i=1; i < nStories; i++) {
        var fader = new Fadomatic(document.getElementById(frameName+i), 5,0);
    }
    animeDiv = setTimeout('animateContent(\'' + frameName + '\', 1)', 10000);
}