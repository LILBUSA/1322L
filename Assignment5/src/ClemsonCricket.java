public class ClemsonCricket extends Cricket {

    @Override
    public int getChirpCount(Environment enviro) {
        return (int)(super.getChirpCount(enviro)*.8);
    }
}
