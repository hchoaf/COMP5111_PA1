### Submissions:
1. You may put your source code under `comp5111.assignment` package in `src/main/java` folder.
2. You are recommended to use Java build tools to manage your project, e.g., maven, or gradle.
3. Put useful scripts or readme files in the project root, containing instructions of how to run your implementation of **each task**.
4. A file showing the differences of the percentage (coverage for all classes) report by your tool and EclEmma, for **all coverage criteria** you implemented. Minor differences are allowed.
5. You need to measure all the five submitted test suites.
6. Advice: You are highly encouraged to maintain your code in a `private` repository at Github. It provides a backup of your code in case your computer crashes and allows us to retrieve code from your Github repository in case of submission errors. Such incidents did happen in the past.

## Running Assignment 1

- For task 1, run `${PROJECT_ROOT}/scripts/randoop_generate.sh` in project root folder.
- For task 2 and 3, run `${PROJECT_ROOT}/scripts/instrument-run-test.sh` in project root folder.
- Screen shots for task 1 are located in `${PROJECT_ROOT}/screenshots`.
- Reports (Eclemma, My coverage, Comparison) are located in `${PROJECT_ROOT}/reports`.
- Test suites (randoop) are located in `${PROJECT_ROOT}/src/test`.

## Running Assignment 2
- For task 1, run `${PROJECT_ROOT}/scripts/evosuite_generate.sh` in project root folder.
- The generated evosuite tests are in `${PROJECT_ROOT}/src/test/evosuite[0-4]` folder.
- The generated evosuite coverage screenshots are in `${PROJECT_ROOT}/screenshots/evosuite_[0-4]_[branch|line]`.
- For task 2, task 3, and bonus tasks, run `scripts/assignment2.sh` in project root folder.
- The generated `.tsv` report files are located in `${PROJECT_ROOT}/src/test/fault-revealing-[randoop|evosuite][0-2]` folder.
- The faults found and fixed are located in `${PROJECT_ROOT}/faults` folder.
- The extended 6 text suites and the reports accordingly are located in `${PROJECT_ROOT}/src/test/refined-[randoop|evosuite][0-2]` folder.