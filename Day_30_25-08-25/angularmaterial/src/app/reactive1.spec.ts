import { TestBed } from '@angular/core/testing';

import { Reactive1 } from './reactive1';

describe('Reactive1', () => {
  let service: Reactive1;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Reactive1);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
