package com.inai.denue.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.inai.denue.entity.Denue;
import com.inai.denue.repository.DenueRepository;

@Component
public class DenueWriter implements ItemWriter<Denue> {

	@Autowired
	private DenueRepository denueRepo;

	@Override
	public void write(List<? extends Denue> denue) throws Exception {
		denueRepo.save(denue);
	}

}
