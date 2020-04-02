$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TagsTest.feature");
formatter.feature({
  "line": 1,
  "name": "Sample Tags Example",
  "description": "",
  "id": "sample-tags-example",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 9,
      "value": "#Scenario Sample Tags Test 2"
    }
  ],
  "line": 11,
  "name": "",
  "description": "",
  "id": "sample-tags-example;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Sample Tags test line 2",
  "keyword": "Given "
});
formatter.match({
  "location": "Tags.sampleTagsTestLine2()"
});
formatter.result({
  "duration": 212125691,
  "status": "passed"
});
});