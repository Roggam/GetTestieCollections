import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    @Test
    public void hashMapPutTest(){
       //given
        Map<Person, Address> personMap = new HashMap<>();
        Integer expectedSize = 3;
        Person leon = new Person("Leon", 1993);
        Person kris = new Person("Kris", 1960);
        Person dolio = new Person("Dolio", 1985);
        Address address1 = new Address("123 Street Rd", "Wilmington", "1234", "USA");
        Address address2 = new Address("456 Street Rd", "Wilmington", "1234", "USA");
        Address address3 = new Address("789 Street Rd", "Wilmington", "1234", "USA");
       //when
     personMap.put(leon, address1);
     personMap.put(kris, address2);
     personMap.put(dolio, address3);
     Integer actual = personMap.size();
       //then
        Assert.assertEquals(expectedSize,actual);

    }
    @Test
    public void hashMapGetTest(){
        //given
        Map<Person, Address> personMap = new HashMap<>();
        Integer expectedSize = 3;
        Person leon = new Person("Leon", 1993);
        Person kris = new Person("Kris", 1960);
        Person dolio = new Person("Dolio", 1985);
        Address address1 = new Address("123 Street Rd", "Wilmington", "1234", "USA");
        Address address2 = new Address("456 Street Rd", "Wilmington", "1234", "USA");
        Address address3 = new Address("789 Street Rd", "Wilmington", "1234", "USA");
        //when
        personMap.put(leon, address1);
        personMap.put(kris, address2);
        personMap.put(dolio, address3);
        Address actual = personMap.get(kris);
        //then
        Assert.assertEquals(address2,actual);

    }

}
