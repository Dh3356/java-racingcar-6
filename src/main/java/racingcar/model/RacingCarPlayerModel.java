package racingcar.model;

public class RacingCarPlayerModel {
    private final String carName;
    //현재 위치
    private int currentPosition;
    private static final int START_POSITION = 0;
    private static final int MOVE_CONDITION = 4;

    public RacingCarPlayerModel(String carName) {
        this.carName = carName;
        this.currentPosition = START_POSITION;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public String getCarName() {
        return carName;
    }

    public void move(){
        if(util.RacingCarRandoms.getRandomNumber() >= MOVE_CONDITION) {
            this.currentPosition++;
        }
    }
}
