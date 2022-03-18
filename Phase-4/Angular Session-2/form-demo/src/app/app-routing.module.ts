import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PipedemoComponent } from './pipedemo/pipedemo.component';
import { RegisterComponent } from './register/register.component';
import { SwitchdemoComponent } from './switchdemo/switchdemo.component';
import { UserComponent } from './user/user.component';

const routes: Routes = [
  {"path":"register",component:RegisterComponent},
  {"path":"switch",component:SwitchdemoComponent},
  {"path":"pipe",component:PipedemoComponent},
  {"path":"user",component:UserComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
