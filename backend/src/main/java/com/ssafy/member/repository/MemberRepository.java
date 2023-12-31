package com.ssafy.member.repository;

import com.ssafy.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface MemberRepository extends JpaRepository<Member, UUID> {

    Optional<Member> findByChannelId(String channelId);

    Optional<Member> findById(UUID id);

}
