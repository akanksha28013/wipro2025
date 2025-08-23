import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OrderComp } from './order-comp';

describe('OrderComp', () => {
  let component: OrderComp;
  let fixture: ComponentFixture<OrderComp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [OrderComp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OrderComp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
