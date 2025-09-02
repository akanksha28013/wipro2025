export interface IOrder {

  id?: number;
  userId: number;
  status: string; 
  products?: { productId: number; qty: number }[];
}