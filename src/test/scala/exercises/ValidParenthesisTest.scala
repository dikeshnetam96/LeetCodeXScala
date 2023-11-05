package exercises

import org.scalatest.funsuite.AnyFunSuiteLike

class ValidParenthesisTest extends AnyFunSuiteLike {
  test("test1") {
    val result = ValidParenthesis.validateParenthesis("(()){(})")
    assert(result == false)
  }

  test("test2") {
    val result = ValidParenthesis.validateParenthesis("(()){([])}")
    assert(result == true)
  }
}
