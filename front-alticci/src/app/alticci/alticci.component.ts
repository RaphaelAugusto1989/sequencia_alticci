import { Component, OnInit } from '@angular/core';
import {AlticciService} from "./alticci.service";
import { FormGroup, FormBuilder, Validators } from "@angular/forms";
import { AlticciInterface } from "./alticci.interface";

@Component({
  selector: 'app-alticci',
  templateUrl: './alticci.component.html',
  styleUrls: ['./alticci.component.scss']
})
export class AlticciComponent implements OnInit {

  sequenciaAlticci: any;

  form: FormGroup;

  constructor(
    private service: AlticciService,
    private formBuilder: FormBuilder
  ) {
    this.form = this.formBuilder.group( {
      number: ["", Validators.required]
    });
    this.sequenciaAlticci = null;
  }

  ngOnInit(): void {
  }

  public sequenciar(): any {
    const numberResquest = parseInt(this.form.get("number")?.value);

    this.service.getSequenciaAlticci(numberResquest)
      .subscribe( res => {
          this.sequenciaAlticci = res;
          console.log(res)
        }
      )
  }

  public limpar(): void {
    this.form.get("number")?.setValue("");
    this.sequenciaAlticci = null;
  }
}
