/*
 * Created on 2018-10-02 ( Date ISO 2018-10-02 - Time 05:57:23 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import com.example.demo.entity.Members;
import com.example.demo.repository.MembersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MembersServiceImpl implements MembersService {

	@Autowired
	private MembersRepository membersRepository;

	@Override
	public Members getOne(Integer memberId) {
		return membersRepository.findById(memberId).get();
	}

	@Override
	public Boolean delete(Integer memberId) {
		if (membersRepository.getOne(memberId) != null) {
			membersRepository.deleteById(memberId);
			return true;
		}
		return false;
	}

	@Override
	public Members create(Members members) {
		return membersRepository.save(members);
	}

	@Override
	public Boolean update(Members membersToUpdate) {
		Members members = membersRepository.findByMemberId(membersToUpdate.getMemberId());
		if(members!=null)
		{
			 membersRepository.save(membersToUpdate);
			 return true;
			
		}
		else return false;
		
	}

	@Override
	public Boolean exist(Members members) {
		return membersRepository.existsById(members.getMemberId());
	}

	@Override
	public List<Members> findAll() {
		return membersRepository.findAll();
	}

}
