import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { AlticciInterface } from "./alticci.interface";

@Injectable({
  providedIn: 'root'
})
export class AlticciService {

  private readonly BASE_URL = "http://localhost:8080/alticci";

  constructor(
    private http: HttpClient
  ) { }

  public getSequenciaAlticci(num: number): Observable<AlticciInterface> {
    console.log(num);
    return this.http.get<AlticciInterface>(
      `${this.BASE_URL}/inserir/${num}`
    )
  }
}
