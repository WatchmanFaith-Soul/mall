package com.hxh.dao;

import com.hxh.entity.Student;

import java.util.List;

@Repository
public class StudentDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public boolean add(Student student) throws DataAccessException {

            hibernateTemplate.save(student);
            return true;


    }

    public boolean delete(Student student) {

        try {
            hibernateTemplate.delete(student);
            return true;
        } catch (DataAccessException e) {
            return false;
        }

    }

    public boolean updata(Student student) {
        try {
            hibernateTemplate.update(student);

            return true;
        } catch (DataAccessException e) {
            return false;
        }

    }

    public List<Student> findStudent(Student student) {
        String hql = "from com.hxh.entity.Student";
        return (List<Student>) hibernateTemplate.find(hql, null );
    }
}
