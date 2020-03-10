package br.com.totvs.sistemaescolar.query.repository.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.totvs.sistemaescolar.query.aluno.amqp.events.AlunoUpsertedEvent;
import br.com.totvs.sistemaescolar.query.repository.Aluno;
import br.com.totvs.sistemaescolar.query.repository.AlunoRepository;



@Service
@Transactional
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;

	public void handle(AlunoUpsertedEvent event) {
		alunoRepository.findById(event.getId()).ifPresentOrElse(aluno -> {

			aluno.setId(event.getId());
			aluno.setNome(event.getNome());
			aluno.setEmail(event.getEmail());
			aluno.setCpf(event.getCpf());
			aluno.setMatricula(event.getMatricula());
			aluno.setFormaIngresso(event.getFormaIngresso());
			
			alunoRepository.save(aluno);
		}, () -> {
			
			Aluno aluno = Aluno.builder()
					.id(event.getId())
					.nome(event.getNome())
					.email(event.getEmail())
					.cpf(event.getCpf())
					.matricula(event.getMatricula())
					.formaIngresso(event.getFormaIngresso())
					.build();
			alunoRepository.save(aluno);
		});
	}
}