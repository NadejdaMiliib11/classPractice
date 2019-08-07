$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/wikipedia.feature");
formatter.feature({
  "name": "Wikipedia search functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wiki"
    }
  ]
});
formatter.scenario({
  "name": "Wikipedia title verification using search feature",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wiki"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipedia Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Wikipedia_Steps.user_is_on_Wikipedia_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Steve Jobs\" in the wiki search box",
  "keyword": "When "
});
formatter.match({
  "location": "Wikipedia_Steps.user_types_in_the_wiki_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks search button",
  "keyword": "And "
});
formatter.match({
  "location": "Wikipedia_Steps.user_clicks_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Steve Jobs\" is in the wiki title",
  "keyword": "Then "
});
formatter.match({
  "location": "Wikipedia_Steps.user_sees_is_in_the_wiki_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Wikipedia Search Functionality Header Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wiki"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipedia Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Wikipedia_Steps.user_is_on_Wikipedia_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Steve Jobs\" in the wiki search box",
  "keyword": "When "
});
formatter.match({
  "location": "Wikipedia_Steps.user_types_in_the_wiki_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks search button",
  "keyword": "And "
});
formatter.match({
  "location": "Wikipedia_Steps.user_clicks_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Steve Jobs\" is in the main header",
  "keyword": "Then "
});
formatter.match({
  "location": "Wikipedia_Steps.user_sees_Steve_Jobs_is_in_the_main_header(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Wikipedia Search Functionality Image Header Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wiki"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipedia Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Wikipedia_Steps.user_is_on_Wikipedia_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Steve Jobs\" in the wiki search box",
  "keyword": "When "
});
formatter.match({
  "location": "Wikipedia_Steps.user_types_in_the_wiki_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks search button",
  "keyword": "And "
});
formatter.match({
  "location": "Wikipedia_Steps.user_clicks_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Steve Jobs\" is in the image header",
  "keyword": "Then "
});
formatter.match({
  "location": "Wikipedia_Steps.user_sees_is_in_the_image_header(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});