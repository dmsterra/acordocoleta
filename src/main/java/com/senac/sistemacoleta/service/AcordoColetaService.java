package com.senac.sistemacoleta.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.senac.sistemacoleta.entity.AcordoColeta;
import com.senac.sistemacoleta.repository.AcordoColetaRepository;

@Service 
public class AcordoColetaService {

	@Autowired
	private AcordoColetaRepository repository;
	
	public List<AcordoColeta> listAll(){
		return repository.findAll();
	}
	
	public Optional<AcordoColeta> findById(Long id) {
		return repository.findById(id);
	}
	
	@Transactional
	public AcordoColeta save(AcordoColeta acordo) {
		return repository.save(acordo);
	}
	

	
	@Transactional
	public Boolean delete(Long id) {
		Optional<AcordoColeta> acordo = findById(id);
		if(acordo.isPresent()) {
			repository.deleteById(id);
			return true;
		}else {
			return null;
		}
	}

	public AcordoColeta update(AcordoColeta newAcordo, Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
