package org.study.service;

import org.springframework.stereotype.Service;

@Service
public class IndexService {


	public IndexService(UserIndex user) {
		System.out.println(user);
	}

}
