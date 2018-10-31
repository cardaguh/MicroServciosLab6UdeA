package com.udea;

import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class ReservationCLR implements CommandLineRunner {
	
	@Autowired
	private ReservationRepository reservationRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Stream.of("Diego", "Luis", "Pepe", "Andres").
			forEach(s -> reservationRepository.save(new Reservation(s)));
		reservationRepository.findAll().forEach(System.out::println);
	}
}
