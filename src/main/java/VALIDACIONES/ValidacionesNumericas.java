/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VALIDACIONES;

import estructuras.RespuestaValidacion;

/**
 *
 * @author WINDOWS
 */
// este es una clase Servidora
public class ValidacionesNumericas {

    // los nombres de los metodos son acciones por lo que se usan nombre como verbos
    // la nomentlatura es camel case.  los parametros que reciben las acciones se llmana arguntos
    public static estructuras.RespuestaValidacion validarArea(double area) {
        if (area <= 0) {
            return new RespuestaValidacion("001", "El área no puede ser cero o negativa", false);
        }

        // Siempre devolver algo si es válido
        return new RespuestaValidacion("000", "Área válida", true);
    }


    // algoritmo para verificar dpi mediante digito verificador
    public static boolean verificarDpi(String dpi) {
        if (dpi == null) {
            return false;
        }

        // Validar formato 9999 99999 9999 (con espacios)
        if (!dpi.matches("^\\d{4}\\s\\d{5}\\s\\d{4}$")) {
            return false;
        }

        // Eliminar espacios
        String cui = dpi.replace(" ", "");

        if (cui.length() != 13) {
            return false;
        }

        try {
            String numero = cui.substring(0, 8);
            int validador = Integer.parseInt(cui.substring(8, 9));
            int depto = Integer.parseInt(cui.substring(9, 11));
            int muni = Integer.parseInt(cui.substring(11, 13));

            int[] munPorDepto = {
                17, 8, 16, 16, 14, 14, 19, 8, 24, 21, 9,
                30, 33, 21, 8, 17, 14, 5, 11, 11, 7, 17
            };

            if (depto == 0 || muni == 0) {
                return false;
            }
            if (depto > munPorDepto.length) {
                return false;
            }
            if (muni > munPorDepto[depto - 1]) {
                return false;
            }

            int total = 0;
            for (int i = 0; i < numero.length(); i++) {
                int digito = Integer.parseInt(numero.substring(i, i + 1));
                total += digito * (i + 2);
            }

            int modulo = total % 11;
            return modulo == validador;

        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            return false;
        }

    }

    // 🔹 Método de negocio (alto nivel)
    public static RespuestaValidacion validarDPI(String dpi) {

        if (verificarDpi(dpi)) {
            return new RespuestaValidacion("DPI_OK", "DPI válido", true);
        } else {
            return new RespuestaValidacion("DPI_ERROR", "DPI inválido", false);
        }
    }
}
