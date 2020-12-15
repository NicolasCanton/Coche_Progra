public class CotxeSegonaPart_Nicolas_Canton extends TestCotxe_Nicolas_Canton {
    private TipusCanvi canvi;
    private marxes marxa = marxes.N;

    private enum marxes {
        F,N,R,G1,G2,G3,G4,G5,G6;
    }

    public CotxeSegonaPart_Nicolas_Canton(String marca ,String model ,TipusCanvi tipuscanvi) {
        super(marca ,model ,tipuscanvi);
    }

    public void CanviMarxaAutomatic(char a) throws Exception {
        if (canvi == TipusCanvi.CanviAutomatic && a == '+') {
            switch (marxa) {
                case R:
                    marxa = marxes.N;
                    break;
                case N:
                    marxa = marxes.F;
                    break;
                case F:
                    throw new Exception("No puedes continuar subiendo marchas");
            }
        }
    }

    public void CanviMarxaManual(char a) throws Exception {
        if (canvi == TipusCanvi.CanviManual && a == '+') {
            switch (marxa) {
                case R:
                    marxa = marxes.G1;
                    break;
                case G1:
                    marxa = marxes.G2;
                    break;
                case G2:
                    marxa = marxes.G3;
                    break;
                case G3:
                    marxa = marxes.G4;
                    break;
                case G4:
                    marxa = marxes.G5;
                    break;
                case G5:
                    marxa = marxes.G6;
                    break;
                case G6:
                    marxa=marxes.N;
                    break;
                case N:
                    throw new Exception("No puedes seguir subiendo marchas");
            }
        }
    }

    public void CanviMarxaAutomatic2(char b) throws Exception {
        if (canvi == TipusCanvi.CanviAutomatic && b == '-') {
            switch (marxa) {
                case F:
                    marxa = marxes.N;
                    break;
                case N:
                    marxa = marxes.R;
                    break;
                case R:
                    throw new Exception("No puedes continuar bajando marchas");
            }
        }
    }

    public void CanviMarxaManual2(char b) throws Exception {
        if (canvi == TipusCanvi.CanviManual && b == '-') {
            switch (marxa) {
                case N:
                    marxa=marxes.G6;
                    break;
                case G6:
                    marxa = marxes.G5;
                    break;
                case G5:
                    marxa = marxes.G4;
                    break;
                case G4:
                    marxa = marxes.G3;
                    break;
                case G3:
                    marxa = marxes.G2;
                    break;
                case G2:
                    marxa = marxes.G1;
                    break;
                case G1:
                    marxa = marxes.R;
                    break;
                case R:
                    throw new Exception("No puedes seguir bajando marchas");
            }
        }
    }
}