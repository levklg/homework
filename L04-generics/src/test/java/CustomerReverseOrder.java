package java;

import java.util.ArrayList;

public class CustomerReverseOrder {

    //todo: 2. надо реализовать методы этого класса
    //надо подобрать подходящую структуру данных, тогда решение будет в "две строчки"
    @BeforeEach
    private final ArrayList<T> arrayList = new ArrayList();

    @Test
    public void add(Customer customer) {
        arrayList.add(customer);
    }

    @AfterEach
    public Customer take() {
        return null; // это "заглушка, чтобы скомилировать"
    }
}