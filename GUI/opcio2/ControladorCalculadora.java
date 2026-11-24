import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCalculadora {

    private VistaCalculadora vista;
    private ModeloCalculadora modelo;
    private boolean puntoDecimal;
    private boolean nuevoValor;

    // Inicialitza el controlador i connecta la vista amb el model
    public ControladorCalculadora(VistaCalculadora vista, ModeloCalculadora modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.puntoDecimal = false;
        this.nuevoValor = true;

        registrarOyentes();
    }

    // Associa cada botó de la vista amb el mètode corresponent
    private void registrarOyentes() {

        // Registra els oients dels botons d'operacions
        vista.addOyenteTeclaMas(
            new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                teclaMasPulsada();
            }
        });

        vista.addOyenteTeclaMenos(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                teclaMenosPulsada();
            }
        });

        vista.addOyenteTeclaPor(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                teclaPorPulsada();
            }
        });

        vista.addOyenteTeclaDiv(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                teclaDivPulsada();
            }
        });

        // Registra els oients dels botons d'igual, esborrament i decimal
        vista.addOyenteTeclaIgual(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                teclaIgualPulsada();
            }
        });

        vista.addOyenteTeclaClear(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                teclaClearPulsada();
            }
        });

        vista.addOyenteTeclaDecimal(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                teclaDecimalPulsada();
            }
        });

        // Registra els oients dels botons numèrics del 0 al 9
        for (int i = 0; i < 10; i++) {

            final int digito = i;

            vista.addOyenteTeclaDigito(i, new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    teclaDigitoPulsada(String.valueOf(digito));
                }
            });
        }
    }

    // Defineix i selecciona l'operació de suma mitjançant una lambda
    protected void teclaMasPulsada() {
        OperadorBinario operacio = (x, y) -> x + y;
        procesarOperacion(operacio);
    }

    // Defineix i selecciona l'operació de resta mitjançant una lambda
    protected void teclaMenosPulsada() {
        OperadorBinario operacio = (x, y) -> x - y;
        procesarOperacion(operacio);
    }

    // Defineix i selecciona l'operació de multiplicació mitjançant una lambda
    protected void teclaPorPulsada() {
        OperadorBinario operacio = (x, y) -> x * y;
        procesarOperacion(operacio);
    }

    // Defineix i selecciona l'operació de divisió mitjançant una lambda
    protected void teclaDivPulsada() {
        OperadorBinario operacio = (x, y) -> x / y;
        procesarOperacion(operacio);
    }

    // Processa el valor actual si s'estava editant i desa la nova operació
    private void procesarOperacion(OperadorBinario operacio) {

        if (!nuevoValor) {

            double operando = Double.parseDouble(vista.getDisplay());

            modelo.nuevoOperando(operando);
            modelo.nuevaOperacion(operacio);

            nuevoValor = true;
            puntoDecimal = false;

            vista.setDisplay(String.valueOf(modelo.getResultado()));

        } else {

            modelo.nuevaOperacion(operacio);
        }
    }

    // Envia l'operand al model i mostra el resultat
    protected void teclaIgualPulsada() {

        double operando = Double.parseDouble(vista.getDisplay());

        modelo.nuevoOperando(operando);

        nuevoValor = true;
        puntoDecimal = false;

        vista.setDisplay(String.valueOf(modelo.getResultado()));
    }

    // Reinicia el model, els indicadors d'edició i la pantalla
    protected void teclaClearPulsada() {

        modelo.clear();

        nuevoValor = true;
        puntoDecimal = false;

        vista.setDisplay("0");
    }

    // Introdueix un dígit nou o el concatena al valor actual
    protected void teclaDigitoPulsada(String digito) {

        if (vista.getDisplay().equals("0") || nuevoValor) {

            vista.setDisplay(digito);
            nuevoValor = false;
            puntoDecimal = false;

        } else {

            vista.setDisplay(vista.getDisplay() + digito);
        }
    }

    // Introdueix el punt decimal si el valor encara no en té cap
    protected void teclaDecimalPulsada() {

        if (!puntoDecimal) {

            if (nuevoValor) {

                vista.setDisplay("0.");
                nuevoValor = false;

            } else {

                vista.setDisplay(vista.getDisplay() + ".");
            }

            puntoDecimal = true;
        }
    }
}
