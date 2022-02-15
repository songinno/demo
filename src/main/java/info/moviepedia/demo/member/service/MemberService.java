package info.moviepedia.demo.member.service;

import info.moviepedia.demo.member.domain.Member;
import info.moviepedia.demo.member.repository.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberMapper memberMapper;

    //단일회원 조회 중간처리
    public Member getMember(String memberEmail) {
        return memberMapper.getOneMember(memberEmail);
    }

    //전체회원 조회 중간처리
    public List<Member> getMembers() {
        return memberMapper.getMemberList();
    }
}
