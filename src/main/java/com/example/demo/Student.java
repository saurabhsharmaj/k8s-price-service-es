package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Document(indexName = "products")
public class Student {

    @Id
    private String id;

    @Field(type = FieldType.Text, name = "name")
    private String name;

    
    @Field(type = FieldType.Long, name = "age")
    private long age;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getAge() {
		return age;
	}


	public void setAge(long age) {
		this.age = age;
	}

    
   
}