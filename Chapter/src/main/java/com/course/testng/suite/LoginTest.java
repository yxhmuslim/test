package com.course.testng.suite;

import org.testng.annotations.*;


public class LoginTest {
        @Test
        public void LoginTaobao(){

            System.out.println("淘宝登录成功");
        }

        @BeforeMethod
       public void beforeMethod(){

           System.out.println("BeforeMethod");
       }
       @BeforeTest
       public void beforeTest(){
           System.out.println("BeforeTest");
       }
        @AfterMethod
        public void afterMethod(){

            System.out.println("AfterMethod");
        }
        @AfterTest
        public void afterTest(){
            System.out.println("AfterTest");
        }
}
