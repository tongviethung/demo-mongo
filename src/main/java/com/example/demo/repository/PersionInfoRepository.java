package com.example.demo.repository;

import com.example.demo.entity.PersonInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PersionInfoRepository extends JpaRepository<PersonInfoEntity, Long>, JpaSpecificationExecutor<PersonInfoEntity> {

}
