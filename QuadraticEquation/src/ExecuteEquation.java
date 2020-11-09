public class ExecuteEquation {
    public static void main(String[] args) {
        QuadraticEquation q = new QuadraticEquation();
        q.setA(1);
        q.setB(4);
        q.setC(5);
        double delta = q.getDiscriminant();
        if(delta >= 0){
            System.out.println("Pt co 2 nghiem " + q.getRoot1() + " va " + q.getRoot2());
        }else if(delta == 0){
            System.out.println("PT co 1 nghiem" + q.getRoot1());
        }else{
            System.out.println("Pt vo nghiem");
        }
    }
}
