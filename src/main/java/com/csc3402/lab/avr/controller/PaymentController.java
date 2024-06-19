package com.csc3402.lab.avr.controller;

import com.csc3402.lab.avr.model.Payment;
import com.csc3402.lab.avr.repository.PaymentRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentRepository paymentRepository;

    public PaymentController(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @PostMapping("add")
    public String addPayment(@Valid Payment payment, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "checkout";
        }
        paymentRepository.save(payment);
        return "redirect:/confirmation";
    }
}
