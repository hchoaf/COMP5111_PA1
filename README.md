# COMP5111 (Spring 2023) Assignment 1

## Deadline: 11:55pm 18 March 2023


### Submissions:
1. You may put your source code under `comp5111.assignment` package in `src/main/java` folder.
2. You are recommended to use Java build tools to manage your project, e.g., maven, or gradle.
3. Put useful scripts or readme files in the project root, containing instructions of how to run your implementation of **each task**.
4. A file showing the differences of the percentage (coverage for all classes) report by your tool and EclEmma, for **all coverage criteria** you implemented. Minor differences are allowed.
5. You need to measure all the five submitted test suites.
6. Advice: You are highly encouraged to maintain your code in a `private` repository at Github. It provides a backup of your code in case your computer crashes and allows us to retrieve code from your Github repository in case of submission errors. Such incidents did happen in the past.

## Assignment 1 Submission

- You are required to submit your assignment to [CANVAS](https://canvas.ust.hk/courses/47981/assignments).
- Please put all your code, screenshot, readme and so on into a single folder and compress it to `comp5111asg01.zip`

The recommended folder structure is:

1. Put your code into `${PROJECT_ROOT}/src/main/java/`
2. If you do not use Java build tools, put the libraries jar files that your code depends on into `${PROJECT_ROOT}/lib/`
3. Put your running scripts under `${PROJECT_ROOT}/scripts`
4. Put your screenshot into `${PROJECT_ROOT}/screenshots`
5. Put the test suites generated by you in to `${PROJECT_ROOT}/src/test/randoop[0-4]`

## Running Assignment 1

- For task 1, run `${PROJECT_ROOT}scripts/randoop_generate.sh` in project root folder.
- For task 2 and 3, run `${PROJECT_ROOT}scripts/instrument-run-test.sh` in project root folder.
- Screen shots for task 1 are located in `${PROJECT_ROOT}/screenshots`.
- Reports (Eclemma, My coverage, Comparison) are located in `${PROJECT_ROOT}/reports`.
- Test suites (randoop) are located in `${PROJECT_ROOT}/src/test`.