Detour: Model-View-Controller
-----------------------------

* How hard would it be for you to rewrite your calculator to have a
  graphical user interface (assuming we know how to make graphical
  user interfaces)?
* Ideally, when you think about problems like the calculator, you
  structure your program so that different parts are decoupled.
* One common approach is the model/view/controller, or MVC.
    * The model stores the data and does the real work.
    * The controller takes user input and sends commands to the
      model.
    * The view shows the state of the model, either because the model
      pushes the data to the view or because the view pulls data from
      the model.
* If you think about calculators through MVC, how might you design 
  (or redesign) your calculator?

Review: ADT Design
------------------

* What are the things we think about as we design an ADT and the
  corresponding data structure.

A New ADT: Dictionaries
-----------------------

* "Like arrays, but indexed by whatever type of object your want."
* So, what methods would you include?
* What about iterators?
* Note that *Dictionary* is but one of a few names for this kind of
  data structures.
     * Some call it a *Map*, because it maps keys to values.
     * Some call it a *Table*, because they think of it as a key/value
       table.
     * Some call it a *Hash*, because one of the most popular implementations
       of dictionaries uses something called a hash table.
     * Some call it an *Associative Array* because it's like an array, 
       and associates values with keys.
     * Wikipedia says that some people call this a *Symbol Table*, but
       I'll admit that I think of symbol tables as a more restricted
       type.

Implementing Dictionaries: The Basics
-------------------------------------

* Probably easiest to start with an unordered array or linked list.
* We'll store key/value pairs in the array of list.
* We can implement `put` by adding to the front of the
  linked list (or the back of the array).
* We can implement `get` by searching the linked list or array.
* How should we deal with a `set` for an element already in the
  array?
