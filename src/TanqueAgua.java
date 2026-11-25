public class TanqueAgua {
    private double capacidadMaximaLitros;
    private double nivelActualLitros;

    public TanqueAgua(double capacidadMaximaLitros, double nivelActualLitros) {
        if (capacidadMaximaLitros > 0) {
            this.capacidadMaximaLitros = capacidadMaximaLitros;
        } else {
            this.capacidadMaximaLitros = 0;
            System.out.println("La capacidad maxima debe ser positiva.");
        }

        if (nivelActualLitros >= 0 && nivelActualLitros <= this.capacidadMaximaLitros) {
            this.nivelActualLitros = nivelActualLitros;
        } else {
            this.nivelActualLitros = 0;
            System.out.println("El nivel inicial no es valido.");
        }
    }

    public void llenar(double litros) {
        if (litros > 0) {
            nivelActualLitros = nivelActualLitros + litros;

            if (nivelActualLitros > capacidadMaximaLitros) {
                nivelActualLitros = capacidadMaximaLitros;
            }
        } else {
            System.out.println("La cantidad a cargar debe ser mayor a cero.");
        }
    }

    public void consumir(double litros) {
        if (litros > 0 && litros <= nivelActualLitros) {
            nivelActualLitros = nivelActualLitros - litros;
        } else {
            System.out.println("No hay suficiente agua para ese consumo.");
        }
    }

    public double obtenerPorcentajeLlenado() {
        return (nivelActualLitros * 100) / capacidadMaximaLitros;
    }
}
