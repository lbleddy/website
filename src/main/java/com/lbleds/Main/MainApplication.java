package com.lbleds.Main;

import com.lbleds.Entity.Strain;
import com.lbleds.Repository.StrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

@SpringBootApplication
@ComponentScan({"com.lbleds.controller"})
@EntityScan("com.lbleds.Entity")
@EnableJpaRepositories("com.lbleds.Repository")
public class MainApplication {

	@Autowired
	private StrainRepository strainRepository;
	private static long ID_GENERATOR = (new AtomicInteger(1000)).longValue();


	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		String sql = "INSERT INTO STRAINS (name, sativa_percentage, " +
//				"indica_percentage) VALUES ('Testing Name',50,50) ";
//		int rows = jdbcTemplate.update(sql);
//		if(rows > 0){
//			System.out.println("A new row has been inserted");
//		}
//	}
	@Bean
	CommandLineRunner init(){

		return args -> {
			Stream.of("Northeast","Purple Haze","Orange","Kyoto","Hypothetical" +
					"").forEach(name -> {
						Strain strain = new Strain(ID_GENERATOR,name,"50","50",19);
						strainRepository.save(strain);
			});
			for (Strain strain : strainRepository.findAll()) {
				System.out.println(strain);
			}
		};
	}

}
