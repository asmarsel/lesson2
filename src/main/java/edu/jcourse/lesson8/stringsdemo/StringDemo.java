package edu.jcourse.lesson8.stringsdemo;

import org.jcp.xml.dsig.internal.dom.DOMSubTreeData;

public class StringDemo {

    public static void main(String[] args) {
        String str1 = new String("Hello Java");
        String str2 = "Hello java";

        boolean isEquals = str1.equalsIgnoreCase(str2);
        System.out.println("Is Equals: " + isEquals);

        int jIndex = str1.indexOf("J");
        System.out.println(jIndex);

        String substring = str1.substring(jIndex, str1.length());
        System.out.println(substring.trim());
        System.out.println(str1.contains("Java"));
    }
}
