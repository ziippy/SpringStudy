package com.apress.spring;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.apress.spring.domain.Journal;
import com.apress.spring.repository.JournalRepository;

@SpringBootApplication
public class SpringBootJournalApplication {
	
	@Bean
	InitializingBean saveDate(JournalRepository repo) {
		return () -> {
			repo.save(new Journal("스프링 부트 입문", "오늘부터 스프링 부트 공부하기 시작했다", "03/06/2018"));
			repo.save(new Journal("간단한 스프링 부트 프로젝트", "스프링 부트 프로젝트를 처음 만들어보았다", "03/06/2018"));
			repo.save(new Journal("스프링 부트 해부", "스프링 부트를 자세히 살펴보았다", "03/06/2018"));
			repo.save(new Journal("스프링 부트 클라우드", "클라우드 파운드리를 응용한 스트링 부트를 공부했다", "03/06/2018"));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJournalApplication.class, args);
	}
}
