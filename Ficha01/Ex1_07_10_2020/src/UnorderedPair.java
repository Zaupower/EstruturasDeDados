public class UnorderedPair<T> extends Pair<T> {
    public UnorderedPair() {
        setFirst(null);
        setSecond(null);
    }

    public UnorderedPair(T firstItem, T secondItem){
        setFirst(firstItem);
        setSecond(secondItem);
    }

    @Override
    public T getFirst() {
        return super.getFirst();
    }

    @Override
    public T getSecond() {
        return super.getSecond();
    }

    public boolean getEquals(){
        boolean b = false;
        if (getFirst().equals(getSecond())){
            b = true;
        }
        return b;
    }
    public boolean equals(Object otherObject){
        if(otherObject == null){
            return false;
        } else if (getClass() != otherObject.getClass()){
            return false;
        } else {
            UnorderedPair<T> otherPair =
                    (UnorderedPair<T>) otherObject;
            return (getFirst().equals(otherPair.getFirst())
            && getSecond().equals(otherPair.getSecond()))
                    || (getFirst().equals(otherPair.getSecond())
            && getSecond().equals(otherPair.getFirst()));
        }
    }
}
