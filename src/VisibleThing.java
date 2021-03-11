//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: escape room (visible thing)
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


import java.io.File;
import processing.core.PImage;

/**
 * @author Sheriff
 *
 */
public class VisibleThing extends Thing {
  private PImage image; // the graphical representation of this thing
  private int x; // the horizontal position (in pixels of this thing's left side)
  private int y; // the vertical position (in pixels of this thing's top side)

  /**
   * @param name
   * @param x
   * @param y
   */
  public VisibleThing(String name, int x, int y) {
    // calling super class
    super(name);
    // setting instance values
    this.x = x;
    this.y = y;
    // setting image with appropriate name
    image = Thing.getProcessing().loadImage("images" + File.separator + name + ".png");
  }


  /*
   * (non-Javadoc)
   * 
   * @see Thing#update()
   */
  @Override
  public Action update() {
    // draws image at its position before returning null
    Thing.getProcessing().image(image, x, y);
    return null;
  }

  /**
   * @param dx
   * @param dy
   */
  public void move(int dx, int dy) {
    // updating and keeping track of movements
    x += dx;
    y += dy;
  }

  /**
   * @param x
   * @param y
   * @return
   */
  public boolean isOver(int x, int y) {
    boolean over = true;
    // checking if there is an overlap
    if (this.x + image.width < x || this.x > x || this.y + image.height < y || this.y > y) {
      // return false if there isn't
      return !over;
    }
    // return true if there is
    return over;
  }
  // return true only when point x,y is over image


  /**
   * @param other
   * @return boolean
   */
  public boolean isOver(VisibleThing other) {
    // checks also if figures overlap
    if (this.x + image.width < other.x || this.x > other.x + other.image.width
        || this.y > other.y + other.image.width || this.y + image.width < other.y) {
      // returns false if it doesn't
      return false;
    }
    // returns true if it does
    return true;
  } // return true only when other's image overlaps this one's
}
