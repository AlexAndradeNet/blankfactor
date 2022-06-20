# com-blanckfactor-blog

![Company logo](assets/company-logo.png)

AlexanderAndrade.Net Repository

[![Java JDK](https://img.shields.io/badge/JavaJDK-8-green.svg)](https://www.oracle.com/co/java/technologies/javase/javase8-archive-downloads.html)
[![gradle](https://img.shields.io/badge/Gradle-v7.4.1-yellow.svg)](https://gradle.org/install/)

>A Gradle project to test Front, Java Serenity & Cucumber.
>

## Table of Contents

- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Quickstart](#quickstart)
- [Contributing](#contributing)
- [Want to learn more?](#want-to-learn-more)


## Prerequisites<a name="#prerequisites"></a>

You will need the following things properly installed on your computer:

* [Git](http://git-scm.com/)
* [Java JDK](https://www.oracle.com/co/java/technologies/javase/javase8-archive-downloads.html)
* [Gradle](https://gradle.org/install/)


## Installation<a name="#installation"></a>

We use Gradle, a cross-platform build automation tool that help with our full
development flow.

## Quickstart<a name="#quickstart"></a>

### Executing the tests

```bash
./gradlew clean test
```

The parameter **-Denvironment** can to take values like:

   - dev
   - stg
   - pro

#### Execution report

##### Report with screenshots (Business friendly)

Serenity BDD offers an report in <a href="https://github.com/AlexAndradeSan/blankfactor/target/site/serenity/index.html" target="_blank">Serenity BDD execution report</a>.
```
{project directory}/target/site/serenity/index.html
```

##### Report with technical Information

Gradle export a report in:

```
{project directory}/build/reports/tests/test/classes/net.alexanderandrade.ui.features.RunnerTest.html
```

#### Project not run fine

If the execution of the project ends prematurely well but without an apparent 
execution. 

```bash
rm -rf ~/.gradle/caches/
./gradlew --stop
```

## Contributing<a name="#contributing"></a>

If you find this repo useful here's how you can help:

1. Send a Pull Request with your awesome new features and bug fixes
2. Wait for a Coronita :beer: you deserve it.


## Want to learn more?<a name="#want-to-learn-more"></a>

For more information about Serenity BDD, you can read the [**Serenity BDD Book**](https://serenity-bdd.github.io/theserenitybook/latest/index.html), the official online Serenity documentation source. Other sources include:
* **[Byte-sized Serenity BDD](https://www.youtube.com/channel/UCav6-dPEUiLbnu-rgpy7_bw/featured)** - tips and tricks about Serenity BDD
* [**Serenity BDD Blog**](https://johnfergusonsmart.com/category/serenity-bdd/) - regular articles about Serenity BDD
* [**The Serenity BDD Dojo**](https://serenitydojo.teachable.com) - Online training on Serenity BDD and on test automation and BDD in general.
