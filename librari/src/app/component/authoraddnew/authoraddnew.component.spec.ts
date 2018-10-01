import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AuthoraddnewComponent } from './authoraddnew.component';

describe('AuthoraddnewComponent', () => {
  let component: AuthoraddnewComponent;
  let fixture: ComponentFixture<AuthoraddnewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AuthoraddnewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AuthoraddnewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
