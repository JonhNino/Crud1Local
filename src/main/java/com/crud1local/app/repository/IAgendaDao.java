package com.crud1local.app.repository;

import java.util.List;

import com.crud1local.app.entity.Agenda;





public interface IAgendaDao  {

	public void save(Agenda agenda);
	
	public void delete(Long id);
	
	public Agenda findOne(Long id);
	
	public List<Agenda> findAll();
	
	
}