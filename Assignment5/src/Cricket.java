public class Cricket {
    public int getChirpCount(Environment enviro) {
        return (enviro.getCurrentTemp()*4) - 40;
    }
}
