/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
  
Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
*/

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right)
        {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if(!Character.isLetterOrDigit(leftChar))
            {
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(rightChar))
            {
                right--;
                continue;
            }

            if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
