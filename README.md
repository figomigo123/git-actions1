# Farag readme!
## Readme is updated .

#### Last Stand.


## E3: Code Rules (Clean Code and SOLID Principles, No Cyclic Dependencies, DDD Rules)

![Bloom-Level](./images/5-filled-32.png)
[Level 5 (Evaluate) in Bloom's Taxonomy](https://www.archi-lab.io/infopages/material/blooms_taxonomy.html#level5)

You need to continue applying the Clean Code rules and the SOLID principles. We will check the following aspects:

* Clean Code
    * Meaningful names for variables, classes, packages, ...
    * Methods should be small, not longer than max. 30 lines of code, and if possible should be much smaller.
    * Code lines should not extend 120 characters - add a linebreak otherwise, or try re-writing the code.
* SOLID
    * Single Responsibility Principle
        * Classes should serve one purpose only
        * No domain business logic in application services or controllers
    * Open-Closed Principle
        * No public access to member variables
        * States (see above for ShoppingBasket) must be encapsulated - no possibility of directly changing the status from outside
    * Dependency Inversion Principle
        * No cyclic dependencies - avoid them by applying the DIP

There is also a no-cycle-test, and some other DDD rule tests. 



## E4: Code Review - Manual Tests

![Bloom-Level](./images/5-filled-32.png)
[Level 5 (Evaluate) in Bloom's Taxonomy](https://www.archi-lab.io/infopages/material/blooms_taxonomy.html#level5)

In addition we will check your code manually. Manual tests will be performed by 
looking at samples (Stichproben) of the students' solutions. Therefore, the manual
tests for E4 will all be initially green. If we pick your solution for a manual check, and we find violations, then
it will turn red. You will see the feedback in error message. We will not perform a thorough code review, but
check certain critical aspects of your code.

### Your Task in E4

* Resolve cyclic dependencies in your code, using the Dependency Inversion Principle (DIP). 
* Apply the Clean Code rules and the SOLID principles. 
* Fix issues we give you in the manual review.


## Additional Help for Clean Code and SOLID

- Some of the automated tests are based on the PMD Source Code Analyzer, which runs in our pipeline (so you
  don't have this locally). If you want to learn more about each test, feel free to check the
  documentation at [pmd.github.io](https://pmd.github.io/latest/pmd_rules_java.html).
- Although PMD is not available as a local unit test, there is an IntelliJ plugin that you can use to 
  run the PMD ruleset locally. More infos how to install and use it on our ArchiLab infopage:
  [https://www.archi-lab.io/pmd](https://www.archi-lab.io/pmd).
- For our subjective selection of Clean Code and SOLID principles, see our ArchiLab infopage
  [https://www.archi-lab.io/cc-solid](https://www.archi-lab.io/cc-solid).



## E3: Code Rules (Clean Code and SOLID Principles, No Cyclic Dependencies, DDD Rules)

![Bloom-Level](./images/5-filled-32.png)
[Level 5 (Evaluate) in Bloom's Taxonomy](https://www.archi-lab.io/infopages/material/blooms_taxonomy.html#level5)

You need to continue applying the Clean Code rules and the SOLID principles. We will check the following aspects:

* Clean Code
    * Meaningful names for variables, classes, packages, ...
    * Methods should be small, not longer than max. 30 lines of code, and if possible should be much smaller.
    * Code lines should not extend 120 characters - add a linebreak otherwise, or try re-writing the code.
* SOLID
    * Single Responsibility Principle
        * Classes should serve one purpose only
        * No domain business logic in application services or controllers
    * Open-Closed Principle
        * No public access to member variables
        * States (see above for ShoppingBasket) must be encapsulated - no possibility of directly changing the status from outside
    * Dependency Inversion Principle
        * No cyclic dependencies - avoid them by applying the DIP

There is also a no-cycle-test, and some other DDD rule tests. 



## E4: Code Review - Manual Tests

![Bloom-Level](./images/5-filled-32.png)
[Level 5 (Evaluate) in Bloom's Taxonomy](https://www.archi-lab.io/infopages/material/blooms_taxonomy.html#level5)

In addition we will check your code manually. Manual tests will be performed by 
looking at samples (Stichproben) of the students' solutions. Therefore, the manual
tests for E4 will all be initially green. If we pick your solution for a manual check, and we find violations, then
it will turn red. You will see the feedback in error message. We will not perform a thorough code review, but
check certain critical aspects of your code.

### Your Task in E4

* Resolve cyclic dependencies in your code, using the Dependency Inversion Principle (DIP). 
* Apply the Clean Code rules and the SOLID principles. 
* Fix issues we give you in the manual review.


## Additional Help for Clean Code and SOLID

- Some of the automated tests are based on the PMD Source Code Analyzer, which runs in our pipeline (so you
  don't have this locally). If you want to learn more about each test, feel free to check the
  documentation at [pmd.github.io](https://pmd.github.io/latest/pmd_rules_java.html).
- Although PMD is not available as a local unit test, there is an IntelliJ plugin that you can use to 
  run the PMD ruleset locally. More infos how to install and use it on our ArchiLab infopage:
  [https://www.archi-lab.io/pmd](https://www.archi-lab.io/pmd).
- For our subjective selection of Clean Code and SOLID principles, see our ArchiLab infopage
  [https://www.archi-lab.io/cc-solid](https://www.archi-lab.io/cc-solid).





| Requirement          | Verb   | URI             | 
|----------------------|--------|-----------------|
| (1) Get client email | GET    | /clients/email  |   
| (2) Add new client   | POST   | /clients        |
