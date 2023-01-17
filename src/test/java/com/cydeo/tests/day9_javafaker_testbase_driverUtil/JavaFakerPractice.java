package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1(){
        //Creating fake object to reach methods
        Faker faker = new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        System.out.println("faker.numerify(\"###-####-####\") = " + faker.numerify("###-####-####"));
        System.out.println("faker.numerify(\"197-###-###-###\") = " + faker.numerify("197-###-###-###"));

        System.out.println("faker.letterify(\"??????\") = " + faker.letterify("??????"));
        System.out.println("faker.letterify(\"XXX???\") = " + faker.letterify("XXX???"));

        System.out.println("faker.bothify(\"??##-???###\") = " + faker.bothify("??##-???###"));

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());
        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard().replaceAll("-"," "));

        System.out.println("faker.chuckNorris().fact().replaceAll(\"Chuck Norris\", \"Federico\") = " + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Federico"));

    }

}
