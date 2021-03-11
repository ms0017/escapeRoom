//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: escape room (thing)
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


import processing.core.PApplet;

/**
 * @author Sheriff
 *
 */
public class Thing {


  private final String NAME; // the constant name identifying this object
  private boolean isActive; // active means thing is visible and can be interacted with

  // making an instance of PApplet and initializing to null
  private static PApplet processing = null;

  /**
   * @param processing setting processing
   */
  public static void setProcessing(PApplet processing) {
    // setting processing
    Thing.processing = processing;
  }

  /**
   * @return processing
   */
  protected static PApplet getProcessing() {
    // returns processing
    return processing;
  }

  /**
   * @param name sets name and active
   */
  public Thing(String name) {
    // sets name
    NAME = name;
    // sets active to true
    isActive = true;
  }

  /**
   * @param name
   * @return isName
   */
  public boolean hasName(String name) {
    // boolean to be used below
    boolean isName = false;
    // if the names are equal,
    if (name.equals(NAME)) {
      return !isName;
    }
    // if they aren't,
    return isName;
  }

  /**
   * @return is active
   */
  public boolean isActive() {
    // returns is active when called
    return isActive;
  }

  /**
   * sets is active to true
   */
  public void activate() {
    // sets is active to true when called
    isActive = true;
  }

  /**
   * sets is active to false
   */
  public void deactivate() {
    // sets is active to true when called
    isActive = false;
  }

  /**
   * @return null
   */
  public Action update() {
    // just returns null
    return null;
  }
}
