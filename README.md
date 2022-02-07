# Relayr-WebUIAutomatiom

That Automation Testing is Hybrid framework which Uses
----------------------------------------------------------------
1.Selenium <br />
2.Maven <br />
3.Cucumber BDD (Gherkin language) via Junit , <br />
4.using Cucumber 6 Extent report for generating PDF & Spark reports  <br />
5.Using junit for assertions <br />
6.Reading from Properties files for storing environment variables <br />

Structure of Project:
-----------------------------------------------------------------------
1- src/main/java <br />
com.pages : Package includes the designated pages of Relayr <br />
com.qa.factory :  Package includes a class of methods to initialize the browser <br />
com.util :  Package includes a class of methods to read the config properties <br />

2- src/test/java <br />
Apphooks: Package includes the class of the common components that need to run before and every feature file <br />
stepDefinitions : Package includes steps class that has the implementations of the feature files <br />
Runner Package include the test runner that run the step definitionns along with the designated feature file <br />

3- src/test/resources <br />
AppFeature : Package includes the feature file <br />
config.properties that contains the environment variables (name of the browser, URL to run against) <br />
cucumber.properties file includes the properties of the display of the cucumber report over the browser <br />
extent-config xml file includes the properties of the display of the extent report over the browser <br />
extent.properties includes the location of the generated reports and some system info to be displayed in the report <br />

Running the project
----------------------------------------------------------------------------------------
Download the project on your local machine <br />
Import the project to your editor(Eg: Eclipse) <br />
Right Click on the project , choose Maven and Click on Update Project <br />
After the Update Project is completed go to the MyTestRunner under testRunner Package <br />
Right click on the MyTestRunner and Run As Juint Test <br />

Generating The Test Reports :
-----------------------------------------------------------------------------------------------
(open test output folder) and you will get a generated pdf report contains all the details of the execution (pass/fail) <br />
(open test-output/SparkReport), then open (index.html) file on any browser and you will get detailed info of the status of every step in every scenario per every feature file <br />
For checking the report from on the cucumber cloud , pasted the highlited link on the browser and you will get it <br />
![image](https://user-images.githubusercontent.com/49224785/120876223-2aaed300-c5cd-11eb-9acd-b870b2650274.png)
![image](https://user-images.githubusercontent.com/49224785/120876234-3a2e1c00-c5cd-11eb-9291-65f7d147e4d2.png)

![image](https://user-images.githubusercontent.com/49224785/120876246-516d0980-c5cd-11eb-9665-01e99b40d802.png)
![image](https://user-images.githubusercontent.com/49224785/120876254-5cc03500-c5cd-11eb-935a-0c2f48cd007f.png)

![image](https://user-images.githubusercontent.com/49224785/120876258-65187000-c5cd-11eb-8a0a-92901001090f.png)

![image](https://user-images.githubusercontent.com/49224785/120876264-6ea1d800-c5cd-11eb-9983-f4d1c1cff09b.png)



