package com.enrichskill.helloworld.restApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.enrichskill.helloworld.dto.restDto;

@RestController
@RequestMapping("/restApi")
public class ApiController {

  @GetMapping("/firstApi")
  public restDto sayHi() {
    return new restDto("ikufehunoikfewssjnikhol");
  }
}
