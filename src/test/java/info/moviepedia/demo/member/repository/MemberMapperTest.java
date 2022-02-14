package info.moviepedia.demo.member.repository;

import info.moviepedia.demo.member.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


//@SpringBootTest
//class MemberMapperTest {
//
//    @Autowired
//    MemberMapper memberMapper;
//
//    @Test
//    void regTest() {
//        Member member = new Member();
//        member.setMemberEmail("aaaa1651615@naver.com");
//        member.setMemberName("손오공");
//        member.setMemberPassword("ssss123");
//
//        memberMapper.register(member);
//    }
//
//    @Test
//    void deleteTest() {
//        memberMapper.delete("abc123@naver.com");
//    }
//
//    @Test
//    void getOneTest() {
//        Member member = memberMapper.getOneMember("songinno@naver.com");
//
//        System.out.println("============================");
//        System.out.println("member = " + member);
//        System.out.println("============================");
//    }
//
//    @Test
//    void getListTest() {
//        List<Member> memberList = memberMapper.getMemberList();
//
//        for (Member member : memberList) {
//            System.out.println("member = " + member);
//        }
//    }
//
//}