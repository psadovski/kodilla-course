package com.kodilla.rps;

import java.util.Arrays;

public enum RpsTurn {

    BAD(""), END("x"), REPLAY("n"), ROCK("1"), PAPER("2"), SCISSORS("3");

    private String move;

    RpsTurn(String move) {
        this.move = move;
    }

    public static RpsTurn getMove(String move) {
        return Arrays.stream(values()).filter(x -> x.getMove().equalsIgnoreCase(move)).findFirst().orElse(BAD);
    }

    public static RpsTurn getMove(Integer move) {
        return getMove(move.toString());
    }

    public String getMove() {
        return move;
    }

    public static boolean isRegular(RpsTurn turn) {
        return turn == RpsTurn.PAPER || turn == RpsTurn.ROCK || turn == RpsTurn.SCISSORS;
    }

    public static String getName(RpsTurn turn) {
    return turn.name().toLowerCase();
    }
}
