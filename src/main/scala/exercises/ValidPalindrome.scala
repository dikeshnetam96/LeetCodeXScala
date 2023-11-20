package exercises

import scala.annotation.tailrec

/*
Problem Statement - Valid Palindrome
Problem Link - https://leetcode.com/problems/valid-palindrome/
 */
object ValidPalindrome extends App {
  def checkPalindrome(str: String): Boolean = {

    @tailrec
    def helper(str: String, fidx: Int, lidx: Int): Boolean = {
      if (fidx > lidx) true
      else if (str.charAt(fidx) == str.charAt(lidx)) helper(str, fidx + 1, lidx - 1)
      else false
    }

    helper(str, 0, str.length - 1)
  }
}
