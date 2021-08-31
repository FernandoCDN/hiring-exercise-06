package com.scotiabankcolpatria.hiring.controllers;

import com.scotiabankcolpatria.hiring.models.paymentDelayModel;
import com.scotiabankcolpatria.hiring.models.riskEvaluationModel;
import com.scotiabankcolpatria.hiring.services.riskEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/CreditRiskApplication")
public class riskEvaluationController
{
    @Autowired
    private riskEvaluationService riskEvaluationService;

    @GetMapping("/getClientsRiskEvaluationProducts")
    private ResponseEntity<List<paymentDelayModel>> getPaymentsDelays()
    {
        return ResponseEntity.ok(riskEvaluationService.getPaymentsDelays());
    }

    @GetMapping("/getClientsRiskEvaluationByProduct")
    private ResponseEntity<riskEvaluationModel> getPaymentsDelays(@RequestParam(name = "product") Integer idproduct, @RequestParam(name = "client") String idclient)
    {
        return ResponseEntity.ok(riskEvaluationService.getPaymentsDelaysByProduct(idproduct,idclient));
    }

    @GetMapping("/hola")
    private ResponseEntity<String> gethola()
    {
        return ResponseEntity.ok("Hola MUndo");
    }
}
