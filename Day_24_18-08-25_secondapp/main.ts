import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Listcomp } from './app/listcomp/listcomp';
import { Conditioncomp } from './app/conditioncomp/conditioncomp';
import { Switchcomp } from './app/switchcomp/switchcomp';
import { Ex15homecomp } from './app/ex15homecomp/ex15homecomp';

bootstrapApplication(Ex15homecomp, appConfig)
  .catch((err) => console.error(err));
