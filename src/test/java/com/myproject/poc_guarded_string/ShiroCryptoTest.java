package com.myproject.poc_guarded_string;

import org.apache.shiro.codec.Hex;
import org.apache.shiro.crypto.AesCipherService;
import org.apache.shiro.util.ByteSource;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.security.Key;
import java.util.Optional;
import java.util.Random;

public class ShiroCryptoTest {

    private final AesCipherService cipherService = new AesCipherService();
    private final Key key = cipherService.generateNewKey();
    private final int TEST_COUNT = 100;


}
