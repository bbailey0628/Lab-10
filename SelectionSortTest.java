import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import org.junit.Assert;
public class SelectionSortTest {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
    public SelectionSortTest() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        SelectionSort temp1 = new SelectionSort();
        temp1.basicSelectionSort(arr);
        for (int i = 0; i < 5; i++) {
        assert arr[i] == Sortedarr[i];
        }
        /** add tests to check for this unit test **/
    }
    
    public void testNegative(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;
        
        SelectionSort temp1 = new SelectionSort();
        temp1.basicSelectionSort(arr);
        for (int i = 0; i < 5; i++) {
        assert arr[i] == Sortedarr[i];
        }
        /** Test data contains negative values only **/
    }
    
    public void testMixed(){
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = -9;
        arr[2] = 7;
        arr[3] = -10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = 2;
        Sortedarr[3] = 7;
        Sortedarr[4] = 8;
        
        SelectionSort temp1 = new SelectionSort();
        temp1.basicSelectionSort(arr);
        for (int i = 0; i < 5; i++) {
        assert arr[i] == Sortedarr[i];
        }
        /** Test data contains with both positive, negative and zeros **/
    }
    
    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = -2;
        arr[2] = 7;
        arr[3] = 8;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -2;
        Sortedarr[1] = -2;
        Sortedarr[2] = 7;
        Sortedarr[3] = 8;
        Sortedarr[4] = 8;
        
        SelectionSort temp1 = new SelectionSort();
        temp1.basicSelectionSort(arr);
        for (int i = 0; i < 5; i++) {
        assert arr[i] == Sortedarr[i];
        }
        /** Test data contains duplicates **/
    }
}
