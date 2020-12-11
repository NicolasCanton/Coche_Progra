public class TestCotxe_Nicolas_Canton extends CotxeAbstracte implements InterfaceCotxe {
    private EstatsMotorCotxe estado;
    private int revolucions = 0;
    public TestCotxe_Nicolas_Canton(String marca ,String model ,TipusCanvi tipuscanvi) {
        super(marca ,model ,tipuscanvi);
    }

    @Override
    public void arrancarMotor() throws Exception {
        if (estado == EstatsMotorCotxe.Aturat) {
            this.estado.equals(EstatsMotorCotxe.EnMarxa);
            System.out.println("Ahora el motor esta encendido.");
        } else {
            throw new Exception("El motor ya esta encendido");
        }
    }

    @Override
    public EstatsMotorCotxe comprovaMotor() {
        if (estado == EstatsMotorCotxe.EnMarxa) {
            System.out.println("El motor está en marcha. ");
        } else {
            System.out.println("El motor del coche esta apagado. ");
        }
        return estado;
    }


    @Override
    public int getRevolucions() {
        if (estado.equals(EstatsMotorCotxe.EnMarxa)) {
            this.revolucions = (int) Math.random() * 6500 + 1;
        } else {
            System.out.println("El motor está apagado. ");
        }
        return revolucions;
    }


    @Override
    public void aturarMotor() throws Exception {
        if (estado == EstatsMotorCotxe.EnMarxa) {
            this.estado=EstatsMotorCotxe.Aturat;
            System.out.println("Ahora el motor está apagado. ");
        } else {
            throw new Exception("El motor ya esta apagado. ");
        }
    }
}

