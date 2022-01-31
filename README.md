# Software-testing-assessment
softwaretestingassessment
AutomationProject-> I have used the cucumber BDD framework for the same along with Maven. One feature file is being created saucedemo.feature where in all the steps are being
written in given when then format which is the Gherkin language. The maven command is being used to run the project and the command is mvn clean install.
The surefire plugin of maven is being used to run the Test runner file and in return it will run the test.
Apart from the above, the stepdefinition is being created in the different package along with Hook and object repository which is being used to store all the webelement properties.
The reporting is being done using the spark extent report for which the package is being added to the test runner file.
For MinMax problem, the solution is being provide in the separate package with the name codeComprehensive. As per my understanding, the first 2 questions have the same answer
using the int values and the 3rd and 4th question have the same answer using the Long values.
The SQL question I could not do using Docker because I am using the office laptop and cant install docker on it.
The Jenkins pipeline is being build and running successfully.
Installed maven in Jenkins and then created a new item. In the build section have given the maven path and the command "mvn clean test" to run the build. Apply->Save and 
created on build now, the pipeline ran successfully.
