package com.koheis.jpaonetoonebi.dao;

import com.koheis.jpaonetoonebi.entity.Instructor;
import com.koheis.jpaonetoonebi.entity.InstructorDetail;

public interface AppDAO {
    void save(Instructor theInstructor);
    Instructor findInstructorById(int theId);
    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);
    void deleteInstructorDetailById(int theId);
}
