///*
//**Question:**
//
//You are given an array of integers representing the heights of a series of buildings. You need to find the maximum area of a rectangle that can be formed by selecting a contiguous sequence of buildings
//* such that the rectangle's base is parallel to the x-axis and the height of the rectangle is equal to the minimum height among the selected buildings. Assume each building has a width of 1 unit.
//
//For example, given the array [2, 1, 5, 6, 2, 3], the maximum area of the rectangle that can be formed is 10 units, as shown below:
//
//```
//     _
//   _| |
// _| | |
//| | | |
//| | | |_
//|_|_|_|_|
//2 1 5 6 2 3
//```
//
//Explanation: In this case, the maximum area rectangle is formed by selecting buildings with heights 5, 6, 2. The width of the rectangle is 3 units (from index 2 to index 4),
//* and the height of the rectangle is 2 units (the minimum height among the selected buildings). Thus, the maximum area is 3 * 2 = 6 units.
//
//Your task is to implement a method/function in Java that takes an array of integers representing the heights of the buildings and returns the maximum area of the rectangle that can be formed.
//
//This question involves finding the largest rectangular area in a histogram, where each bar in the histogram represents the height of a building.
//* You'll need to traverse the array and use a stack to efficiently find the maximum area.
//
//Good luck!
// */
//
//package Arrays;
//
//import java.util.Arrays;
//
//public class Practice_16_04_24 {
//
//    /*
//    1. Sort Array
//     */
//
//    int findMaxAreaRectangle(int ... buildingHeight){
//        int[] input = {2,4,66,7,3,5}; ---> {2,3,4,5,7,66}
//        int max = 1;
//        int width = 1;
//        Arrays.sort(input);
//    }
//
//}
