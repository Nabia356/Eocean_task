$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "user login feature",
  "description": "",
  "id": "user-login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5873618800,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "user navigate to eocean site to login",
  "description": "",
  "id": "user-login-feature;user-navigate-to-eocean-site-to-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "navigate to the website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user has to login",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "logout user",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.navigate_to_the_website()"
});
formatter.result({
  "duration": 4204388400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userHasToLogin()"
});
formatter.result({
  "duration": 2942999200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.logoutUser()"
});
formatter.result({
  "duration": 60332306700,
  "error_message": "managers.FrameworkException: Unknown exception occured while click on: click on my account---class managers.FrameworkException---Element state: *  \u0027enableProxy element for: DefaultElementLocator \u0027By.id: \u0027\u0027 not found within defined time limit.\r\n\tat utilities.BaseTest.clickElement(BaseTest.java:54)\r\n\tat PageObjects.LoginPage.logout(LoginPage.java:43)\r\n\tat StepsDefinitions.LoginSteps.logoutUser(LoginSteps.java:30)\r\n\tat ✽.And logout user(Login.feature:6)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 779316000,
  "status": "passed"
});
});