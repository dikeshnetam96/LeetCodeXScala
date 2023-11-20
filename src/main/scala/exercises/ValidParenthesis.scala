package exercises

import scala.collection.mutable

/*
Problem Statement - Valid Parentheses
Problem Link - https://leetcode.com/problems/valid-parentheses/
 */
object ValidParenthesis extends App {
  def validateParenthesis(s: String): Boolean = {
    val parentheses = Map('(' -> ')', '[' -> ']', '{' -> '}')
    val stack = mutable.Stack[Char]()

    for (ch <- s) {
      if (parentheses.contains(ch)) {
        stack.push(ch)
      }
      else {
        if (stack.isEmpty) return false
        if (!parentheses.get(stack.pop).contains(ch)) return false
      }
    }
    stack.isEmpty
  }

  println(validateParenthesis("[({{(())}})]"))
}
