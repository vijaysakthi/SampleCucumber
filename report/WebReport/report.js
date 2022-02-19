$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featureFiles/OpenUrl.feature");
formatter.feature({
  "line": 1,
  "name": "This is to test google search",
  "description": "",
  "id": "this-is-to-test-google-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Google search scenario",
  "description": "",
  "id": "this-is-to-test-google-search;google-search-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is entering google url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user is typing the search term \"Vijay\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "enters the return key",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "the user should see the search results",
  "keyword": "Then "
});
formatter.match({
  "location": "OpenUrlStepDefinitions.user_is_entering_google_url()"
});
formatter.result({
  "duration": 8245930300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vijay",
      "offset": 32
    }
  ],
  "location": "OpenUrlStepDefinitions.user_is_typing_the_search_term(String)"
});
formatter.result({
  "duration": 85332800,
  "status": "passed"
});
formatter.match({
  "location": "OpenUrlStepDefinitions.enters_the_return_key()"
});
formatter.result({
  "duration": 4526595800,
  "status": "passed"
});
formatter.match({
  "location": "OpenUrlStepDefinitions.the_user_should_see_the_search_results()"
});
formatter.result({
  "duration": 250681400,
  "status": "passed"
});
});