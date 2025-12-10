package BehaviouralDesginPatterns.StratergyDesignPattern.PracticeProblems.SortingStratergy;

public class Main {
    public static void main(String[] args) {
        SortingStratergy quickSort = new QuickSort();
        SortingStratergy mergeSort = new MergeSort();
        SortingStratergy selectionSort = new SelectionSort();
        SortingProcessor processor = new SortingProcessor( quickSort );
        processor.executeSort( java.util.Arrays.asList(5,3,8,6,2) );
        processor.setSortingStratergy(mergeSort);
        processor.executeSort( java.util.Arrays.asList(5,3,8,6,2) );

        processor.setSortingStratergy(selectionSort);
        processor.executeSort( java.util.Arrays.asList(5,3,8,6,2) );
    }
}
