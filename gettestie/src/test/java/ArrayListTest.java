import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    @Test
    public void arrayListAddTest() {
        //given
        List<Address> addressList = new ArrayList<>();
        Integer expectedSize = 3;
        //when
        addressList.add(new Address("123 Street Rd", "Wilmington", "1234", "USA"));
        addressList.add(new Address("456 Street Rd", "Wilmington", "1234", "USA"));
        addressList.add(new Address("789 Street Rd", "Wilmington", "1234", "USA"));
        Integer actual = addressList.size();
        //then
        Assert.assertEquals(expectedSize, actual);

    }

    @Test
    public void arrayListContainsTest() {
        //given
        List<Address> addressList = new ArrayList<>();

        //when
        Address address1 = new Address("123 Street Rd", "Wilmington", "1234", "USA");
        Address address2 = new Address("456 Street Rd", "Wilmington", "1234", "USA");
        Address address3 = new Address("789 Street Rd", "Wilmington", "1234", "USA");
        addressList.add(address1);
        addressList.add(address2);
        addressList.add(address3);
       Boolean actual = addressList.contains(address2);
        //then
        Assert.assertTrue(actual);

    }
}
