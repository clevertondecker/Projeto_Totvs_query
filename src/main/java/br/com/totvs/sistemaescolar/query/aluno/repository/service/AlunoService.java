package br.com.totvs.sistemaescolar.query.aluno.repository.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.totvs.sistemaescolar.query.aluno.amqp.events.AlunoCriadoEvent;
import br.com.totvs.sistemaescolar.query.aluno.repository.Aluno;
import br.com.totvs.sistemaescolar.query.aluno.repository.AlunoRepository;

@Service
@Transactional
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;

	public void handle(AlunoCriadoEvent event) {
		alunoRepository.findById(event.getId()).ifPresentOrElse(aluno -> {

			aluno.setId(event.getId());
			aluno.setNome(event.getNome());
			aluno.setEmail(event.getEmail());
			aluno.setCpf(event.getCpf());
			aluno.setMatricula(event.getMatricula());
			aluno.setFormaIngresso(event.getFormaIngresso());
			aluno.setTurmaId(event.getTurmaId());
					
			alunoRepository.save(aluno);
		}, () -> {

			Aluno aluno = Aluno.builder()
					.id(event.getId())
					.nome(event.getNome())
					.email(event.getEmail())
					.cpf(event.getCpf())
					.matricula(event.getMatricula())
					.formaIngresso(event.getFormaIngresso())
					.turmaId(event.getTurmaId())
					.build();
			alunoRepository.save(aluno);
		});
	}
}