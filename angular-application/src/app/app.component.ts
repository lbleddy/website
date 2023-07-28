import { Component, Inject, Injectable } from '@angular/core';
import { ChartService } from './chart.service';
import { Strain } from './Strain';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title = 'angular-application';
  strains: any;
  


  
  constructor(private chartService: ChartService){}
  
  
  ngOnInit(): void {
  let strain = new Strain();
  console.log("here in init");
  this.getData();
  console.log("after getData");
  
}
  getData(): void {
    this.chartService.get().subscribe(data => {
      this.strains = data;
    });
}
 

}
