Recent Learning Outcomes
------------------------

* What have you learned about polymorphism, inheritance, and classes from 
  the recent class sessions?
    * Phrased in a different way: What were the goals of the inheritance
      lab?

Documentation
-------------

* At least four audiences
    * Fellow developers
        * Overview - How things fit together (plus some agreement
          on important details)
    * Yourself
        * What do I want to do here?
    * The client programmer
        * Overview - Big picture in *usage*, not implementation
        * Individual classes and methods
    * For the maintainer
        * Overview (the Developer's overview probably suffices)
        * Details of implementation strategy/approach
* Good programmers think about all levels and document at all levels
* But client programmers are your biggest audience.  So we focus on 
  documentation for that audience.

Javadoc
-------

* Standard tool for documenting Java.
* Traditionally creates linked HTML pages.
* Comments precede "things" - classes, interfaces, fields, methods, constants, 
  etc.
* Comments start with slash-star-star and end with star-slash.
* Can include internal tags.  (Start with @)
* Can include HTML tags.

Informal lab  
------------

* Start with your classes from the inheritance lab.  Don't add comments (yet).
* Use the Javadoc tool to generate Javadoc.  
    * Project > Generate Javadoc
    * You can put the documentation in your project.
    * But you may find it useful to put it elsewhere.
* Preview the Javadoc in Eclipse.
* Preview the Javadoc in your Web browser.
    * `file:///home/username/path/to/project/doc/index.html`
* Add some Javadoc-style comments and see their effects.
* Figure out how to get different levels of protection revealed (or not
  revealed)
* Add preconditions and postconditions.
    * `-tag pre:cm:"Preconditions"`
    * `-tag post:cm:"Postconditions:"`
* Play (e.g., add constants and other things.)
