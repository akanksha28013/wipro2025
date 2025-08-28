import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Reactive1 } from './app/reactive1/reactive1';

bootstrapApplication(Reactive1, appConfig)
  .catch((err) => console.error(err));
