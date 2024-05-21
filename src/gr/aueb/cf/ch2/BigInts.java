package gr.aueb.cf.ch2;

import java.math.BigInteger;

public class BigInts {
    public static void main(String[] args) {
        BigInteger bignum1 = new BigInteger ("1111117575786608");
        BigInteger bignum2 = new BigInteger ( "6564784847347379849");
        BigInteger result = bignum1.add(bignum2);

        System.out.printf("%,d", result);


    }
}

