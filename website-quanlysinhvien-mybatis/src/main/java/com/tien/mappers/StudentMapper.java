package com.tien.mappers;

import java.util.List;

import com.tien.model.Student;

public interface StudentMapper {
	void insert(Student student);
    void update(Student student);
    void deleteById(int id);
    List<Student> selectAll();
    Student selectById(int id);
}
