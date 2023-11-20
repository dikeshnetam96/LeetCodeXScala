package exercises

import org.scalatest.funsuite.AnyFunSuiteLike

class FindSingleNumberTest extends AnyFunSuiteLike {

  test("findSingleNumberTest"){
    val myList: Array[Int] = Array(1, 2, 2, 4, 4)
    val expected = 1
    val actual = FindSingleNumber.findNumber(0, myList.length - 1, 0, myList)
    assert(expected == actual)
  }
}
