package com.ch.fin_demo;

import com.ch.fin_demo.model.Member;
import com.ch.fin_demo.repository.MemberRepository;
import com.ch.fin_demo.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest // 스프링 컨테이너로 테스트 실행
@Transactional // 테스트케이스에 적용 시, 테스트 시작전에 트랜잭션을 시작하고, 테스트완료 후에 항상 롤백한다.
public class MemberTest {

    @Autowired
    MemberService memberService;

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void join() throws Exception {

        // Given : Member 빌더로 멤버 객체 생성 후
        Member member = new Member();
        member.setName("Winter");
        member.setId("Elsa");
        member.setOrg("SM");
        member.setActive(true);

        // When : 멤버가 가입되면 (MemberService, 스프링컨텍스트가 사용된걸 확인)
        Member storedMember = memberService.addUser(member);

        // Then : 그 멤버를 다시 찾을 때 둘의 이름이 같아야 한다..
        Member foundMember = memberRepository.findById(storedMember.getSeq()).get();
        assertEquals(member.getName(), foundMember.getName());

    }
}
