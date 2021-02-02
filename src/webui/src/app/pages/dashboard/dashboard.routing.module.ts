import {RouterModule, Routes} from "@angular/router";
import {NgModule} from "@angular/core";
import {DashboardComponent} from "./dashboard.component";

const routers: Routes = [
  {
    path: '',
    component: DashboardComponent
  }
];

@NgModule(
  {
    imports: [RouterModule.forChild(routers)],
    exports: [RouterModule]
  }
)
export class DashboardRoutingModule {
}
