package com.ssooya.batch.jobs;


import com.ssooya.batch.tasklets.TutorialTasklet;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Slf4j

@Configuration
//Spring Batch의 모든 Job은 @Configuration으로 등록해서 사용합니다.




@RequiredArgsConstructor
public class TutorialConfig {

	private final JobBuilderFactory jobBuilderFactory; // Job 빌더 생성용
	private final StepBuilderFactory stepBuilderFactory; // Step 빌더 생성용

	// JobBuilderFactory를 통해서 tutorialJob을 생성
	@Bean
	public Job tutorialJob() {
		return jobBuilderFactory.get("tutorialJob")
				.start(tutorialStep())  // Step 설정
				.build();
	}

	// StepBuilderFactory를 통해서 tutorialStep을 생성
	@Bean
	public Step tutorialStep() {
		return stepBuilderFactory.get("tutorialStep")
				.tasklet((contribution, chunkContext) -> {
					log.info(">>>> this is STep1");
					return RepeatStatus.FINISHED;
				})
				.build();
	}
}