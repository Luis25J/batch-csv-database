package com.inai.denue.configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.inai.denue.entity.Denue;

@Configuration
@EnableBatchProcessing
public class DenueBatchConfiguration {

//	@Value("classPath:/Libro1.csv")
//	@Value("classPath:/denue_inegi_11_.csv")
	@Value("C:\\Users\\HP\\Documents\\INAI\\denue_inegi_11_.csv")
	private FileSystemResource csvResource;

	// Employee is entity class which we have taken for the use case
	@Bean
	public Job job(JobBuilderFactory jobBuilderFactory, StepBuilderFactory stepBuilderFactory,
			ItemReader<Denue> itemReader, ItemProcessor<Denue, Denue> itemProcessor, ItemWriter<Denue> itemWriter) {

		Step step = stepBuilderFactory.get("step").<Denue, Denue>chunk(10000).reader(itemReader)
				.processor(itemProcessor).writer(itemWriter).build();

		return jobBuilderFactory.get("Incrementer").incrementer(new RunIdIncrementer()).start(step).build();
	}

	// @Value("${input}") Resource resource
	// Pass the resource
	@Bean
	public FlatFileItemReader<Denue> itemReader() throws FileNotFoundException {

		System.out.println("#######################     ejecucion de batch denue");

		FlatFileItemReader<Denue> flatFileItemReader = new FlatFileItemReader<>();
		flatFileItemReader.setResource(csvResource);
		flatFileItemReader.setName("CSV-Reader");
		flatFileItemReader.setLinesToSkip(1); // for first line skip
		flatFileItemReader.setLineMapper(lineMapper());
		return flatFileItemReader;
	}

	@Bean
	public LineMapper<Denue> lineMapper() {

		DefaultLineMapper<Denue> defaultLineMapper = new DefaultLineMapper<>();
		DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();

		lineTokenizer.setDelimiter(",");
		lineTokenizer.setStrict(false);
		lineTokenizer.setNames(new String[] { "id", "clee", "nom_estab", "raz_social", "codigo_act", "nombre_act",
				"per_ocu", "tipo_vial", "nom_vial", "tipo_v_e_1", "nom_v_e_1", "tipo_v_e_2", "nom_v_e_2", "tipo_v_e_3",
				"nom_v_e_3", "numero_ext", "letra_ext", "edificio", "edificio_e", "numero_int", "letra_int",
				"tipo_asent", "nomb_asent", "tipoCenCom", "nom_CenCom", "num_local", "cod_postal", "cve_ent", "entidad",
				"cve_mun", "municipio", "cve_loc", "localidad", "ageb", "manzana", "telefono", "correoelec", "www",
				"tipoUniEco", "latitud", "longitud", "fecha_alta" });
//        lineTokenizer.setNames(new String[]{"firstName", "middleName", "lastName", "employeeCode"});

		BeanWrapperFieldSetMapper<Denue> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
		fieldSetMapper.setTargetType(Denue.class);

		defaultLineMapper.setLineTokenizer(lineTokenizer);
		defaultLineMapper.setFieldSetMapper(fieldSetMapper);

		return defaultLineMapper;
	}

}
