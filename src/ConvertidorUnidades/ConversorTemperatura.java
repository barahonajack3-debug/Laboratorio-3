package ConvertidorUnidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class ConversorTemperatura {
    
    public static double convertir(double valor, UnidadTemperatura origen, UnidadTemperatura destino) {
        double celsius = aCelsius(valor, origen);
        return deCelsius(celsius, destino);
    }
    
    private static double aCelsius(double valor, UnidadTemperatura unidad) {
        switch (unidad) {
            case CELSIUS:
                return valor;
            case FAHRENHEIT:
                return (valor - 32) * 5.0 / 9.0;
            case KELVIN:
                return valor - 273.15;
            case RANKINE:
                return (valor - 491.67) * 5.0 / 9.0;
            default:
                return valor;
        }
}

    private static double deCelsius(double celsius, UnidadTemperatura unidad) {
        switch (unidad) {
            case CELSIUS:
                return celsius;
            case FAHRENHEIT:
                return celsius * 9.0 / 5.0 + 32;
            case KELVIN:
                return celsius + 273.15;
            case RANKINE:
                return (celsius + 273.15) * 9.0 / 5.0;
            default:
                return celsius;
        }
    }
}
