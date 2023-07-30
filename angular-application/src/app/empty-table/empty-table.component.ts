import { Component } from '@angular/core';
import { AppComponent } from '../app.component';
import { ChartService } from '../chart.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-empty-table',
  templateUrl: './empty-table.component.html',
  styleUrls: ['./empty-table.component.css']
})
export class EmptyTableComponent {
    
  constructor(private chartService:ChartService){}; 
  

  strains:any = this.chartService.getStrains().subscribe(data =>
    {this.strains = data});



}
