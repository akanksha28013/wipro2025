import { Routes } from '@angular/router';
import { Productadd } from './productadd/productadd';
import { Productedit } from './productedit/productedit';
import { Productdelete } from './productdelete/productdelete';
import { Productlist } from './productlist/productlist';
import { OrderHistoryComponent } from './order-history-component/order-history-component';
import { OrderCompt } from './order-comp/order-comp';

export const routes: Routes = [
    { path: '', component: Productlist },
    { path: 'productlist', component: Productlist },
    { path: 'productadd', component: Productadd },
    { path: 'productedit/:id', component: Productedit },
    { path: 'productdelete/:id', component: Productdelete },
    {path:'order', component:OrderCompt},
    {path:'orderhistory', component:OrderHistoryComponent}
 
];
