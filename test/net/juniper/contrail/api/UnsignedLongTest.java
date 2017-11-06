package net.juniper.contrail.api;

import com.google.gson.Gson;
import org.junit.Test;
import java.math.BigInteger;

import static junit.framework.TestCase.*;

public class UnsignedLongTest {
    private static class Subject {
        Long value;
    }

    @Test
    public void unsigned_longs_are_deserialized_as_overflowed_longs() {
        long overflow = 10L;
        BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger unsignedValue = maxLong.add(BigInteger.valueOf(overflow));
        Gson gson = ApiSerializer.getDeserializer();
        String json = "{value:"+unsignedValue+"}";
        Subject subject = gson.fromJson(json, Subject.class);
        //'-1' is necessary since overflowing MAX_VALUE by 1 is equal to MIN_VALUE
        long expected = Long.MIN_VALUE + overflow - 1;
        assertEquals(expected, subject.value.longValue());
    }

    @Test
    public void negative_longs_are_serialized_as_unsigned_longs() {
        long overflow = 27;
        BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger unsignedValue = maxLong.add(BigInteger.valueOf(overflow));
        Gson gson = ApiSerializer.getSerializer();
        Subject subject = new Subject();
        subject.value = Long.MAX_VALUE + overflow;
        String json = gson.toJson(subject);
        assertTrue(json.contains(unsignedValue.toString()));
    }
}
