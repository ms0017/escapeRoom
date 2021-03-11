//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: escape room (drag and droppable)
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
public class DragAndDroppableThing extends DraggableThing {

  private VisibleThing target; // object over which this object can be dropped
  private Action action; // action that results from dropping this object over target

  /**
   * @param name
   * @param x
   * @param y
   * @param target
   * @param action
   */
  public DragAndDroppableThing(String name, int x, int y, VisibleThing target, Action action) {
    // calling super class with appropriate parameters
    super(name, x, y);
    // setting target and action values
    this.target = target;
    this.action = action;

  } // initialize new object

  /*
   * (non-Javadoc)
   * 
   * @see DraggableThing#drop()
   */
  @Override
  protected Action drop() {
    // checking if object is over target
    if (isOver(target)) {
      // checking if target is active
      if (target.isActive()) {
        // deactivating target and object
        target.deactivate();
        this.deactivate();
        // returning action
        return action;
      }
    }

    return null;

  } // returns action and deactivates objects in response to successful drop
  // When this object is over its target and its target is active:
  // deactivate both this object and the target object, and return action,
  // otherwise return null
}
