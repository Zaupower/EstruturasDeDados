import java.util.ArrayList;

public class MyCollection<T> {

    private ArrayList<T> storage;

    public MyCollection() {
        this.storage = new ArrayList<T>();
    }

    public void addStorage(T info) {
        this.storage.add(info);
    }

    public T getFromCollection(int position)  {
        if(storage.isEmpty()){
            System.out.println("Empty");
        }else{
            return storage.get(position);
        }
        return storage.get(position);
    }
}
