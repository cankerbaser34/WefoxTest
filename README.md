# Wefox Group TestCase with Cucumber Framework and Selenium

This is a simple automation testing project which automate the workflow of booking hotel and login on 
(https://www.phptravels.net/) with
Cucumber and Selenium Web driver,executing by Junit, based on BDD framework.
## Usage and set up
### Environment
- Java 11.0.11
- Maven
- Intellij or Eclipse

### Important notes for import and quick start
- You can copy project from github page or using git clone command from terminal.
- You  need to reload the project  before you run the test to download all dependencies
in pom.xml file.
- To get cucumber html report you should run with verify button under maven lifecycle part or simply
from terminal with mvn verify command. 
-You may  need to change tags to run tests in CukesRunner java file or you can add more than one tags.
 tags = {@tag1,@tag2}
  
```
@RunWith(Cucumber.class)
@CucumberOptions(
plugin = {"json:target/cucumber.json",
"html:target/default-html-reports",
"rerun:target/rerun.txt"
},
features = "src/test/resources/features",
glue = "com/wefox/stepdefinitons",
dryRun = false,
tags = "@login"
)

public class CukesRunner {

}
```


# WefoxTest
