package me.kimjunhee.springbootdeveloper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> { // <엔티티 이름, 엔티티 기본키의 타입>
    Optional<Member> findByName(String name);
}
