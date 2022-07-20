import java.util.ArrayList;

public class CustomerReverseOrder <T> {

    //todo: 2. надо реализовать методы этого класса
    //надо подобрать подходящую структуру данных, тогда решение будет в "две строчки"
    private  final  ArrayList <T> arrayList = new ArrayList<T>();
    public void add(Customer customer) {
      this.arrayList.add((T) customer);
    }

    public Customer take() {
        return null; // это "заглушка, чтобы скомилировать"
    }
}
