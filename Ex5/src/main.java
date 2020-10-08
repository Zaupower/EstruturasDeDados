public class main {

    public static void main(String[] args) {

       Cd cd1 = new Cd(11,"Now2001");

       MyCollection<Media> collection = new MyCollection();
       collection.addStorage(cd1);
        System.out.println(collection.getFromCollection(0));

    }
}
