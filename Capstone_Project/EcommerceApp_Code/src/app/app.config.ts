import { ApplicationConfig, importProvidersFrom, provideBrowserGlobalErrorListeners, provideZoneChangeDetection } from '@angular/core';
import { provideRouter } from '@angular/router';

import { routes } from './app.routes';
import { HTTP_INTERCEPTORS, provideHttpClient} from '@angular/common/http';
import { AdminGuard } from './guards/admin-guard';
import { AuthGuard } from './guards/auth-guard';
import { AuthInterceptor } from './interceptors/auth-interceptor';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';


export const appConfig: ApplicationConfig = {
  providers: [
    provideBrowserGlobalErrorListeners(),
    provideZoneChangeDetection({ eventCoalescing: true }),
    { provide: HTTP_INTERCEPTORS, useClass: AuthInterceptor, multi: true },
    provideRouter(routes),
    provideHttpClient(),
    importProvidersFrom(BrowserAnimationsModule)
  ]
};
