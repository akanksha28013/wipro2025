export interface IUser {
  id?: number;         
  userId: string;      
  firstName: string;
  lastName: string;
  address?: string;
  phone?: string;
  password: string;
  userType: number; 
}
