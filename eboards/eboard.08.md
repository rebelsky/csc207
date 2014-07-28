CSC207.01 2014S, Class 08: Input and Output
===========================================

_Overview_

* Preliminaries.
    * Admin.
    * Notes on HW 2.
    * Questions.
* Lab.

Preliminaries
-------------

### Admin

* Notes from yesterday's review session are now posted.  We had some fun 
  exploring ArrayLists and Vectors.
* There more I use it, the more I'm finding that using a modified GNU 
  style for Java programs is not ideal.  
    * I'll be working on a new style that I'll distribute on Monday.
    * For now, you may not see spaces before open parens and the method 
      name will be on the same line as all of the modifiers.
* Yesterday's talk reminded me that there's a lot of work to do to get
  the Ushahidi Java API running again.  Further investigation suggested
  that there are now multiple Web APIs, not all of which are supported
  on all sites.  We'll see how it goes.
* Reading for Monday: Review the Objects and Classes reading.
* Today's writeup: Exercise 6
    * Due Monday
    * Subject: CSC 207 Writeup 6: Input and Output (YOUR NAME(S))
* Extra credit: 
    * CS Table TODAY: The ACM Code of Ethics.
    * Thursday Extra Next Week: Red/Black Trees.
    * Convo Feb. 5.
       * Why you should attend convo (and Rosenfield!)
    * Chinese New Year Celebration, tonight, 5:30-8pm, Harris.  Food!
    * More?

### Notes/Questions on HW 2

_Why do I ask you the average question?_

> Because there's a great story about binary search in Java.

> http://googleresearch.blogspot.com/2006/06/extra-extra-read-all-about-it-nearly.html

_What is "amortized time"?_

> "On average, it takes. ..."

_How do you write a good hash function for Fractions?_

> We'll talk about that later.

### Questions

Lab
---

_What's that `true` in `new PrintWriter(System.out, true)`?_

> It indicates that the `PrintWriter` should autoflush 

_Where does the file go?_

> You should probably give a full pathname.

> Otherwise, it has some silly default location, like "In the directory that the 
  code resides."
