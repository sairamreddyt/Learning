import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChangeColorDirective } from './changecolourdirective';
import { HighlightDirective } from './HighlightDirective';
import { RegisterComponent } from './register/register.component';
import { UserService } from './user.service';
import { UserComponent } from './user/user.component';
import { SwitchdemoComponent } from './switchdemo/switchdemo.component';
import { PipedemoComponent } from './pipedemo/pipedemo.component';
import { HomeComponent } from './home/home.component';
import { CustomPipe } from './Custompipe';

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    UserComponent,
    ChangeColorDirective,
    HighlightDirective,
    SwitchdemoComponent,
    PipedemoComponent,
    CustomPipe,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
