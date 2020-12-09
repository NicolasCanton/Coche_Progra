public class Coche_Nicolas_Canton extends CocheAbstracto implements InterfaceCoche {
    private EstatsMotorCoche estado;
    private int revolucions = 0;
    public Coche_Nicolas_Canton(String marca ,String model ,TipusCanvi tipuscanvi) {
        super(marca ,model ,tipuscanvi);
    }

    @Override
    public void arrancarMotor() throws Exception {
        if (estado == EstatsMotorCoche.Aturat) {
            this.estado.equals(EstatsMotorCoche.EnMarxa);
            System.out.println("Ahora el motor esta encendido.");
        } else {
            throw new Exception("El motor ya esta encendido");
        }
    }

    @Override
    public EstatsMotorCoche comprovaMotor() {
        if (estado == EstatsMotorCoche.EnMarxa) {
            System.out.println("El motor está en marcha. ");
        } else {
            System.out.println("El motor del coche esta apagado. ");
        }
        return estado;
    }


    @Override
    public int getRevolucions() {
        if (estado.equals(EstatsMotorCoche.EnMarxa)) {
            this.revolucions = (int) Math.random() * 6500 + 1;
        } else {
            System.out.println("El motor está apagado. ");
        }
        return revolucions;
    }


    @Override
    public void aturarMotor() throws Exception {
        if (estado == EstatsMotorCoche.EnMarxa) {
            this.estado=EstatsMotorCoche.Aturat;
            System.out.println("Ahora el motor está apagado. ");
        } else {
            throw new Exception("El motor ya esta apagado. ");
        }
    }
}

