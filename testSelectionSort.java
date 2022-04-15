package basicSelectionSort;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort
{
	@Test
	public void test()
	{
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort()
    {
    }

    public void testPositive()
    {
    	SelectionSort temp = new SelectionSort();

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

        arr = temp.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr,temp.basicSelectionSort(arr));

        /** add tests to check for this unit test **/
    }

   public void testNegative()
    {
    	SelectionSort temp = new SelectionSort();

        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -1;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -9;
        Sortedarr[1] = -8;
        Sortedarr[2] = -7;
        Sortedarr[3] = -2;
        Sortedarr[4] = -1;

        arr = temp.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr,temp.basicSelectionSort(arr));
        /** Test data contains negative values only **/
    }

    public void testMixed()
    {
    	SelectionSort temp = new SelectionSort();

        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = -6;
        arr[2] = 0;
        arr[3] = -19;
        arr[4] = 2;
// trying again 

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -19;
        Sortedarr[1] = -6;
        Sortedarr[2] = 0;
        Sortedarr[3] = 2;
        Sortedarr[4] = 5;

        arr = temp.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr,temp.basicSelectionSort(arr));
        /** Test data contains with both positive, negative and zeros **/
    }

    public void testDuplicates()
    {
    	SelectionSort temp = new SelectionSort();

        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 24;
        arr[2] = 24;
        arr[3] = -2;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -2;
        Sortedarr[1] = -2;
        Sortedarr[2] = 0;
        Sortedarr[3] = 24;
        Sortedarr[4] = 24;

        arr = temp.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr,temp.basicSelectionSort(arr));
        /** Test data contains duplicates **/
    }
}
