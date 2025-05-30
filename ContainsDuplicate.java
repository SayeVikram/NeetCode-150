import java.io.*;
import java.util.*;

/* 
Okay so the problem statement is basically asking to find if there are duplicates
in a given integer array nums. I think the lowest complexity could only be O(N)
since we have to make a whole pass and account for all the values in the array. 
I thought that a HashSet would be the perfect way to check for duplicates since
the hashset's contains method runs in constant O(1) time due to the value being 
hashed. I decided to include a return conditional right away in the for loop since
it could cut down on the run time once a duplicate is found. Another possible
solution could be just checking !(set.size() == nums.length)
 */

public class Solution {

    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            if(set.contains(i))
                return true;
            set.add(i);
        }
        return false;
    }
    
}
