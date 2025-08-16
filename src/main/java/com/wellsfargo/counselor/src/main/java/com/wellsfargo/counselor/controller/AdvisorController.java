package com.wellsfargo.counselor.controller;

import com.wellsfargo.counselor.Advisor;
import com.wellsfargo.counselor.repository.AdvisorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/advisors")
public class AdvisorController {

    private final AdvisorRepository advisorRepository;

    public AdvisorController(AdvisorRepository advisorRepository) {
        this.advisorRepository = advisorRepository;
    }

    // Get all advisors
    @GetMapping
    public List<Advisor> getAllAdvisors() {
        return advisorRepository.findAll();
    }

    // Create advisor
    @PostMapping
    public Advisor createAdvisor(@RequestBody Advisor advisor) {
        return advisorRepository.save(advisor);
    }

    // Get advisor by id
    @GetMapping("/{id}")
    public Advisor getAdvisorById(@PathVariable Long id) {
        return advisorRepository.findById(id).orElse(null);
    }

    // Update advisor
    @PutMapping("/{id}")
    public Advisor updateAdvisor(@PathVariable Long id, @RequestBody Advisor advisorDetails) {
        Advisor advisor = advisorRepository.findById(id).orElse(null);
        if (advisor != null) {
            advisor.setName(advisorDetails.getName());
            advisor.setEmail(advisorDetails.getEmail());
            return advisorRepository.save(advisor);
        }
        return null;
    }

    // Delete advisor
    @DeleteMapping("/{id}")
    public void deleteAdvisor(@PathVariable Long id) {
        advisorRepository.deleteById(id);
    }
}
