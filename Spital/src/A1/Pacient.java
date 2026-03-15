package A1;

public class Pacient{

    private final String nume;
    private final String cnp;
    private final boolean patRabatabil;
    private final boolean micDejunInclus;
    private final boolean papuciCamera;
    private final boolean halatInterior;

    private Pacient(Builder builder){
        this.nume = builder.nume;
        this.cnp = builder.cnp;
        this.patRabatabil = builder.patRabatabil;
        this.micDejunInclus = builder.micDejunInclus;
        this.papuciCamera = builder.papuciCamera;
        this.halatInterior = builder.halatInterior;
    }

    public String getNume(){
        return nume; }

    public String getCnp(){
        return cnp; }

    public boolean isPatRabatabil(){
        return patRabatabil; }

    public boolean isMicDejunInclus(){
        return micDejunInclus; }

    public boolean isPapuciCamera(){
        return papuciCamera; }

    public boolean isHalatInterior(){
        return halatInterior; }


    @Override
    public String toString(){
        return "Pacient {" +
                "\n  Nume: " + nume +
                "\n  CNP: " + cnp +
                "\n  Pat rabatabil: " + patRabatabil +
                "\n  Mic dejun inclus: " + micDejunInclus +
                "\n  Papuci de camera: " + papuciCamera +
                "\n  Halat interior: " + halatInterior +
                "\n}";
    }

    public static class Builder {

        private final String nume;
        private final String cnp;
        private boolean patRabatabil = false;
        private boolean micDejunInclus = false;
        private boolean papuciCamera = false;
        private boolean halatInterior = false;

        public Builder(String nume, String cnp) {
            this.nume = nume;
            this.cnp = cnp;}

        public Builder cuPatRabatabil(){
            this.patRabatabil = true; return this;}
        public Builder cuMicDejunInclus(){
            this.micDejunInclus = true; return this;}
        public Builder cuPapuciCamera(){
            this.papuciCamera = true; return this;}
        public Builder cuHalatInterior(){
            this.halatInterior = true; return this;}

        public Pacient build(){
            return new Pacient(this);}
    }
}