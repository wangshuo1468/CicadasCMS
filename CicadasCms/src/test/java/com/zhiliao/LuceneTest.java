package com.zhiliao;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.HexUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;
import cn.hutool.crypto.symmetric.AES;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import cn.hutool.crypto.symmetric.SymmetricCrypto;
import cn.hutool.log.Log;
import com.github.pagehelper.PageInfo;
import com.zhiliao.common.utils.DateUtil;
import com.zhiliao.common.utils.PasswordldUtil;
import com.zhiliao.component.lucene.LuceneManager;
import com.zhiliao.component.lucene.util.IndexObject;
import com.zhiliao.module.web.system.service.TCmsAdminKeyService;
import com.zhiliao.mybatis.model.TCmsAdminKey;
import okio.Utf8;
import org.apache.shiro.codec.Base64;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.util.List;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class LuceneTest {

    @Autowired
    private TCmsAdminKeyService service;

    @Test
    public void create() {

    }

    @Test
    public void decrypt() {
        String thiskey = service.findAll().get(0).getThiskey();
        String decrypt = null;
        try {
            decrypt = PasswordldUtil.decrypt(thiskey);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        if (decrypt.equals("4d72fc06-7f78-428b-")) {
            System.out.println("success");
        }
    }

    @Test
    public void encrypt ()throws  Exception{

        String dateStr = "2020-06-10";
        String encrypt = PasswordldUtil.encrypt(dateStr);
        System.out.println(encrypt);
        this.decrypt(encrypt);
    }

    public void decrypt(String data) throws Exception {
        String CheckStr= PasswordldUtil.decrypt(data);
        System.out.println(CheckStr);
    }

    @Test
    public void  xiaoshuoTest(){

    }





}
