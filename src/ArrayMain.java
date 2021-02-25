public class ArrayMain {
    public static void main(String[] args) {
        ArrayParent[] ap = new ArrayParent[2];
        ArrayParent p1 = new ArrayParent(1,"ABC") ;
        ArrayParent p2 = new ArrayParent(2,"XYZ") ;
        ap[0] = p1;
        ap[1] = p2;

        for (int i=0; i<ap.length; i++){
            System.out.println(ap[i].toString());
        }


    }
}
