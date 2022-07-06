//package jpabook.jpashop;
//
//import org.assertj.core.api.Assertions;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.Rollback;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.transaction.annotation.Transactional;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class MemberRepositoryTest {
//
//    @Autowired
//    MemberRepository memberRepository;
//
//    @Test
//    @Transactional
//    @Rollback(value = false)
//    public void testMember() throws Exception {
//        //given
//        Member member = new Member();
//        member.setUsername("memberA");
//
//        Long saveId = memberRepository.save(member);
//        Member fidMember = memberRepository.find(saveId);
//
//        Assertions.assertThat(fidMember.getId()).isEqualTo(member.getId());
//        Assertions.assertThat(fidMember.getUsername()).isEqualTo(member.getUsername());
//        Assertions.assertThat(fidMember).isEqualTo(member);
//        System.out.println("fidMember = " + fidMember);
//        System.out.println("member = " + member);
//    }
//
//}