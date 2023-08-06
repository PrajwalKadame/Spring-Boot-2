package com.SangamOne.employee3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SangamOne.employee3.entity.Emp3;
import com.SangamOne.employee3.repository.Emp3Repository;
import com.SangamOne.employee3.service.Emp3Service;

@Service
public class Emp3ServiceImpl implements Emp3Service{
		@Autowired
		Emp3Repository emp3Repo;

		@Override
		public String createEmp3(Emp3 emp) {
			emp3Repo.save(emp);
			return "Success";
		}
}
