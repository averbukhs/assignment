# Automated test example in Java with Selenium and Page Object test design pattern

This repository is an example of UI automated functional test for Miro - Upgrade team subscription page using Selenium.

## Setup Environment

- Install [Java OpenJDK8](https://docs.oracle.com/en/java/javase/11/install/overview-jdk-installation.html#GUID-8677A77F-231A-40F7-98B9-1FD0B48C346A)
  - Make sure environment variable `PATH` includes path to the JDK bin directory
  - Add  `JAVA_HOME` environment variable poiting to JDK folder. For example `JAVA_HOME=C:\Program Files\Java\jdk1.8.0_111` for OS Windows.

- Install [Maven](https://maven.apache.org/install.html)
  - Make sure environment variable `PATH` includes path to the Maven bin directory

- Install [Selenium Web Driver for Google Chrome](https://chromedriver.chromium.org/getting-started) browser
  - Make sure environment variable `PATH` includes path to the Chromedriver executable folder.
  - Make sure `chromedriver` version is compatible with `Chrome Browser` version installed in your system.

## Configuration

Via configuration file
  
  - open `src/test/resources/conf.properties` file and provide `base_url` property value.

## Running tests

### Single test

```bash
mvn clean -Dtest=AddCMJacketToCart test
```

### All tests

```bash
mvn clean test
```
