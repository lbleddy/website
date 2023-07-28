import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { EmptyTableComponent } from './empty-table/empty-table.component';

const routes: Routes = [
  { path: '', redirectTo: 'empty', pathMatch: 'full' },

  { path: 'home', component: AppComponent },
  { path: 'empty', component: EmptyTableComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
