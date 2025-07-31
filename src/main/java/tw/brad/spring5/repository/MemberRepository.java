package tw.brad.spring5.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tw.brad.spring5.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long>{
	
	Member findByAccount(String account);
	
	@Query("SELECT m FROM Member m WHERE m.account = :account")
	Optional<Member> findByAccountV2(@Param("account") String account);
	
	@Query("SELECT m FROM Member m WHERE m.account LIKE %:key% ORDER BY m.account")
	List<Member> m1(@Param("key") String keyword);
}
