import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {
    @Test
    public void ArrayDequeAddTest() {
        //given
        Deque<Person> personDeque = new ArrayDeque<>();
        Integer expectedSize = 3;
        Person person1 = new Person("Leon", 1993);
        Person person2 = new Person("Kris", 1960);
        Person person3 = new Person("Dolio", 1985);
        //when

        personDeque.add(person1);
        personDeque.add(person2);
        personDeque.add(person3);
        Integer actual = personDeque.size();
        //then
        Assert.assertEquals(expectedSize, actual);
    }


    @Test
    public void ArrayDequeGetFirstTest() {
        //given
        Deque<Person> personDeque = new ArrayDeque<>();
        Person person1 = new Person("Leon", 1993);
        Person person2 = new Person("Kris", 1960);
        Person person3 = new Person("Dolio", 1985);
       //when
        personDeque.add(person1);
        personDeque.add(person2);
        personDeque.add(person3);

        Person actual = personDeque.getFirst();
        //then
        Assert.assertEquals(person1, actual);
    }
}
