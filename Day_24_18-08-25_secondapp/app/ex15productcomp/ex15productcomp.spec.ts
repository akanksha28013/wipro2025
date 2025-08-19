import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex15productcomp } from './ex15productcomp';

describe('Ex15productcomp', () => {
  let component: Ex15productcomp;
  let fixture: ComponentFixture<Ex15productcomp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex15productcomp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex15productcomp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
