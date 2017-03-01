# buildship-test
Reproducible testcase for Buildship

Steps to reproduce:
* clone this repo
* cd REPO1
* ./gradlew publishToMavenLocal
* In Eclipse open a new workspace, and then import "Existing Gradle Project" and select the directory COMPOSED
* Things should look good in Eclipse, however now inspect the classpath in Eclipse and you will see that projectD doesn't depend on neither project B or A
