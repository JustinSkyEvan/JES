# Player class implementation
Author: Justin Wu, Evan Ballinger, Tian Liu
Version: 20181023.1
Copyright (c) 2018
1. Project Name
Spin the Wheel Coin Matching Game
2. Directory Organization
2.1 Top-Level:
Instructions (README.TXT)
Java source code in unnamed package (*.java)
JUnit source code test classes (*Test.java)
Buildfile for Ant (build.xml)
Proguard configuration (*.pro)
Directory of support tools for development and testing (lib/)
2.2 lib/
Files that support JUnit, JaCoCo, Checkstyle, Java2HTML, CPD, PMD, Proguard
See:
https://junit.org
https://www.jacoco.org/jacoco/trunk/doc
http://checkstyle.sourceforge.net
http://www.java2html.com
https://pmd.github.io
https://sourceforge.net/projects/proguard/
3. Automation via Ant
See: https://ant.apache.org
The default target (all) removes artifacts from previous builds and tests, creates maintainer-appropriate API documentation (doc-private), generates HTML formatted versions of the source code, verifies adherence to some Java coding conventions, runs JUnit tests and formats results, determines code coverage of the tests, and flags areas of the source code most likely to contain weaknesses (including complexity metrics).
The set of main targets can be displayed at the command line using: ant -p
For example...
% ant -p
Buildfile: build.xml

      Build file for StrategicPlayer project
  
Main targets:

 checkstyle           generate checkstyle report
 clean                clean up
 compile              compile the source
 cpd                  proccess source with CPD
 dist                 generate the distribution
 doc                  generate the usage documentation
 doc-private          generate the maintenance documentation
 env                  display build parameters
 format               generate formatted versions of source code
 optimize             optimize using proguard
 pmd                  process source with PMD
 report               format junit test results
 run                  run driver
 test                 run junit tests
 testCoverage         run junit tests with JaCoCo instrumentation
 testCoverageReport   format JUnit and JaCoCo test results
 testOptimized        run junit tests using optimized jar
 testOptimizedReport  format junit test results using optimized jar
Default target: all
%
