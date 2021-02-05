import {RouterModule, Routes} from "@angular/router";
import {NgModule} from "@angular/core";
import {ProjectComponent} from "./project.component";

const routers: Routes = [
  {
    path: '',
    component: ProjectComponent
  }
];

@NgModule(
  {
    imports: [RouterModule.forChild(routers)],
    exports: [RouterModule]
  }
)
export class ProjectRoutingModule {
}
