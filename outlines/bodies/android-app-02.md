Android activities
------------------

* Effectively, another screen.
* Create using GUI.

Switching between activities
----------------------------

Often done with Intents.  

* Sam doesn't know enough about android to know if we should always
  start a new Intent each time we want to switch.
    * We probably don't.
    * But it's easier if we start out switching.

Typical code

    public void onClickToInfo(View v) 
    {
        Intent intent = new Intent(this, NameOfActivity.class);
        startActivity(intent);
    } // onClickToInfo(View)

Lists
-----

* A way to display collections of data.
* Adapters can move data from an array (or other data structure) into a
  display list.
