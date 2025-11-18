#include <avr/io.h>
#include <util/delay.h>
#include <stdint.h>
#define F_CPU 8000000UL

int main(void) {
    DDRB = 0xFF;
    DDRD = 0x00;
    PORTD = 0xFF;

    uint8_t a = 0;
    uint8_t b = 0;
    
    uint8_t input_state = 0;
    uint8_t current_input = 0;

    PORTB = 0;

    while (1) {
        current_input = ~PIND & 0b00000111;
        
        switch (input_state) {
            case 0:
                PORTB = current_input;
                if (!(PIND & (1 << 3))) {
                    a = current_input;
                    input_state = 1;
                    PORTB = 0;
                    _delay_ms(200);
                }
                break;

            case 1:
                PORTB = current_input;
                if (!(PIND & (1 << 3))) {
                    b = current_input;
                    input_state = 2;
                    PORTB = 0b11111111;
                    _delay_ms(300);
                    PORTB = 0;
                }
                break;

            case 2:
                if (!(PIND & (1 << 4))) {
                    PORTB = a + b;
                }
                else if (!(PIND & (1 << 5))) {
                    PORTB = a - b;
                }
                else if (!(PIND & (1 << 6))) {
                    PORTB = a * b;
                }
                else if (!(PIND & (1 << 7))) {
                    if (b != 0) {
                        PORTB = a / b;
                    } else {
                        PORTB = 0xFF; 
                    }
                }
                break;
        }
        
        _delay_ms(50); 
        
    }
}
