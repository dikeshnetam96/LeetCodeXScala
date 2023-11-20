package exercises

import org.scalatest.funsuite.AnyFunSuiteLike

class NumberOf1BitsTest extends AnyFunSuiteLike {

  test("test1") {
    val result = NumberOf1Bits.num(7)
    assert(result.equals(3))
  }

  test("test2") {
    val result = NumberOf1Bits.num(5)
    assert(result.equals(2))
  }

  test("test3") {
    val result = NumberOf1Bits.num(4294967293L)
    assert(result.equals(31))
  }
}
