# Test plan

![Company logo](assets/company-logo.png)

## Project: WebApplication

Version: 1.0

**Historical review**

| **Version** | **Author(s)**     | **Description**   | **Date**  |
|-------------|-------------------|-------------------|-----------|
| 1.0         | Alexander Andrade | Document creation | June 2022 |

## Table of Contents

[1. Introduction](#_Toc106353851)

[1.1. Scope](#_Toc106353852)

[1.2. References](#_Toc106353853)

[1.3. Glossary](#_Toc106353854)

[2. Test context](#_Toc106353855)

[2.1. Test Project / Tests threads](#_Toc106353856)

[2.2. Test Items](#_Toc106353857)

[2.3. Scope of the Test](#_Toc106353858)

[2.4. Assumptions and Restrictions](#_Toc106353859)

[2.5. Stakeholders](#_Toc106353860)

[3. Communication management](#_Toc106353861)

[4. Risk management](#_Toc106353862)

[5. Test Strategy](#_Toc106353863)

[5.1. Test threads](#_Toc106353864)

[5.2. Test Deliverables](#_Toc106353865)

[5.3. Test Design Techniques](#_Toc106353866)

[5.4. Completion Criteria and Test](#_Toc106353867)

[5.5. Metrics](#_Toc106353868)

[5.5.1. Incidents management and classification](#_Toc1063538681)

[5.5.1.1. Information that each bug should have](#_Toc1063538682)

[5.6. Test environment requirements](#_Toc106353869)

[5.6.1. Test environment](#_Toc106353870)

[5.6.2. Testing Tools](#_Toc106353871)

[5.7. Re-testing and Regression Testing](#_Toc106353872)

[5.8. Suspension and Resumption Criteria](#_Toc106353873)

[5.8.1. Suspension criteria](#_Toc106353874)

[5.8.2. Resumption criteria](#_Toc106353875)

[5.9. Deviations from the Organizational Test Strategy](#_Toc106353876)

[6. Activities and Test Estimations](#_Toc106353877)

[7. Staff](#_Toc106353878)

[7.1. Roles, Activities and Responsibilities](#_Toc106353879)

[7.2. Hiring Needs](#_Toc106353880)

[7.3. Training Needs](#_Toc106353881)

[8. Schedule](#_Toc106353882)

# 1. Introduction<a name="#_Toc106353851"></a>

## 1.1. Scope<a name="#_Toc106353852"></a>

Necessary information and framework to plan and develop the activities of the system testing process for &quot; WebApplication &quot;, which is a system with log-in functionality on a web-server solution. The intention is that the system should provide a basic authentication functionality and should later be extended into a system with more useful functionality, such as a time reporting system.

## 1.2. References<a name="#_Toc106353853"></a>

- SRS – Software Requirements Specification: WebApplication v1.0.
- ISO29119

## 2. Glossary<a name="#_Toc106353854"></a>

The following abbreviated terms are used in this document:

- UAT: User acceptance tests.

# 2. Test context<a name="#_Toc106353855"></a>

## 2.1. Test Project / Tests threads<a name="#_Toc106353856"></a>

The project consists of the two modules:

- Log-in module.
- Log-out module.

Other items displayed during the test are part of another system that will not be tested.

## 2.2. Test Items<a name="#_Toc106353857"></a>

The following items will be tested:

- Log-in module.
- Log-out module.

## 2.3. Scope of the Test<a name="#_Toc106353858"></a>

The system composed of the modules mentioned in section 2.2

Non-functional quality factors such as performance, IT security and usability will not be tested in this test project, these tests will be outsourced to another company.

The outsourcing company responsible for those tests will create a separate Test Plan for these types of tests.

## 2.4. Assumptions and Restrictions<a name="#_Toc106353859"></a>

Assumptions:

- The test environment will be a clone of the production.
- No real data is needed.

Restrictions:

- Meetings or workshops that require the full participation of the team will be held before 3:00 pm due to the remote geolocation of part of the team. (2 of the team members have another time zone).

## 2.5. Stakeholders<a name="#_Toc106353860"></a>

| **Stakeholder**    | **Main responsibility**                                                                                                                                     |
|--------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Client             | Approval of the Test Plan, Test Schedule, and deliverables. Realization of acceptance tests (UAT).The UATs will start with the Beta version of the product. |
| Company management | Review and approval of the Test Plan and the Test Schedule.                                                                                                 |


# 3. Communication management<a name="#_Toc106353861"></a>

Details about the responsibilities of clients and team members are detailed in this section.

The process for internal and external communications, communication protocol and conflict resolution are described.

The main points of communication are identified below:

| **Communication Point** | **Purpose** | **Frequency**  | **Media**          | **Responsible**            | **Audience**  |
|-------------------------|-------------|----------------|--------------------|----------------------------|---------------|
| Kickoff meeting         | Start       | One time       | Meeting            | Project Leader/ QA Manager | Equipment     |
| Internal meetings       | Condition   | Weekly         | Meeting            | Project Leader/ QA Manager | Internal team |
| Status Reports          | Condition   | Weekly         | Document via email | Project Leader/ QA Manager | Equipment     |
| Milestones Report       | Scope       | As appropriate | Document via email | Project Leader/ QA Manager | Equipment     |


# 4. Risk management<a name="#_Toc106353862"></a>

The following table identifies the risks of the project, as well as determining the severity of each of the risks by multiplying the impact by the probability of occurrence.

Impact and probability are determined on a scale of 1 to 5, with 5 being the highest.

| **#** | **Risk**                                           | **Probability (1-5)** | **Impact (1-5)** | **Severity (Chance x Impact)** | **Mitigation Plan**                                                                                                |
|-------|----------------------------------------------------|-----------------------|------------------|--------------------------------|--------------------------------------------------------------------------------------------------------------------|
| 1     | Delays in the implementation of functionalities.   | 2                     | 5                | 10                             | Evaluate the progress of the development of the functionalities and re-plan according to the progress if necessary |
| 2     | Users are not available for acceptance tests (UAT) | 1                     | 5                | 5                              | Coordinate with the central offices the early selection of users                                                   |

# 5. Test Strategy<a name="#_Toc106353863"></a>

This section describes the testing approach for the specific test project or test thread.

## 5.1. Test threads<a name="#_Toc106353864"></a>

Testing for the System will include the following test threads:

- Component tests.
- Integration testing.
- System tests.

## 5.2. Test Deliverables<a name="#_Toc106353865"></a>

For each test thread, the following documentation must be generated:

- Test plan of the test thread.
- Specification of Test Cases
- Test Status Reports.
- Test Thread Completion Report.

## 5.3. Test Design Techniques<a name="#_Toc106353866"></a>

This section identifies the techniques that will be used for the design of the tests.

- Use Case Testing
- Limit Value Analysis.
- Exploratory tests

## 5.4. Completion Criteria and Test<a name="#_Toc106353867"></a>

Testing must achieve 80% coverage of requirements and all test procedures must run without Severity 1 (high) failures.

## 5.5. Metrics<a name="#_Toc106353868"></a>

The following metrics will be collected during test execution:

- Number of test cases executed.
- Number of incidents by category.
- Number of test cases re-executed.
- Number of resolved incidents by category.

### 5.5.1. Incidents management and classification<a name="#_Toc1063538681"></a>

The following is the process of handling bugs or errors in Jira, there are two 
types of bugs, Story Bugs and Bugs, the differences are highlighted below:
* Story Bugs: These are bugs directly related to the functionality of the story, that is, they impact the proper functioning of some functionality. These bugs are created during the sprint and are created as subtasks of the parent User Story.
* Bugs: These are bugs directly related to functionality that has already been tested or completed, bugs in production or global bugs that are not part of any User Story, these can be created during the sprint and are generally created by errors in the production environment.

#### 5.5.1.1. Information that each bug should have<a name="#_Toc1063538682"></a>

At the time of creating any bug, be it a bug or a story bug, the following information must be included:
* Summary: It is the title of the bug; it must be telling so that anyone understands where the bug occurs.
* Description: Detailed information must be included to reproduce the error, this information includes:
  * Steps to reproduce the bug: A series of steps required to reproduce the bug
  * Expected Result: Result of the expected behavior based on the
  functional specifications, visual proposals, etc.
  * Result obtained: Description of the current operation of the system
  * Image or video attached: All bugs must have an image or video that
  show the existence of the bug.
* Environment: Environment where the bug was found, the options are: Local, Development, Staging and Production
* Severity: Impact caused by the bug in the application, chosen from the following options:
  * Blockers:
    * Functional: It is a defect that prevents the user from carrying out any functionality, environments, services or databases that are down or any functionality, page or service that prevents the user from using the system correctly. No User Story should be closed with a bug of this type open.
    * Business: It is a defect that affects areas with a potential impact at a high level.
    * No User Story should be closed with a bug of this type open.
  * High:
    * Functional: The error results from severely impaired functionality, there may be a quick solution to the problem, but the use of the functionality is not satisfactory.
    * Business: The bug affects an area that can potentially drive brand revenue, but the level of impact may not be high.
    * No User Story should be closed with a bug of this type open.
  * Medium:
    * Functional: The error is a failure in a non-critical area of the system, or it may be an obvious visual error.
    * Business: Affects an area that may affect the system's brand, design or services.
    * No User Story should be closed with a bug of this type open.
  * Low:
    * Functional: The error does not impact the overall functionality of the system; they are usually visual changes.
    * Business: The error shows small visual or functional differences to those agreed.
    * There may be closed User Stories with some of these open bug types.

## 5.6. Test environment requirements<a name="#_Toc106353869"></a>

### 5.6.1. Test environment<a name="#_Toc106353870"></a>

This section describes the tests stack.

| **Browsers**          | Chrome, Mozilla Firefox |
|-----------------------|-------------------------|
| **Operating systems** | MacOS                   |

### 5.6.2. Testing Tools<a name="#_Toc106353871"></a>

| **Tool**            | **Function**                            |
|---------------------|-----------------------------------------|
| Test Link           | Test management                         |
| Selenium Web Driver | API to automate Web systems             |
| Serenity BDD        | Execution and Report of automated tests |

## 5.7. Re-testing and Regression Testing<a name="#_Toc106353872"></a>

Confirmation tests (re-testing) are necessary to meet the completion criteria must be performed.

It is estimated that at least 3 cycles of tests will be carried out, the last cycle will include a full regression test.

Regression tests are not necessary for this project.

## 5.8. Suspension and Resumption Criteria<a name="#_Toc106353873"></a>

### 5.8.1. Suspension criteria<a name="#_Toc106353874"></a>

- The solution does not comply with the functionalities specified in the Project Requirements Specification document.
- One of the main features contains a bug that prevents testing critical areas of the system.
- The test environment is not stable and/or does not return reliable results.

### 5.8.2. Resumption criteria<a name="#_Toc106353875"></a>

Reach an agreement between the parties to resume the tests or that the defects/problems found have been solved.

## 5.9. Deviations from the Organizational Test Strategy<a name="#_Toc106353876"></a>

The Organizational Test Strategy calls for 100% requirements coverage, but for this test it has been reduced to 80% because there are relatively few risks and component tests are planned to be thorough.

# 6. Activities and Test Estimations<a name="#_Toc106353877"></a>

The tests will be divided into the following main activities:

1. Definition of a general structure of the tests by sets of use cases to be tested.
2. Detailed specification of test cases.
3. Establishment of the test environment.
4. First test execution cycle.
5. Second cycle of execution of the tests (re-test of the first cycle).
6. Third cycle execution of the tests (re-test of the second cycle and tests of pending elements of the first cycle).
7. Weekly test status report.
8. Test completion report.

Detailed test activities and estimates can be found in the project&#39;s test management tool.

# 7. Staff<a name="#_Toc106353878"></a>

## 7.1. Roles, Activities and Responsibilities<a name="#_Toc106353879"></a>

The RACI (**R**esponsible- **A**ccountable- **C**onsulted- **I**nformed) matrix below illustrates which role is involved in which activity(s) and what the level of involvement is.

| **Rol / Activity**  | **1** | **2** | **3** | **4** | **5** | **6** | **7** | **8** |
|---------------------|-------|-------|-------|-------|-------|-------|-------|-------|
| QA Manager          | R     | A     | A     | A     | A     | A     | R     | R     |
| QA Analyst          | C     | R     | R     | R     | R     | R     | A     | C     |
| Automation Engineer | I     | A     | R     | R     | R     | R     | A     | C     |

Activity numbers refer to the activity list above.

## 7.2. Hiring Needs<a name="#_Toc106353880"></a>

It is necessary to hire at least 2 Quality Analysts to complete the schedule in the expected time.

## 7.3. Training Needs<a name="#_Toc106353881"></a>

An introduction to the system is needed for those running the tests. It is estimated that this activity can take 1 hour.

# 8. Schedule<a name="#_Toc106353882"></a>

The general testing schedule is shown below.

![Project schedule](assets/schedule.png)

The schedule with detailed test activities can be found in the project&#39;s test management tool.
