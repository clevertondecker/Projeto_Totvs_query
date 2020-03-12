package br.com.totvs.sistemaescolar.query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.totvs.tjf.api.jpa.repository.impl.ApiJpaRepositoryImpl;

import br.com.totvs.sistemaescolar.query.config.FlyWayProperties;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableConfigurationProperties({ YMSProperties.class, FlyWayProperties.class })
@EnableJpaRepositories(repositoryBaseClass = ApiJpaRepositoryImpl.class)

public class AluraSpringBootParte2Admin1Application {

	public static void main(String[] args) {
		SpringApplication.run(AluraSpringBootParte2Admin1Application.class, args);
	}

}
