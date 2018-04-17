package co.kurapka.beehive.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.kurapka.beehive.model.Beehive;
import co.kurapka.beehive.respository.BeehiveRepository;

@RestController
@RequestMapping("/beehive")
public class BeehiveController {

	@Autowired
	private BeehiveRepository beehiveRepository;
	
	@RequestMapping(method = RequestMethod.POST)
	public Beehive create(@RequestBody Beehive beehive) {
		return beehiveRepository.save(beehive);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{beehiveId}")
	public Optional<Beehive> get(@PathVariable String beehiveId) {
		return beehiveRepository.findById(beehiveId);
	}
	
}
