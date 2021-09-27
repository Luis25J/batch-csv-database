package com.inai.denue.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.inai.denue.repository.DenueRepository;

@EnableScheduling
@Component
public class DenueBatchRun {

    // My custom schedular to run batch for every minute
    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    Job job;
    
	@Autowired
	private DenueRepository denueRepo;

    @Scheduled(cron = "0 */1 * * * ?")
    //@Scheduled(cron = "0 0 12 * * ?")
    public void perform() throws Exception {
    	
    	denueRepo.deleteAll();
    	
    	long startTime = System.currentTimeMillis();
        JobParameters params = new JobParametersBuilder()
                .addString("DenueJobId", String.valueOf(System.currentTimeMillis()))
                .toJobParameters();
        jobLauncher.run(job, params);
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("########################## Denue BATCHRUN");
        
        System.out.println("##      ##     ##      ##  " + endTime);
    }
	
}
