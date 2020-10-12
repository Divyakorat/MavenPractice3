$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Register.feature");
formatter.feature({
  "line": 1,
  "name": "Register Scenario",
  "description": "",
  "id": "register-scenario",
  "keyword": "Feature"
});
formatter.before({
  "duration": 114661251863,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should be able to enter all detail,",
  "description": "user able to register successfully",
  "id": "register-scenario;user-should-be-able-to-enter-all-detail,",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Register"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on my Account",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user click on register",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Enter all details",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user should be able see success message successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDef.user_is_on_homepage()"
});
formatter.result({
  "duration": 6953696178,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_click_on_my_Account()"
});
formatter.result({
  "duration": 3908201181,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_click_on_register()"
});
formatter.result({
  "duration": 10468980017,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_Enter_all_details()"
});
formatter.result({
  "duration": 17335872535,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDef.user_should_be_able_see_success_message_successfully()"
});
formatter.result({
  "duration": 281172584,
  "status": "passed"
});
formatter.after({
  "duration": 5150572701,
  "status": "passed"
});
});