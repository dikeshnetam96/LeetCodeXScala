package exercises

object RemoveElements extends App {
  /*
  Problem Name : Remove and Element from the list and return the count
  Problem Link : https://leetcode.com/problems/remove-element/
   */
  def removeElement(nums: Array[Int], `val`: Int): Int = {
    nums.count(x => (x != `val`))
  }
}
