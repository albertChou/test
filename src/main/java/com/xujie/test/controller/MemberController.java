package com.xujie.test.controller;

import com.xujie.test.model.Member;
import com.xujie.test.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Member")
public class MemberController {

    private Logger logger = LoggerFactory.getLogger(MemberController.class);


    @Autowired
    MemberService memberService;


    @GetMapping("/get")
    public ResponseEntity<Member> getMemberByName(@RequestParam(value = "name") String name){

        Member member = memberService.getMemberByName(name);
        return new ResponseEntity<Member>(member, HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public  ResponseEntity<String> deleteMember(@RequestParam(value = "id") String id){

        Member member = memberService.getMemberById(id);
        if(member==null)
        {
            return new ResponseEntity<String>("not found", HttpStatus.NOT_FOUND);
        }else{

            memberService.deleteMember(id);
            return new ResponseEntity<String>("deleted", HttpStatus.OK);
        }
    }

    @PutMapping("/add")
    public ResponseEntity<Member> addMember(@RequestBody Member member){
        memberService.addMember(member);
        return new ResponseEntity<Member>(member, HttpStatus.OK);
    }
}
