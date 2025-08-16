package com.wellsfargo.counselor.controller;

import com.wellsfargo.counselor.Security;
import com.wellsfargo.counselor.repository.SecurityRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/securities")
public class SecurityController {

    private final SecurityRepository securityRepository;

    public SecurityController(SecurityRepository securityRepository) {
        this.securityRepository = securityRepository;
    }

    @GetMapping
    public List<Security> getAllSecurities() {
        return securityRepository.findAll();
    }

    @PostMapping
    public Security createSecurity(@RequestBody Security security) {
        return securityRepository.save(security);
    }

    @GetMapping("/{id}")
    public Security getSecurityById(@PathVariable Long id) {
        return securityRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Security updateSecurity(@PathVariable Long id, @RequestBody Security securityDetails) {
        Security security = securityRepository.findById(id).orElse(null);
        if (security != null) {
            security.setName(securityDetails.getName());
            security.setType(securityDetails.getType());
            security.setQuantity(securityDetails.getQuantity());
            security.setPurchaseDate(securityDetails.getPurchaseDate());
            return securityRepository.save(security);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteSecurity(@PathVariable Long id) {
        securityRepository.deleteById(id);
    }
}
