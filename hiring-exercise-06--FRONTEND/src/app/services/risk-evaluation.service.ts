import { Injectable } from '@angular/core';
import { Observable} from 'rxjs';
import { HttpClient, HttpParams } from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class RiskEvaluationService {

  constructor(private http: HttpClient) {}

// Parameters obj-
  

  getRiskEvaluation(clientIdentification:any, productId:any): Observable<any>
  {
    let params = new HttpParams();
    params = params.append('product', productId);
    params = params.append('client', clientIdentification);

    return this.http.get("http://localhost:8081/scotiabank/api/CreditRiskApplication/getClientsRiskEvaluationByProduct",
    {
      params: params
    });
  }

}
