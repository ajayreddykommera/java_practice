package Day03;

public class Cse extends Department {

    @Override
    public int getDepartmentSize(int size) {
        return size;
    }

    public static void main(String[] args) {
        Cse cse = new Cse();
        int a = cse.getDepartmentSize(5);
        System.out.println("size  " + a);

        Parent child = new Child();
        child.name();

        Product product = new Product();
        double price = product.getPrice(5);
        System.out.println("price  " + price);
    }

}
