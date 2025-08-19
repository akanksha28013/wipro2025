import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex4comp } from './ex4comp';

describe('Ex4comp', () => {
  let component: Ex4comp;
  let fixture: ComponentFixture<Ex4comp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex4comp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex4comp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
