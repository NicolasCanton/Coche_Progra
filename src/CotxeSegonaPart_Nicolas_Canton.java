public class CotxeSegonaPart_Nicolas_Canton extends TestCotxe_Nicolas_Canton {
    public CotxeSegonaPart_Nicolas_Canton(String marca ,String model ,TipusCanvi tipuscanvi) {
        super(marca ,model ,tipuscanvi);
    }

    public TipusCanvi CanviMarxa() {
        if (tipuscanvi == TipusCanvi.CanviAutomatic) {
            System.out.println("El cambio de marchas es automático");
        } else
            System.out.println("El cambio de marchas es manual.");
        return tipuscanvi;
    }

}


