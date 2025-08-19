import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex15homecomp } from './ex15homecomp';

describe('Ex15homecomp', () => {
  let component: Ex15homecomp;
  let fixture: ComponentFixture<Ex15homecomp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex15homecomp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex15homecomp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
