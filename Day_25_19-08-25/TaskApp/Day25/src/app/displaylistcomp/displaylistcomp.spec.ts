import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Displaylistcomp } from './displaylistcomp';

describe('Displaylistcomp', () => {
  let component: Displaylistcomp;
  let fixture: ComponentFixture<Displaylistcomp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Displaylistcomp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Displaylistcomp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
