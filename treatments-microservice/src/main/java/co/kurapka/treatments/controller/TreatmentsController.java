package co.kurapka.treatments.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.kurapka.treatments.model.Treatments;
import co.kurapka.treatments.respository.TreatmentsRepository;

@RestController
@RequestMapping("/treatments")
public class TreatmentsController {

	@Autowired
	private TreatmentsRepository treatmentsRepository;
	
	@RequestMapping(method = RequestMethod.POST)
	public Treatments create(@RequestBody Treatments treatments) {
		return treatmentsRepository.save(treatments);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{treatmentsId}")
	public Optional<Treatments> get(@PathVariable String treatmentsId) {
		return treatmentsRepository.findById(treatmentsId);
	}
	
}
