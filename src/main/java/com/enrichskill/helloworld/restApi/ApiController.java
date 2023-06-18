package com.enrichskill.helloworld.restApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.enrichskill.helloworld.dto.rest_dto;

@RestController
@RequestMapping("/restApi")
public class ApiController {

  @GetMapping("/firstApi")
  public rest_dto sayHi() {
    return new rest_dto("Hello");
  }
}
