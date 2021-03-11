//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: escape room (action)
// Files: NONE
// Course: CS 300, spring, and 2019
//
// Author: Sheriff Issaka
// Email: issaka@wisc.edu
// Lecturer's Name: Gary
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name: (name of your pair programming partner)
// Partner Email: (email address of your programming partner)
// Partner Lecturer's Name: (name of your partner's lecturer)
//
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
// ___ Write-up states that pair programming is allowed for this assignment.
// ___ We have both read and understand the course Pair Programming Policy.
// ___ We have registered our team prior to the team registration deadline.
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully
// acknowledge and credit those sources of help here. Instructors and TAs do
// not need to be credited here, but tutors, friends, relatives, room mates,
// strangers, and others do. If you received no outside help from either type
// of source, then please explicitly indicate NONE.
//
// Persons: NONE
// Online Sources: NONE
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////



import java.util.ArrayList;

/**
 * @author Sheriff
 *
 */
public class Action {
  // instance of message
  private String message;
  // instance of thing
  private Thing thing;

  /**
   * @param message sets message
   */
  public Action(String message) {
    // sets message
    this.message = message;
  }

  /**
   * @param thing sets thing
   */
  public Action(Thing thing) {
    // sets thing
    this.thing = thing;
  }

  /**
   * @param message
   * @param thing   this method is utilized when both a name and a message are used to call action
   */
  public Action(String message, Thing thing) {
    // sets both name and thing
    this.message = message;
    this.thing = thing;
  }

  /**
   * @param allThings adding things to array list
   */
  public void act(ArrayList<Thing> allThings) {
    // checking if thing is null
    if (thing != null) {
      // if not, then thing is activated
      thing.activate();
      // adding new thing to array list of things
      allThings.add(thing);
      // setting thing to null
      thing = null;
    }
    if (message != null) {
      // message to be printed if it isn't null
      System.out.println(message);
    }
  }
}
