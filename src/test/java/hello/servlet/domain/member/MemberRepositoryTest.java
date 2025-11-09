package hello.servlet.domain.member;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    void save(){
        Member member = new Member("kim", 29);

        memberRepository.save(member);

        Member memberId = memberRepository.findById(member.getId());

        assertNotNull(memberId);
        assertEquals(member.getId(), memberId.getId());
    }

    @Test
    void findAll(){
        Member member1 = new Member("kim", 29);
        Member member2 = new Member("kim", 30);
        memberRepository.save(member1);
        memberRepository.save(member2);

        List<Member> list = memberRepository.findAll();
        assertNotNull(list);
        assertEquals(list.size(), 2);

    }

}