Thinking about memory
---------------------

* Folks have been having a bit of trouble thinking about memory in
  Java.
* So we'll step back and look at a few big picture issues.
* Memory is traditionally divided into three parts
    * Static
    * Stack
    * Heap
* Local procedure variables go on the stack.
* Objects created with `new` or `malloc` or the equivalent go on the
  heap.
* Some globals go in static memory.

Sample code

    public class Counter {
        static int operations = 0;
        int counter;
        void increment() {
            ++Counter.operations;
            ++this.counter;
        } // increment()

        void decrement() {
            ++Counter.operations;
            --this.counter;
        } // decrement()

        int get() {
            ++Counter.operations;
            return this.counter;
        } // get()
    } // class Counter

    public class CounterExpt {
        public static void main(String[] args) {
            Counter c1 = new Counter();
            Counter c2 = new Counter();

            c1.increment();
            c1.increment();
            c2.decrement();

            System.out.println("ops: " + Counter.operations);
            System.out.println("c1: " + c1.get());
            System.out.println("c2: " + c2.get());
            System.out.println("ops: " + Counter.operations);
        } // main
    } // class CounterExpt
   
We'll walk through the setup of memory

Note that we can do less detail and still learn a lot.  

* Example: throw away left subtree.

Loop invariants
---------------

* Problem: Programmers write incorrect code.
* Approach one: Identify incorrect code with unit tests.
* Approach two: Encourage programmers to think more carefully about their
  code so that they write correct code in the first place.
* Experience suggests that most problems stem from loops.
* So we start there.
* Think carefully about the expectations.

Data Structure Invariants
-------------------------
