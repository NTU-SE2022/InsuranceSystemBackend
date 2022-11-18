package com.group3.insuranceSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group3.insuranceSystem.dao.PolicyAddress;

@Repository
public interface PolicyRepository extends JpaRepository<PolicyAddress, String>{

}