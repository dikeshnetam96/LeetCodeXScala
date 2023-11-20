package exercises

import scala.annotation.tailrec
/*
Problem Statement - Reverse Integer
Problem Link - https://leetcode.com/problems/reverse-integer/
 */
object ReverseInteger extends App {
  def reverse(x: Int): Int = {
    @tailrec
    def helper(x: Int, result: Int, sign : Boolean): Int = {
      if (x == 0) if(true) result else -1*result
      else helper(x / 10, (result * 10 + x % 10),sign)
    }
    helper(x, 0, if(x<0) true else false)
  }
}
