package info.moviepedia.demo.member.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter @Setter @ToString
public class Member {
    //회원가입시 입력 데이터
    private String memberName;
    private String memberEmail;
    private String memberPassword;

    //자동생성 데이터
    private Auth auth;
    private Date joinDate;

}
