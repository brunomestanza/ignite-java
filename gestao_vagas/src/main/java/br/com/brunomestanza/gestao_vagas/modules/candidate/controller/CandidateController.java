package br.com.brunomestanza.gestao_vagas.modules.candidate.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.brunomestanza.gestao_vagas.modules.candidate.CandidateEntity;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/candidates")
public class CandidateController {
  @PostMapping("/")
  public void create(@Valid @RequestBody CandidateEntity candidateEntity) {
    System.out.println(candidateEntity.getEmail());
    System.out.println(candidateEntity.getDescription());
    System.out.println(candidateEntity.getUsername());
    System.out.println(candidateEntity.getClass());
  }
}
