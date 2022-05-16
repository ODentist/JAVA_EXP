package com.o_dentist.spring.org;

import com.o_dentist.spring.brand.Brand;
import com.o_dentist.spring.car.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

 public class CarApp
 {
     public static void main( String[] args )
     {
         //ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
         ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
         //代码实现：添加业务逻辑代码
         Car car1= (Car)ctx.getBean("Brand1");
         System.out.println(car1.getBrand().brand());
         Car car2= (Car) ctx.getBean("Brand2");
         System.out.println(car2.getBrand().brand());
     }
 }


