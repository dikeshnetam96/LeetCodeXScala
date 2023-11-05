package exercises

import org.scalatest.funsuite.AnyFunSuiteLike

class RemoveElementsTest extends AnyFunSuiteLike {

  test("Remove Element 1"){
    val arr = Array(1, 2, 3, 4, 5, 6, 4, 3, 2, 2, 1) // total number of element is 11
    val expected = 8
    assert(RemoveElements.removeElement(arr, 2)==8)
  }

}
