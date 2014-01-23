CSC207.01 2014S, Class 03: An Overview of Java
==============================================

_Overview_

* Preliminaries.
    * Admin.
    * Homework.
    * Questions.
* Some notes on Java.
* Lab: Simple Code Reading (more or less).
* Reflection.

Preliminaries
-------------

### Admin

* Yes, we'll do attendance again today, this time by describing your
  lab partners for weeks one and two.
* Make sure to sign up for a fifteen-minute interview if you have
  not done so already.
* Please respond to Earnest's survey if you have not done so already.
    * Review sessions are tentatively Mondays at 7pm.
    * And those will be your best time for HW help.
* I got over 200 email messages from students on Tuesday.  
    * (Yes, it's my fault for having students submit homework via email.)  
    * So that I can navigate my inbox, It's very important to me that you 
      take the time to title your email messages correctly.
* Just so you know, we're going to continue to learn how to use the 
  lab equipment (so to speak) for the next few classes.
* I will hold a review session tomorrow at 10:00 a.m.  
  (We probably don't need one yet, but I'd like to get started.)
* Extra credit: 
    * Thursday extra on summer research in CS, Thursday @ 4:30 in Noyce 3821.
    * Extra credit: CS Table Friday at noon: 3D Printing (of body parts?).
    * Extra credit: Theatre Gigante Friday evening.  Get tickets.

### Homework

* Lab writeup: Extra 1.
    * Subject: CSC 207 Writeup 2: Reading Java (*Your Name Here*)
    * Due before class on Friday.
* Reading on Unit Testing for Friday's class.
* HW 2 distributed.  Due next Wednesday at 10:30 p.m.
    * Are you happy with the way it's listed in Google calendar?

### Questions

_When are lab writeups due?_

> Monday->Wednesday, Tuesday->Friday, Wednesday->Friday, Friday->Monday.

Some notes on Java
------------------

* At first, looks like C.
    * Much pickier compiler.
    * Much more verbose.
       public static void 
         main (String[] args)
           throws Exception
       {
       }
   * No explicit pointers
       * Implicit pointers
   * Strings are strings, not char *.
       * Nice example: String result = "hello" + "goodbye";
       * Generalized: String result = str1 + str2;
       * IN C: char *result = strcat (str1, str2);
       * IN C: char *result = strncat (str1, str2, ?);
       * In C: 
           char * result = malloc (sizeof(char) * (strlen(str1) + strlen(str2) + 1));
           strcpy (result, str1);
           strcat (result, str2);

Lab: Simple Code Reading (more or less)
---------------------------------------

Reflection
----------

