package exercises

  import scala.annotation.tailrec

  // Leetcode Problem link - https://leetcode.com/problems/single-number/description/
  object FindSingleNumber extends App {
    @tailrec
    def findNumber(idx: Int, length: Int, num: Int, nums: Array[Int]): Int = {
      if (idx > length) num
      else findNumber(idx + 1, length, nums(idx) ^ num, nums) // performing xor operation to eliminate duplication values
    }
  }

