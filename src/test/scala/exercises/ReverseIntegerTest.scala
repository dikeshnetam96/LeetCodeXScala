package exercises

import org.scalatest.funsuite.AnyFunSuiteLike

class ReverseIntegerTest extends AnyFunSuiteLike {

  test("Reverse Integer 1") {
    val result = ReverseInteger.reverse(-123)
    val expected = -321
    println(result + " " + expected)
    assert(result==expected)
  }
}
