package com.pfsoft.datescounter.repository;

import com.pfsoft.datescounter.entity.Weekend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeekendRepository extends JpaRepository<Weekend, Long> {

}
