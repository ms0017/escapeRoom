//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: escape room (draggable thing)
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
public class DraggableThing extends VisibleThing {
  private boolean mouseWasPressed; // similar to use in ClickableThing
  private boolean isDragging; // true when this object is being dragged by the user

  private int oldMouseX; // horizontal position of mouse during last update
  private int oldMouseY; // vertical position of mouse during last update

  public DraggableThing(String name, int x, int y) {
    // calling the super class
    super(name, x, y);
  }

  @Override
  public Action update() {
    // calling update on super class
    super.update();
    // checking if mouse is dragged
    isDragging = getProcessing().mousePressed;
    // if its not draged
    if (!isDragging) {
      // set the old positions with mouse x and y
      oldMouseX = getProcessing().mouseX;
      oldMouseY = getProcessing().mouseY;
    }
    // if object is dragged,
    if (isDragging && isOver(oldMouseX, oldMouseY)) {
      // move the object
      move(getProcessing().mouseX - oldMouseX, getProcessing().mouseY - oldMouseY);
      // set the old positions with mouse x and y
      oldMouseX = getProcessing().mouseX;
      oldMouseY = getProcessing().mouseY;

    }
    // if mouse was just clicked,
    if (!isDragging && mouseWasPressed) {
      // set mouse pressed
      mouseWasPressed = getProcessing().mousePressed;
      // and return drop
      return drop();
    }
    mouseWasPressed = getProcessing().mousePressed;
    return null;
  } // calls VisibleThing update(), then moves according to mouse drag
  // each time isDragging changes from true to false, the drop() method below will be called once
  // and any action objects returned from that method should then be returned from update()

  protected Action drop() {
    return null;
  } // this method returns null
  // subclass types will override this drop() method to do more interesting things
}
