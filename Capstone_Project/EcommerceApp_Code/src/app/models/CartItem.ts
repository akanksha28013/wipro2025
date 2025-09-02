export interface CartItem {
  id?: number;
  userId: number;
  productId: number;
  productName?: string;
  price?: number;
  qty: number;
}