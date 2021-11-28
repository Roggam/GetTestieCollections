import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    @Test
    public void hashSetAddTest(){
     //given
        Set<Person> personSet = new HashSet<>();
        Integer expectedSize = 3;
        Person person1 = new Person("Leon", 1993);
        Person person2 = new Person("Kris", 1960);
        Person person3 = new Person("Dolio", 1985);
     //when
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        Integer actual = personSet.size();
     //then
        Assert.assertEquals(expectedSize, actual);

    }

    @Test
    public void hashSetIsEmptyTest(){
        //given
        Set<Person> personSet = new HashSet<>();
        Person person1 = new Person("Leon", 1993);
        Person person2 = new Person("Kris", 1960);
        Person person3 = new Person("Dolio", 1985);
        //when
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.clear();
        Boolean actual = personSet.isEmpty();
        //then
        Assert.assertTrue(actual);

    }
}
