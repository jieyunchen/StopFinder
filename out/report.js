$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("stopFinder.feature");
formatter.feature({
  "name": "Stop Finder API Testing",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "A stop providing multiple transport options can be located",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Phileas is looking for a stop",
  "keyword": "Given "
});
formatter.match({
  "location": "StopFinderSteps.phileasIsLookingForAStop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he searches for \"Wynyard Station\"",
  "keyword": "When "
});
formatter.match({
  "location": "StopFinderSteps.heSearchesFor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a stop named \"Wynyard Station, Sydney\" is found",
  "keyword": "Then "
});
formatter.match({
  "location": "StopFinderSteps.aStopNamedIsFound(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the stop provides more than one mode of transport",
  "keyword": "And "
});
formatter.match({
  "location": "StopFinderSteps.theStopProvidesMoreThanOneModeOfTransport()"
});
formatter.result({
  "status": "passed"
});
});