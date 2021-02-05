import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {IssueComponent} from "./pages/issue/issue.component";
import {DashboardComponent} from './pages/dashboard/dashboard.component';
import {ProjectComponent} from './pages/project/project.component';

const routes: Routes = [
  {path: 'issue', component: IssueComponent},
  {path: 'dashboard', component: DashboardComponent},
  {path: 'project', component: ProjectComponent},
  {path: '', redirectTo: '/dashboard', pathMatch: 'full'},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
