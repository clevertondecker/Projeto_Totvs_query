package br.com.totvs.sistemaescolar.query.aluno.api;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.totvs.tjf.api.context.stereotype.ApiGuideline;
import com.totvs.tjf.api.context.stereotype.ApiGuideline.ApiGuidelineVersion;
import com.totvs.tjf.api.context.v1.request.ApiPageRequest;
import com.totvs.tjf.api.context.v1.request.ApiSortRequest;
import com.totvs.tjf.api.context.v1.response.ApiCollectionResponse;

import br.com.totvs.sistemaescolar.query.repository.Aluno;
import br.com.totvs.sistemaescolar.query.repository.AlunoRepository;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@RestController
@RequestMapping(path = AlunoController.PATH, produces = { APPLICATION_JSON_VALUE })
@ApiGuideline(ApiGuidelineVersion.v1)
public class AlunoController {

	public static final String PATH = "api/v1/alunos";
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@ApiOperation(value = "Retorna uma lista de alunos.", httpMethod = "GET", consumes = APPLICATION_JSON_VALUE)
	@GetMapping(path = "")
	public ApiCollectionResponse<Aluno> getAllAlunos(ApiPageRequest apiPage, ApiSortRequest apiSort) {
		return this.alunoRepository.findAll(apiPage, apiSort);
	}
}
