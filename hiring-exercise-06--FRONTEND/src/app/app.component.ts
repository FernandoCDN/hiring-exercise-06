import { Component, OnInit } from '@angular/core';
import { RiskEvaluationService } from './services/risk-evaluation.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'scotiabankFrontend';
  riskData: any;
  productId: any;
  clientIdentification: any;


  constructor(public riskEvaluationService: RiskEvaluationService){}

  ngOnInit()
  {
    this.riskEvaluationService.getRiskEvaluation(this.clientIdentification,this.productId).subscribe(data => 
      {
        this.riskData = Array.of(data);
        console.log(this.riskData);
      });
  }

  search()
  {
    this.riskEvaluationService.getRiskEvaluation(this.clientIdentification,this.productId).subscribe(data => 
      {
        this.riskData = Array.of(data);
        console.log(this.riskData);
      });
  }

}
