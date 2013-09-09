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
