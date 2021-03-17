package ru.netology.test_service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.netology.test_service.Verification;

@RestController
@RequestMapping("/")
public class MoneyTransferController {

//    private final MoneyTransferService moneyTransferService;
//
//    public MoneyTransferController(MoneyTransferService moneyTransferService) {
//        this.moneyTransferService = moneyTransferService;
//    }

    @PostMapping("/transfer/{id}")
    public ResponseEntity<String> transfer(@PathVariable long id) {
        return new ResponseEntity<> ("arfgiontrio_111111", HttpStatus.OK);
    }

    @PostMapping("/confirmOperation/{id}")
    public ResponseEntity<String> confirmOperation(@RequestBody Verification verification, @PathVariable long id) {

        System.out.println(verification.getOperationID());
        System.out.println(verification.getCode());
        return new ResponseEntity<> ("Success!", HttpStatus.OK);
    }


}
