package flatAssignment;

public class FlatSelection {
    public static void main(String[] args) {
        Flat A = new Flat(10000,2,15,500) ;
        Flat B = new Flat(12000,1,15,100) ;
        Flat C = new Flat(11000,4,20,1500) ;

       int costA = A.totalSaving();
       int costB = B.totalSaving();
       int costC = C.totalSaving();

        System.out.println("Total cost of Flat A is := "+costA) ;
        System.out.println("Total cost of Flat B is := "+costB) ;
        System.out.println("Total cost of Flat C is := "+costC) ;

    }
}
