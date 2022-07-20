import java.util.ArrayList;

public class CustomerReverseOrder <T> {

    //todo: 2. надо реализовать методы этого класса
    //надо подобрать подходящую структуру данных, тогда решение будет в "две строчки"
    private  final  ArrayList <Customer> arrayList = new ArrayList<>();
    public void add(Customer customer) {
      this.arrayList.add( customer);
    }

    public Customer take() {
        return null; // это "заглушка, чтобы скомилировать"
    }
}
