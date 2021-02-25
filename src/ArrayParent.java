public class ArrayParent {
    int id;
    String name;
    public ArrayParent(int id, String name){
        this.id = id;
        this.name = name;

    }
    @Override
    public String toString(){

        return "id: "+id + ", Name: "+name;
    }
}
