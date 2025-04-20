package com.spring.jdbc.SpringJdbcCrudOperations;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.bean.Student;
import com.spring.Mapper.*;
import com.spring.jdbc.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {	
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        
        //---------Insert Operation--------------------
//        int std_roll = 102;
//    	String std_name = "Hemant";
//    	float std_marks = 92.5f;
//        
//        String insert_sql_query = "INSERT INTO student VALUES (?,?,?)";
//        int count = jdbcTemplate.update(insert_sql_query,std_roll, std_name, std_marks);
//        if(count > 0) {
//        	System.err.println("Insertion successfully..");
//        }
//        else {
//        	System.out.println("Insertion Failed..");
//        }
        
        
        //-------Update Operation--------
//        float marks = 98.3f;
//        int rollno = 101;
//
//        String update_sql_query = "UPDATE student SET std_marks=? WHERE std_roll=?";
//        int count = jdbcTemplate.update(update_sql_query, marks, rollno);
//        if (count > 0) {
//            System.out.println("Updation success");
//        } else {
//            System.out.println("Updation failed");
//        }

        
        //---------Delete Operation------
//        int rollno = 102;
//
//        String delete_sql_query = "DELETE FROM student WHERE std_roll=?";
//        int count = jdbcTemplate.update(delete_sql_query, rollno);
//        if (count > 0) {
//            System.out.println("Deletion success");
//        } else {
//            System.out.println("Deletion failed");
//        }
        
        
        //------Select Operation 1-------
//        String select_sql_query = "SELECT * FROM student";
//        List<Student> std_list = jdbcTemplate.query(select_sql_query, new StudentRowMapper());
//        for(Student std : std_list)
//        {
//            System.out.println("Rollno : " + std.getRollno());
//            System.out.println("Name   : " + std.getName());
//            System.out.println("Marks  : " + std.getMarks());
//            System.out.println("----------------------------");
//        }

     // --------SELECT OPERATION 2--------
        int rollno = 101;

        String select_sql_query = "SELECT * FROM student WHERE std_roll=?";

        Student std = jdbcTemplate.queryForObject(select_sql_query, new StudentRowMapper(), rollno);

        System.out.println("Rollno: " + std.getRollno());
        System.out.println("Name: " + std.getName());
        System.out.println("Marks: " + std.getMarks());

    }
}
