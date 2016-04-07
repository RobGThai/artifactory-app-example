package com.robgthai.demo_app;

import org.apache.log4j.Logger;
import com.robgthai.helloworld.java_lib.HelloWorld;

public class Echo {

  private static final Logger logger = Logger.getLogger(Echo.class);
  public static void main(String[] args) throws Exception {
    System.out.println("Hello");
    logger.info("sample info message");
    System.out.println(new HelloWorld().hello("Gof"));
  }
}
