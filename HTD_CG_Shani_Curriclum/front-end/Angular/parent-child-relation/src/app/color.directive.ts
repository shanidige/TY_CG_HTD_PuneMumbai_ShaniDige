import { ElementRef, Directive, HostListener, HostBinding } from '@angular/core';
@Directive({
    selector: '[appColor]'
})
export class ColorDirective {
    constructor(private el: ElementRef) {
        this.el.nativeElement.style.backgroundColor = 'red';
        this.el.nativeElement.style.color = 'white';
        this.el.nativeElement.style.padding = '5px';
    }

    @HostBinding('style.fontSize') fontSize;
    @HostListener('mouseenter')

   mouseEnter() {
       this.fontSize = '50px';
       this.el.nativeElement.style.backgroundColor = 'blue';
    }


    @HostListener('mouseleave')

   mouseLeave() {
        console.log('mouse leave');
        this.el.nativeElement.style.backgroundColor = 'red';
    }
}
