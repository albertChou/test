package com.xujie.test.dao;

import com.xujie.test.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


public interface IMemberDAO extends JpaRepository<Member, Integer> {

    @Query("select m from Member m where m.name = ?1")
    Member findByName(String name);

    @Query("select m from Member m where m.id = ?1")
    Member findById(String id);

    @Transactional
    @Modifying
    @Query("delete from Member m where m.id = ?1")
    int deleteById(String id);


}
