import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Admindashboardcomponent } from './admindashboardcomponent';

describe('Admindashboardcomponent', () => {
  let component: Admindashboardcomponent;
  let fixture: ComponentFixture<Admindashboardcomponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Admindashboardcomponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Admindashboardcomponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
