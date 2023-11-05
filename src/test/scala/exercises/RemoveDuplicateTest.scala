package exercises

import exercises.RemoveDuplicate.removeDuplicates
import org.scalatest.funsuite.AnyFunSuiteLike

class RemoveDuplicateTest extends AnyFunSuiteLike {
  test("Remove Duplicate 1"){
    val arr = Array(4, 4, 3, 2, 4, 1, 2, 3, 4, 5)
    assert(removeDuplicates(arr) ==5)
    println("SUCCESS")
  }
}
