package br.com.totvs.sistemaescolar.query.professor.repository;

import javax.transaction.Transactional;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.totvs.sistemaescolar.query.professor.amqp.events.ProfessorCriadoEvent;
import br.com.totvs.sistemaescolar.query.professor.repository.service.Professor;

@Service
@Transactional
public class ProfessorService {

//	private static final Logger LOG = LoggerFactory.getLogger(AlunoService.class);

	@Autowired
	private ProfessorRepository professorRepository;

	public void handle(ProfessorCriadoEvent event) {
		professorRepository.findById(event.getId()).ifPresentOrElse(professor -> {

			professor.setId(event.getId());
			professor.setNome(event.getNome());
			professor.setEmail(event.getEmail());
			professor.setCpf(event.getCpf());
			professor.setTitulo(event.getTitulo());
			professor.setDisciplinaId(event.getDisciplinaId());
					
			professorRepository.save(professor);
		}, () -> {

			Professor professor = Professor.builder()
					.id(event.getId())
					.nome(event.getNome())
					.email(event.getEmail())
					.cpf(event.getCpf())
					.titulo(event.getTitulo())
					.disciplinaId(event.getDisciplinaId())
					.build();
			professorRepository.save(professor);
		});
	}
}