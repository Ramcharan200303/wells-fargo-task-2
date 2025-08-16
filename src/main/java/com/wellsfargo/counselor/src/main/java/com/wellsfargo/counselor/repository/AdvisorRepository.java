package com.wellsfargo.counselor.repository;

import com.wellsfargo.counselor.Advisor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvisorRepository extends JpaRepository<Advisor, Long> {
}
