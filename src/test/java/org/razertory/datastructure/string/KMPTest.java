package org.razertory.datastructure.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KMPTest {

    private StringBuilder text = new StringBuilder();        //主串
    private StringBuilder target = new StringBuilder();      //子串

    @Before
    public void setUp() throws Exception {
        int i = 0;
        while (i < 100){
            text.append((char) (Math.random() * 4 + 65));
            if (i < 4){
                target.append((char) (Math.random() * 4 + 65));
            }
            i++;
        }
        System.out.println(text);
        System.out.println(target);
    }

    @Test
    public void kmp() {
        System.out.println(KMP.kmp(text.toString(),target.toString()));
    }
}