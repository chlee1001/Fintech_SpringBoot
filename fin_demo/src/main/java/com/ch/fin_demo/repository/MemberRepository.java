package com.ch.fin_demo.repository;

import com.ch.fin_demo.model.Member;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {

}
