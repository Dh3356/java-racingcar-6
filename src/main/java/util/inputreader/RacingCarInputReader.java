package util.inputreader;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class RacingCarInputReader implements InputReader {
    public String inputPlayers() throws IllegalArgumentException{
        String players =  Console.readLine();
        if(!isInputPlayerValid(players)){
            throw new IllegalArgumentException("Invalid player names");
        }
        return players;
    }

    public boolean isInputPlayerValid(String players){
        List<String> playerList = List.of(players.split(","));
        return !playerList.isEmpty() && playerList.stream().allMatch(player -> player.length() <= 5);
    }

    public int inputTryCount() throws IllegalArgumentException{
        int tryCount = Integer.parseInt(Console.readLine());
        if(!isInputTryCountValid(tryCount)){
            throw new IllegalArgumentException("Invalid try count");
        }
        return tryCount;
    }

    public boolean isInputTryCountValid(int tryCount){
        return tryCount > 0;
    }
}
