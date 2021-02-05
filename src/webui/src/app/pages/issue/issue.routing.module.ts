import {RouterModule, Routes} from "@angular/router";
import {IssueComponent} from "./issue.component";
import {NgModule} from "@angular/core";

const routers: Routes = [
  {
    path: '',
    component: IssueComponent
  }
];

@NgModule(
  {
    imports: [RouterModule.forChild(routers)],
    exports: [RouterModule]
  }
)
export class IssueRoutingModule {
}
