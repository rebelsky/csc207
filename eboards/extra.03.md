CSC 207 2014S: Extra Session, Week 3
====================================

Overview

* You ask questions.
* I try to give answers.

Questions
---------

_Can you help me think through the last question?  I split the string into parts.
 How would I then change a string into a mathemical operator?_

    String[] stuff = input.split(" ");
    BigInteger result = new BigInteger(stuff[0]);
    for (int i = 1; i < stuff.length; i += 2) 
      {
        String operator = stuff[i];
        BigInteger operand = new BigInteger(stuff[i+1]);
        // Case 1: Addition
        if (operator.equals("+"))
          {
            result = result.add(operand);
          } // "+"
        // Otherwise, it's not a valid operator
        else
          {
            throw new Exception("Invalid operator: " + operator);
          } // if not a valid operator
      } // for

_How can we do a better job of going from our concept to our implementation?_

> I'm not sure.

_How upset are you that our CSV code crashes on invalid inputs?_

> Not very.  I told you to assume valid inputs.

_Can we watch Sam fail to write the CSV program?_

> Sure.

> Thirty minutes later, we had a working program, which does some checking of input.
