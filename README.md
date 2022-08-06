# exam
# this is project automation test BDD with serenity and jbehave
# Pre-requisites:
  # Java JDK 1.8.0_202
  # Maven 3.8.6
# the libraries are used:
  # Serenity 2.6.0
  # Jbehave 1.46.0
  # JUnit 4.12
  # ...
# The libraries are managed in file pom.xml
# The project include 2 story TestCreateNewMember.story and TestSearchMember.Story(file are defined by serenity BDD)
# Story:
  # Scenario: Add new member and search member 
# How to run project:
  # in IDE (eclipse):
  # Right click file AcceptanceTestSuite.java in src\test\java\com\demo\exam\tests and choose Run as -> JUnit Test
  # cmd:
  # cd to folder project and run cmd: mvn clean verify
# Report and Log
  # report and log exist in target folder after run project
  # full report target/site/serenity/index.html
  
