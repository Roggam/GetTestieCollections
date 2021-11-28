import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListTest {
    @Test
    public void linkedListAddTest(){
        //given
        Queue<Person> personList = new LinkedList<>();
        Integer expectedSize = 3;
        Person person1 = new Person("Leon", 1993);
        Person person2 = new Person("Kris", 1960);
        Person person3 = new Person("Dolio", 1985);
        //when
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        Integer actual = personList.size();
        //then
        Assert.assertEquals(expectedSize, actual);
    }

    @Test
    public void linkedListRemoveTest(){
        //given
        Queue<Person> personList = new LinkedList<>();
        Integer expectedSize = 2;
        Person person1 = new Person("Leon", 1993);
        Person person2 = new Person("Kris", 1960);
        Person person3 = new Person("Dolio", 1985);
        //when
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        personList.remove(person3);

        Integer actual = personList.size();
        //then
        Assert.assertEquals(expectedSize, actual);
    }
}
