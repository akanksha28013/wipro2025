import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'centigradeToFahrenheit'
})
export class CentigradeToFahrenheitPipe implements PipeTransform {

transform(value: number): string {
    if (value === null || value === undefined || isNaN(value)) return '';
    const fahrenheit = (value * 9 / 5) + 32;
    return `${fahrenheit.toFixed(0)}F`;
  }

}
