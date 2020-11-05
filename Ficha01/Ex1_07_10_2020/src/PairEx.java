public class PairEx<T extends Comparable> {

    private T first;
    private T second;

    public PairEx(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T max(){
        if (first.compareTo(second)>0)
            return first;
        else
            return second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
