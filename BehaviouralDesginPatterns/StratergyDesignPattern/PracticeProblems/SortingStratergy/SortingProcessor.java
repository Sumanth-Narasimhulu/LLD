package BehaviouralDesginPatterns.StratergyDesignPattern.PracticeProblems.SortingStratergy;

public class SortingProcessor {
    private SortingStratergy sortingStratergy;
    public SortingProcessor(SortingStratergy sortingStratergy) {
        this.sortingStratergy = sortingStratergy;
    }
    public void executeSort(java.util.List<Integer>list) {
        sortingStratergy.sort(list);
    }
    public void setSortingStratergy(SortingStratergy sortingStratergy) {
        this.sortingStratergy = sortingStratergy;
    }
}
