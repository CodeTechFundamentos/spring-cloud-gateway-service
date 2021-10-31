package com.nutrix;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/nutritionistFallBack")
    public Mono<String> nutritionistServiceFallBack(){
        return Mono.just("Nutritionist Service is taking too long to respond or is down. Please try again later.");
    }

    @RequestMapping("/patientFallBack")
    public Mono<String> patientServiceFallBack() {
        return Mono.just("Patient Service is taking too long to respond or is down. Please try again later.");
    }

    @RequestMapping("/publicationFallBack")
    public Mono<String> publicationServiceFallBack(){
        return Mono.just("Publication Service is taking too long to respond or is down. Please try again later.");
    }

    @RequestMapping("/appointmentFallBack")
    public Mono<String> appointmentServiceFallBack(){
        return Mono.just("Appointment Service is taking too long to respond or is down. Please try again later.");
    }
}
