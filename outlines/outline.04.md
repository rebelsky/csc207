Outline 04: Git, Revisited
==========================

Held: Wednesday, 4 September 2013

Back to [Outline 03 - An Overview of Java](outline.03.html).
On to [Outline 05 - Unit Testing](outline.05.html).

**Summary**

We revisit Git, this time emphasizing command-line Git.

**Related Pages**

* [Reading: Git](../readings/git.html)
* [Reading: Simple Java for C Programmers](../readings/simple-java-c.html)
* [Lab: Git on the Command Line](../labs/git-command-line.html)
* [Lab: Code Reading](../labs/reading-java.html)
* [EBoard](../eboards/04.html) 
  ([Source](../eboards/04.md))
  ([PDF](../eboards/04.pdf))

**Overview**

* Quick discussion of approaches.
* Lab: Git on the Command Line
* Lab: Reading Java

**Administrivia**

* Note: Elevators require much more energy than you do.  Some people are
  injured and need the elevator.  Please use the stairs if you can.
* Please fill out the RICS Pretest if you have not done so already.
  http://bit.ly/risc-pretest
* Apologies again for the Git+Eclipse lab.  We'll use the approach that
  I normally use (command-line Git plus Eclipse).
* Reminder: EC for CS Table this Friday (Turing on AI)
* [Assignment 2](../assignments/assignment.02.html) is ready.  We'll
  spend a few minutes looking at it.  Note that it has a prologue and
  epilogue. 
* Today's labs:
  [Getting Started with Git on the Command Line](../labs/git-command-line.html)
  [Reading Java](../labs/reading-java.html)
* Reading for tomorrow:
  [Unit Testing and JUnit](../readings/unit-testing.html)

Command-Line Git and Eclipse
----------------------------

* Since I don't regularly use EGit, it's difficult for me to debug problems.
  It also seems less able to access some interesting and useful Git features.
* I'm therefore going to have you focus on using Git from the command line.
  (Don't worry, it's not too scary.)  You might also be able to find some
  GUIs for command-line Git.
* How do we work with Eclipse if all of our Git commands are outside of
  Eclipse?
    * Committing is still straightforward.  We just open a terminal
      window, switch to the directory for the project, and use the
      appropriate combination of <code>git add</code> and 
      <code>git commit</code>.
    * Pulling updates is a bit more complicated.  Once you've updated
      your repository, you'll need to tell Eclipse about the update.

Things You Should Figure Out
----------------------------

_Yes, the lab should help with some of this._

* How do you see what changes you've made (as a reminder before committing)?
* How do you deal with conflicting changes?
* How do you rollback unwanted changes?

