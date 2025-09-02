import { Routes } from '@angular/router';
import { CartComponent } from './components/cart-component/cart-component';
import { LoginComponent } from './components/login-component/login-component';
import { OrderHistoryComponent } from './components/order-history-component/order-history-component';

import { UserCatalogueComponent } from './components/user-catalogue-component/user-catalogue-component';
import { AuthGuard } from './guards/auth-guard';
import { AdminGuard } from './guards/admin-guard';
import { Admindashboardcomponent } from './components/admindashboardcomponent/admindashboardcomponent';

export const routes: Routes = [
{ path: '', redirectTo: 'login', pathMatch: 'full' },
  { path: 'login', component: LoginComponent },

  { path: 'catalogue', component: UserCatalogueComponent },
  { path: 'cart', component: CartComponent },
  { path: 'orders', component: OrderHistoryComponent },
  { path: 'admin', component: Admindashboardcomponent },
  { path: '**', redirectTo: 'login' }
];
