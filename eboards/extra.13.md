CSC 207 2014S: Extra Session, Week 13
=====================================

Overview

* Admin
* You ask questions.
* I try to give answers, or at least direct you in the right direction.
* Yes, many errors have been identified and will be corrected soonish.

Questions and Answers
---------------------

_Is problem 1 closely related to something we did in lab?_

> Yes.

_Can we just submit our answers to that lab writeup?_

> I would not recommend it.

_Can we refer to them?_

> Certainly, provided you cite.

_For problem 2a, how many unit tests should we write?_

> A minimum of 49, although they can be combined into a single function.
  There are seven ways to rearrange a subtree tree after deleting the "root".
  There are seven places that subtree can be.  (See Q&A in exam.)
  7x7 is 49.

_For problem 2b, are there hints?_

> Take advantage of things like

	                operation = "remove(" + key + ")";
	                ops.add(operation);
	                ...
	  static void reportError(BST<Character, String> dict, ArrayList<String> ops,
	                          String message)
	  {
	    System.err.println(ops);
	    dict.dump(new PrintWriter(System.err, true));
	    fail(message);
	  } // reportError
	
_Tips on problem 3?_

> Go through the versions systematiclaly.

_On problem 4, is there an order in which we have to iterate the keys and values?_

> No.  Whatever order is most convenient.
