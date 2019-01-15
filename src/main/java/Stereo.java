public class Stereo {

    private String name;
    private CdPlayer cdPlayer;
    private Radio radio;


    public Stereo( String name, CdPlayer cdPlayer, Radio radio ){
        this.cdPlayer = cdPlayer;
        this.radio = radio;
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public CdPlayer getCdPlayer() {
        return cdPlayer;
    }


    public Radio getRadio() {
        return radio;
    }

    public void tuneRadio(String newRadioStation){
        this.radio.tuneRadioStation(newRadioStation);
    }

    public String getRadioStation(){
        return this.radio.getRadioStation();
    }

    public String getAlbumFromCdPlayer(){
        return this.cdPlayer.getAlbum();
    }

    public void setAlbumInCdPlayer(String album){
        this.cdPlayer.setAlbum(album);
    }

}
