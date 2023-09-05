package javapg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test {

	public int[] twoSum(int[] nums, int target) {
		int a[] = new int[2];
		//System.out.println(Arrays.toString(nums));
		//System.out.println(target);
		for (int i = 0; i <= nums.length - 1; i++) {
		    for (int j = i+1; j <= nums.length - 1; j++) {
		        if ((nums[i] + nums[j]) == target) {
		            a[0] = i;
		            a[1] = j;
		            break;
		        }
		    }
		    if (a[0] != 0 || a[1] != 0) {
		        break;
		    }
		}
		return a;
	}
	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) { 
//        List<Integer> list = new ArrayList<Integer>();
//        for(int i=0; i<nums1.length; i++){
//            list.add(nums1[i]);
//        } 
//
//        for(int j=0; j<nums2.length; j++){
//            list.add(nums2[j]);
//        }
//
//        Collections.sort(list);
//
//        int ln = list.size();
		
		int fal = nums1.length;        //determines length of firstArray  
		int sal = nums2.length;   //determines length of secondArray  
		int[] result = new int[fal + sal];  //resultant array of size first array and second array  
		System.arraycopy(nums1, 0, result, 0, fal);  
		System.arraycopy(nums2, 0, result, fal, sal);  
		Arrays.sort(result);
		int ln = result.length;

        if(ln % 2 != 0){
            //return (double) list.get(ln/2);
        	return (double) result[ln/2];
        }
        else{
            //return (double)(list.get((ln - 1) / 2) + list.get(ln / 2)) / 2.0;
        	return (double)(result[(ln - 1) / 2] + result[ln / 2]) / 2.0;
        }       
    }

	public static void main(String[] args) {
		test tst = new test();
		
		int[] arr = new int[4]; 
		arr[0] = 2;
		arr[1] = 5;
		arr[2] = 5;
		arr[3] = 11;

		int[] arr1 = new int[2];
		arr1[0] = 1;
		arr1[1] = 3;
		
		int[] arr2 = new int[2];
		arr2[0] = 2;
		arr2[1] = 7;
		
		System.out.println(Arrays.toString((tst.twoSum(arr, 10))));
		System.out.println(tst.findMedianSortedArrays(arr1, arr2));
		
	}

}
