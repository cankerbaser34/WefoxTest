$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/dominordier.feature");
formatter.feature({
  "name": "Give order domino",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "customer is on main page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.MyStepdefs.customerIsOnMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Simple domino pizza order",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "customer  click on start order button",
  "keyword": "When "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.MyStepdefs.customerClickOnStartOrderButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select \"provience name\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.MyStepdefs.select(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select \"location\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.MyStepdefs.select(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter street name",
  "keyword": "And "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.MyStepdefs.enterStreetName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter \"no\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.MyStepdefs.enter(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Find store button",
  "keyword": "And "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.MyStepdefs.clickFindStoreButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click address button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.MyStepdefs.clickAddressButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choose type of the \"menu\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.MyStepdefs.chooseTypeOfThe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click I want button",
  "keyword": "And "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.MyStepdefs.clickIWantButton()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d86.0.4240.75)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027cihan-Lenovo-IdeaPad-S540-15IML\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.4.0-80-generic\u0027, java.version: \u00271.8.0_292\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.75, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: /tmp/.com.google.Chrome.bYmdTg}, goog:chromeOptions: {debuggerAddress: localhost:39175}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: d1e24d05070d39a81e90c5d7b3018418\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\n\tat com.wefox.pages.DominoQuickOrder.clickQuiro(DominoQuickOrder.java:139)\n\tat com.wefox.stepdefinitons.MyStepdefs.clickIWantButton(MyStepdefs.java:74)\n\tat ✽.click I want button(file:///home/cihan/Desktop/projects/Javamaven/WefoxGroupTechTest/src/test/resources/features/dominordier.feature:16)\n",
  "status": "failed"
});
formatter.after({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d86.0.4240.75)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027cihan-Lenovo-IdeaPad-S540-15IML\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.4.0-80-generic\u0027, java.version: \u00271.8.0_292\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.75, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: /tmp/.com.google.Chrome.bYmdTg}, goog:chromeOptions: {debuggerAddress: localhost:39175}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: d1e24d05070d39a81e90c5d7b3018418\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\n\tat com.wefox.stepdefinitons.Hooks.tearDown(Hooks.java:22)\n",
  "status": "failed"
});
});