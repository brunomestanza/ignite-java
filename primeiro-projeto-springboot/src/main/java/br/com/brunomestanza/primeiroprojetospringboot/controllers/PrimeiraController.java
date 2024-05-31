package br.com.brunomestanza.primeiroprojetospringboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/primeira-controller")
public class PrimeiraController {
  @GetMapping("metodo-route-params/{id}")
  public String metodoRouteParams(@PathVariable String id) {
    return "O parâmetro de rota informado foi " + id;
  }

  @GetMapping("/metodo-query-params")
  public String metodoQueryParams(@RequestParam String busca) {
    return "Você buscou por " + busca;
  }

  @GetMapping("/metodo-query-params2")
  public String metodoQueryParams2(@RequestParam Map<String, String> params) {
    return "Você buscou por " + params.entrySet();
  }

  @PostMapping("/metodo-body-params")
  public String metodoBodyParams(@RequestBody Usuario usuario) {
    return usuario.username;
  }

  public record Usuario(String username) {}
}
