//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: escape room (clickablething)
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


/**
 * @author Sheriff
 *
 */
public class ClickableThing extends VisibleThing {
  private Action action; // action returned from update when this object is clicked
  private boolean mouseWasPressed; // tracks whether the mouse was pressed during the last update()

  /**
   * @param name
   * @param x
   * @param y
   * @param action
   */
  public ClickableThing(String name, int x, int y, Action action) {
    // calls super class
    super(name, x, y);
    // sets action and mouse pressed
    this.action = action;
    mouseWasPressed = false;

  } // initializes this new object

  /*
   * (non-Javadoc)
   * 
   * @see VisibleThing#update()
   */
  @Override
  public Action update() {
    // calls update on super class
    super.update();
    // checking if mouse is currently pressed and if it is over a clickable thing
    if (getProcessing().mousePressed && !mouseWasPressed
        && isOver(getProcessing().mouseX, getProcessing().mouseY)) {
      // updating mouse was pressed
      mouseWasPressed = getProcessing().mousePressed;
      // returns action
      return action;
    }
    // updating mouse was pressed
    mouseWasPressed = getProcessing().mousePressed;
    // returns null
    return null;
  } // calls VisibleThing update, then returns action only when mouse is
    // first clicked
}
