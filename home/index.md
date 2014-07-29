Front Door
==========

Introduction
------------

Welcome to the Fall 2014 session of Grinnell College's CSC 207,
*Algorithms and Object-Oriented Problem Solving*, which is described
relatively briefly in the official [blurb](../handouts/blurb.html).
My own take on this course is that this is the course where you really
start delving deeply into what it means to be a computer scientist,
computer programmer, or software designer.  We will continue your
exploration of the design of algorithms, data types, and programs,
but will delve more deeply into tools and analysis techniques related
to each.  We will use Java as our programming language because it
supports some tools and techniques you have not learned previously,
particularly through its support of the object-oriented paradigm.
As in all Grinnell classes, we'll also be working on general skills,
from group work to thinking on your feet.

You have the fortune (or misfortune) to be in an experimental new version
of CSC 207.  This semester, we will be the first class at Grinnell to
use the new Java 8.  We will also be exploring some aspects of Computing
for Social Good (CSG), using techniques from the Free and Open Source
(FOSS) community, as well as the open-source application Ushahidi.
I think working with the FOSS tools, Ushahidi, and Java 8 build many
skills you will find valuable, particularly if you continue in a career
in software development, but also in other domains.

I assume that you have mastered much of the material from CSC 151
and CSC 161.  Among other things, you should understand recursion,
the need for documentation, linked lists, higher-order programming,
and some basic algorithms for sorting and searching.

In an attempt to provide up-to-date information, and to spare a few
trees, I am making this as much of a "paperless" course as I can.  Hence,
materials will be in a course web.  If you are puzzled by the organization
of the Course Web, browse a bit and then ask me.  If you find that you
want paper copies of pages, please read the notes on printing copies.
If you find that you are regularly printing pages, let me know and I
can provide them for you.

Important Warnings
------------------

*Warning!*  Computers are sentient, stupid, and malicious.  When things
go wrong, don't blame yourself.  Ask me, a tutor, or the class mentor
for help.

*Warning!*  We are using some cutting-edge software, which means that
things will occasionally crash for no good reason.

Basics
------

*Meets*: MTWF 11:00-11:50, Science 3813.
Optional review sessions with SamR, Thursdays, 11:00-11:50, Science 3813.

*Instructor*: 
[Samuel A. Rebelsky](http://www.cs.grinnell.edu/~rebelsky/),
<email>rebelsky@grinnell.edu</email>,
Science 3824.  269-4410 (office).  236-7445 (home).  
Office hours:  TBD.
I also tend to follow an open door policy: Feel
free to stop by when my door is open or to make an appointment for
another time.

*Class Mentor*: Mira Hall, <email>hallmira@grinnell.edu</email>.
Office hours TBD.

*Grading* (subject to change):

* Class attendance and participation: 10%;
* Homework (some individual, some group): 15%;
* Daily Lab writeups: 10%;
* Peer assessment: 5%;
* Project: 10%;
* Two take-home examinations: 30%;
* Required take-home final examination: 20% (date TBD)

More information on grading can be found in the
[grading policies](../handouts/grading.html) page.

*Labs*: 
Like many courses in our department, computer science 207 is taught in
a *collaborative workshop style*.  Each day, you'll work on laboratory
problems with other students in the class.  On most days, you will need
to submit a short laboratory writeup.  (The 2014S students suggested that
a lab writeup consist of just a list of the two or three most important
things you learned, and I'm going with that.)  We may also start or end
each lab session with a short lecture/discussion or a clicker activity.

*Extra Credit*:
I will often offer one unit of extra credit for attending a specified
academic event (e.g., a computer science talk or College convocation)
or for supporting your classmates in their public endeavors (e.g.,
attending a concert, dance recital, or sporting event).  Each category
is capped at four units of extra credit, which count as one point
toward your final grade.  So, if you attend four academic events and
four peer support events, you will receive an additional two points
toward your final grade.  For any activity you wish to credit this way,
you must send me a short (one paragraph) note about the activity within
two days of the activity.

This semester, I've started a page of [useful
resources](../handouts/resources.html).  Each link you contribute to
that page that I then incorporate will earn you one unit of extra credit.
I will also cap these units of extra credit.

*Tutoring*:
Evening tutors are not required to know the material for CSC 207.
Some will be able to help you.  Many will not.  I recommend that you
rely on your me, on your class mentor, and on each other.

*Class Software*:
For this course, we will be using a wide variety of plain off-the-shelf
software (POTS) as well as some locally developed software.  Tools you
will use include Git (and [GitHub](http://github.com)), Java 8, Eclipse,
JUnit, and Ushahidi.  Locally developed software includes a simplified
API for Ushahidi and a few implementations of ADTs.

*Printing Pages*:
Most of the pages in the course web are designed for viewing onscreen.
If you'd like to print them, you may want to use PDF versions, which
are designed for paper.  To find the PDF version, simply replace
the `html` at the end of the URL with `pdf`.
If you do decide to print, you should consider printing the document
double-sided and two-up (that is, two pages side-by-side on one
physical page) so as to conserve paper.  When I distribute documents,
I will do my best to distribute them in this form.

An Experimental Course Theme: Computing for Social Good with Ushahidi 
---------------------------------------------------------------------

Computer science is the study of problem solving.  So, as we study CS,
we can choose particular domains for solving problems.  As you know,
in CSC 151 we use image making as our problem domain and in CSC 161 we
use robotics as our problem domain.  For this course, we will explore
some basic issues of computing for social good as our problem domain.
Many, but not all, of our activities will emphasize these issues.

### The Role of Ushahidi

As mentioned above, we will be using the open-source crowdmapping platform
Ushahidi in this course.  Ushahidi was originally developed to provide
a venue for people to report election violence in Kenya.  It permits
anyone to provide geographic reports of incidents, using either relatively
low tech approaches (SMS, Twitter) to relatively high tech (smart phone
or Web apps) and supports both anonymous reporting and independent 
verification of incidents.

Ushahidi will serve two primary roles in the course.  For most of the
semester, Ushahidi will serve as the primary data source for our work
in designing and implementing algorithms, abstract data types, and data
structures.  After fall break, you will also employ Ushahidi in a small
consulting project that you will do in a group with a community partner.
Further details on that project will come right before fall break.

### GUI Building with JavaFX

Traditionally, we have not included GUI construction in CSC 207 (or
its predecessor, CSC 152).  However, I think that GUI's can help reveal
important aspects of object-oriented design. Hence, as an experiment, we
will be using a small bit of JavaFX, which is the new *de facto* GUI
toolkit for Java.

Optional Books and Other Readings
---------------------------------

Eckel, Bruce (2002).
[Thinking in Java](http://www.mindview.net/Books/TIJ/)
(3rd Edition).

>   A nice book about thinking like an object-oriented programmer.  The
3rd edition is a bit out of date (as is the 4th edition), but it's
still a nice resource, particularly since it's free on the Web.

Oracle (2014).  [The Java Tutorial](http://docs.oracle.com/javase/tutorial/).

> Oracle's standard tutorials on Java.  These won't help you (much) with
learning data structures and algorithms, but can give you some in-depth
understanding of certain topics in Java.

Rebelsky, Samuel (2014).  The TAO of Java.

> An online workshop-style textbook on types, algorithms, and objects
in Java.  Incorporated within the course web.

Rebelsky, Samuel (2014).
[The CS207.01 2014F Course Web](index.html).

> The hypertext that you are currently reading.  Many of these materials
(particularly those under [Readings](../readings/)
and [Labs](../labs/) are required.  You should make
it a point to load the page of the day at the beginning of each class
to check announcements and such.

Author (201x).  *Title*, Edition.

> While I would hope that *The Tao of Java* suffices for learning
material, many students have indicated that they'd like a "real" textbook.
Unfortunately, there are currently no textbooks that support learning
Data Structures and Algorithms using the new features of Java 8.  Hence,
you can probably get by with just about any relatively recent textbook
on Data Structures and Algorithms in Java.  In the past, I've suggested
the 4th edition of Mark Alan Weiss's *Data Structures &amp; Problem Solving 
Using Java*.  However, as I noted, that does not support the new ideas in
Java 8. 

