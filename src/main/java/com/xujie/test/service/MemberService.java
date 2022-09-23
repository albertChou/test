package com.xujie.test.service;

import com.xujie.test.dao.IMemberDAO;
import com.xujie.test.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    IMemberDAO iMemberDAO;


    public Member getMemberByName(String name){
        return iMemberDAO.findByName(name);
    }

    public Member getMemberById(String id){
        return iMemberDAO.findByName(id);
    }

    public boolean deleteMember(String id){
        try{
            iMemberDAO.deleteById(id);
        }catch(Exception e){
            return false;
        }
        return true;
    }

    public Member addMember(Member member){
        iMemberDAO.save(member);
        return member;
    }


}
