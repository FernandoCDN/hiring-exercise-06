import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { RiskEvaluationService } from './services/risk-evaluation.service';
import { HttpClientModule } from "@angular/common/http";

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    HttpClientModule,
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [RiskEvaluationService],
  bootstrap: [AppComponent]
})
export class AppModule { }
