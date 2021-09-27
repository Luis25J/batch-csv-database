package com.inai.denue.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.inai.denue.entity.Denue;

@Component
public class DenueProcessor implements ItemProcessor<Denue, Denue>{

	  @Override
	    public Denue process(Denue denue) throws Exception {
	        return denue;
	    }
	
}
