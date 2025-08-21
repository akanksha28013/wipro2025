import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Homecomp } from './app/homecomp/homecomp';
import { Ex4comp } from './app/ex4comp/ex4comp';

bootstrapApplication(Homecomp, appConfig)
  .catch((err) => console.error(err));
