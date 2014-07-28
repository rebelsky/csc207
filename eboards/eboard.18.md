CSC207.01 2014S, Class 18: Using Java from the Command Line
===========================================================

_Overview_

* Preliminaries.
    * Admin.
    * Upcoming work.
    * Questions on the exam.
* Javadoc.
* A brief overview of command-line commands.
* Ant and Maven.
* Lab.

Preliminaries
-------------

### Admin

* Start Eclipse.  Bring up your inheritance project.
* There are two labs today: One on Javadoc and one on using Java from
  the command line.  Do both.
* It sounds like the MathLAN problems have been diagnosed and, maybe, fixed.
* Cookies!
* No review session this week.  I'm taking the middle school math team to
  their competition.
* I'll reserve a few minutes for discussion of the exam.  Bring questions
  on Wednesday, too.
* Mentor session tonight at eight.
* Extra credit: 
    * CS Extras: Technical Interviews
    * CS Table: Skip Lists
    * More?

### Upcoming Work

* Work on the exam.
* Reading for tomorrow: Linear and Binary Search in Java
* No writeup for today's lab.

### Questions

_Do we ever have to shrink the array in problem 4?_

> No.

Javadoc
-------

* Good idea: Internal documentation gets turned into easier-to-use documentation
* You must use Javadoc starting now!
* Style:

    /**
     * Hello.
     */

A brief overview of command-line tools
--------------------------------------

* javac FILE.java - creates FILE.class
* java FILE - Runs FILE.class, which better have a main
* jar - Create an archive (may not be the exact command)
* javadoc - Generate documentation
* junit - Run unit tests (doesn't always work as expected)

Issue: Where does it look for the .java and .class files?

* Directory structure: Foo.java in edu.grinnell.csc207.samr needs to be in
  the directory edu/grinnell/csc207/samr
* For ease of searching, the parent directory needs to be in your CLASSPATH
  environment variable

Ant and Maven
-------------

Ant and Maven manage the build, document, test process

Sensible directory structures

Lab
---

