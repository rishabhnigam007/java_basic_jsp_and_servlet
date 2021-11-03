/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icfnext.mvc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 55683
 */
public class StudentDataUtil {

    public static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();

        students.add(new Student("rishabh", "nigam", "rishabh@gmail.com"));
        students.add(new Student("rishu", "nigam", "rishu@gmail.com"));
        students.add(1, new Student("pqr", "xyz", "abc@gmail.com"));
        
        return students;
    }

}