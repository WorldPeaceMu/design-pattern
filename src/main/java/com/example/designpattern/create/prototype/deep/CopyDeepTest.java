package com.example.designpattern.create.prototype.deep;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

/**
 * @Author: wanglin
 * @Date: 2022/7/15 21:47
 * @Description:
 */
public class CopyDeepTest {

    /**
     * 方法三：使用Java自带的流方式实现
     * 优点：
     * 1.不破坏类的封装，无需了解被copy对象的内部
     * 2.不需要依赖第三方包
     * 3.代码可复用
     * 缺点：
     * 1.需要实现Serializable接口，会有额外的开销
     */
    public static CitationDeep cloneDeep3(CitationDeep citationDeep) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(citationDeep);
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (CitationDeep) ois.readObject();
    }

    /**
     * 方法四：使用第三方包Jackson实现
     * 优点：
     * 1.不破坏类的封装，无需了解被copy对象的内部
     * 2.不需要实现接口
     * 3.代码可复用
     * 缺点：
     * 1.需要依赖第三方包
     * 2.内部实现复杂
     */
    public static CitationDeep cloneDeep4(CitationDeep citationDeep) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(objectMapper.writeValueAsString(citationDeep),CitationDeep.class);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CitationDeep citationDeep = new CitationDeep();
        Student student = new Student();
        student.setAge(11);
        student.setName("aaa");
        citationDeep.setStudent(student);

        /*CitationDeep citationDeep1 = citationDeep.clone();
        citationDeep1.getStudent().setName("bbb");

        citationDeep.show();
        citationDeep1.show();*/

        try {
            System.out.println("方式一----------------------------");

            System.out.println("方式二----------------------------");

            System.out.println("方式三----------------------------");
            CitationDeep citationDeep3 = cloneDeep3(citationDeep);
            citationDeep3.getStudent().setName("bbb");
            citationDeep.show();
            citationDeep3.show();
            System.out.println("方式四----------------------------");
            CitationDeep citationDeep4 = cloneDeep4(citationDeep);
            citationDeep4.getStudent().setName("bbb");
            citationDeep.show();
            citationDeep4.show();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
