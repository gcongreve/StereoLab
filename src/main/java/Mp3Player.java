public class Mp3Player extends Component implements IConnect {

    public String connect(Stereo stereo){
        return stereo.getName();
    }
}
