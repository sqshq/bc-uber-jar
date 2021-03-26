package com.sqshq.example;

import java.security.SecureRandom;
import java.security.Security;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.fips.FipsDRBG;
import org.bouncycastle.crypto.util.BasicEntropySourceProvider;
import org.bouncycastle.jcajce.provider.BouncyCastleFipsProvider;

public class App {

  public static void main(String[] args) {

    CryptoServicesRegistrar.setSecureRandom(
        FipsDRBG.SHA512_HMAC.fromEntropySource(
            new BasicEntropySourceProvider(new SecureRandom(), true)).build(null, true));

    Security.addProvider(new BouncyCastleFipsProvider());

    System.out.println("Success!");
  }
}
