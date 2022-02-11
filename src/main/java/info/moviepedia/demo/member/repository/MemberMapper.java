package info.moviepedia.demo.member.repository;

import info.moviepedia.demo.member.domain.Member;
import info.moviepedia.demo.member.dto.ModMember;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    //회원가입
    boolean register(Member member);

    //회원삭제
    boolean delete(String memberEmail);

    //회원 정보 수정 (수정할만한 정보가 없어 수정기능 구현 X)
//    Member update(ModMember member);

    //단일 회원정보 조회
    Member getOneMember(String memberEmail);

    //전체 회원목록 조회
    List<Member> getMemberList();



}
