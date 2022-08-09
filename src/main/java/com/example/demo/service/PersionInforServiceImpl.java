package com.example.demo.service;

import com.example.demo.dto.response.PersonResponse;
import com.example.demo.entity.PersonInfoEntity;
import com.example.demo.repository.PersionInfoRepository;
import com.example.demo.util.SpecificationUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersionInforServiceImpl {

    @Autowired
    private PersionInfoRepository persionInfoRepository;


    public Page<PersonResponse> getPerson(Pageable pageable, Specification<PersonInfoEntity> specs) {
        specs = SpecificationUtils.appendActiveStatus(specs);
        Page<PersonInfoEntity> inventoryPage = persionInfoRepository.findAll(specs, pageable);
        List<PersonResponse> inventoryResponses = new ArrayList<>();
        for(PersonInfoEntity e : inventoryPage.getContent()){
            PersonResponse p = new PersonResponse();
            BeanUtils.copyProperties(e, p);
            inventoryResponses.add(p);
        }
        return new PageImpl<>(inventoryResponses, pageable, inventoryPage.getTotalElements());
    }
}
