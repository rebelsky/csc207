CSC207.01 2014S, Class 50: An Introduction to Android Development
=================================================================

_Overview_

* Preliminaries.
    * Admin.
    * Questions.
* Why build Android Apps?
* Issues in Android development.
* Warnings!
* Lab.

Preliminaries
-------------

### Admin

* I was generally quite impressed by the work shown in your presentations yesterday.  
  Thanks for your hard work.  I'll need to find a way to allow demos next year.
* [Exam 3](../assignments/exam.03.html) discussed.
* Our in-class final is scheduled for 2pm Tuesday, 13 May 2014.
    * You may also take it at 2pm on Thursday, 15 May 2014.
    * There will be a take-home alternate available, due 5pm on Thursday,
      15 May 2014.
    * I will do my best to distribute both on Wednesday, 7 May 2014.
* This week will be work on Android.  No writeups necessary.  Next week
  is mostly review.
    * We have about eight Android devices, so groups of three are probably
      necessary.
    * Neither Earnest nor Sam are Android experts, so we may not be able
      to help you with everything.

### Upcoming Work

* Reading for Wednesday: [Making Apps Do Things](../readings/android-actions.html)
* Today's writeup: No writeup.
* Work on the exam.

### Extra Credit

* Eric Mistry MAP presentation, tonight, 6:30 p.m. ARH 302.
* CS extra Thursday: Edward Snowden TED Talk.
* CS table Friday: Edward Snowden.

### Questions

Why build Android Apps?
-----------------------

* Adds important issues to the class.
* Lots of examples of object-oriented design.
    * Event handlers.
    * Ways to structure the program.
    * Design patterns.
    * Etc.
* Some new issues for the class
    * Event-driven programming
    * A little bit of GUI programming
    * Not all programming is Java
    * Some programming is better done with code-generation tools
* Potentially fun
* Potentially frustrating

Issues in Android development
-----------------------------

* Eclipse (different version)
* Lots of interacting pieces
* Lack of knowledge of Mentor and Teacher

Warnings!
---------

* Lack of knowledge of Mentor and Teacher

Lab
---

So, why would we use

        android:text="@string/greeting"

rather than

        android:text="Hello!"

Puts all of the strings in one file, just in case you want to change one

* Rename something (e.g., the application name)
    * General use of variables
* An event that edits text can be changed everywhere - E.g., a user or contact
  name.
* i18n
* a11y

