package com.koheis.jpaonetoonebi.dao;

import com.koheis.jpaonetoonebi.entity.Instructor;

public interface AppDAO {
    void save(Instructor theInstructor);
    Instructor findInstructorById(int theId);
    void deleteInstructorById(int theId);
}
