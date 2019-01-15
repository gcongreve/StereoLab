public class Radio extends Component {

    private String radioStation;

    public Radio(){
//        super();
        this.radioStation = "Radio 2";
    }

    public String getRadioStation() {
        return radioStation;
    }

    public void tuneRadioStation(String radioStation) {
        this.radioStation = radioStation;
    }
}
