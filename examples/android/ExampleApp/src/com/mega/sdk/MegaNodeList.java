/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mega.sdk;

public class MegaNodeList {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected MegaNodeList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MegaNodeList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  protected synchronized void delete() {   
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        megaJNI.delete_MegaNodeList(swigCPtr);
      }
      swigCPtr = 0;
    }
}

   MegaNodeList copy() {
    long cPtr = megaJNI.MegaNodeList_copy(swigCPtr, this);
    return (cPtr == 0) ? null : new MegaNodeList(cPtr, false);
  }

  public MegaNode get(int i) {
    long cPtr = megaJNI.MegaNodeList_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new MegaNode(cPtr, false);
  }

  public int size() {
    return megaJNI.MegaNodeList_size(swigCPtr, this);
  }

}