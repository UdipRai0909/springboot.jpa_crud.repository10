package com.sursatech.people_mgmt.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sursatech.people_mgmt.dao.PeopleMgmtDao;


@Service
public class PeopleMgmtService {

	@Autowired
	private PeopleMgmtDao peopleMgmtDao;

	public void updatePersonEmailById(int id, String newEmail) {
		peopleMgmtDao.updatePersonEmailById(id, newEmail);
	}

}
