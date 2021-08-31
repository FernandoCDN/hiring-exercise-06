package com.scotiabankcolpatria.hiring.services;

import com.scotiabankcolpatria.hiring.CreditRiskAssessment;
import com.scotiabankcolpatria.hiring.models.paymentDelayModel;
import com.scotiabankcolpatria.hiring.models.riskEvaluationModel;
import com.scotiabankcolpatria.hiring.repositories.clientRepository;
import com.scotiabankcolpatria.hiring.repositories.paymentDelayRepository;
import com.scotiabankcolpatria.hiring.repositories.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class riskEvaluationService
{
    @Autowired
    private paymentDelayRepository paymentDelayRepository;

    @Autowired
    private clientRepository clientRepository;

    @Autowired
    private productRepository productRepository;


    public List<paymentDelayModel> getPaymentsDelays()
    {
        return paymentDelayRepository.findAll();
    }


    public riskEvaluationModel getPaymentsDelaysByProduct(Integer idproduct, String idclient)
    {
        List<paymentDelayModel> paymentDelayModels = new ArrayList<>();

        paymentDelayModels = paymentDelayRepository.findAllByProduct(idproduct,idclient);

        CreditRiskAssessment riskAssessment = new CreditRiskAssessment();


        riskEvaluationModel riskEvaluationModel = new riskEvaluationModel();

        int[] DelaysQuantities = new int[paymentDelayModels.size()];

        for(int i=0; i<paymentDelayModels.size(); i++)
        {
            DelaysQuantities[i] = paymentDelayModels.get(i).getQuantity();
        }

        double standardDeviation = riskAssessment.standardDeviation(DelaysQuantities);
        int index = riskAssessment.paymentDelayMaxPeakIndex(DelaysQuantities);

        riskEvaluationModel.setStandardDeviation(standardDeviation);
        riskEvaluationModel.setPaymentDelayMaxPeakIndex(index);

        riskEvaluationModel.setClient(clientRepository.findByidentification(idclient));
        riskEvaluationModel.setProduct(productRepository.findAllById(idproduct));

        return riskEvaluationModel;
    }


}
