import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Switchcomp } from './switchcomp';

describe('Switchcomp', () => {
  let component: Switchcomp;
  let fixture: ComponentFixture<Switchcomp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Switchcomp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Switchcomp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
