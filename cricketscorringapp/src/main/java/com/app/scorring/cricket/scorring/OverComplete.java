package com.app.scorring.cricket.scorring;

import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.Immutable;

import com.app.scorring.cricket.player.Player;
import com.sun.istack.Nullable;

import static java.util.Objects.requireNonNull;

@Immutable
public final class OverComplete {
	
	private final Player bowler;
    private final int inningsNumber;
    private final int overNumber;
    private final int ballsInOver;
    private final Score score;
    private final boolean isMaiden;
    
    private OverComplete(UUID id, @Nullable Instant time, @Nullable Object customData, boolean undoPoint, Player bowler, int inningsNumber, int overNumber, int ballsInOver, Score score, boolean isMaiden) {
        super();
        this.bowler = bowler;
        this.inningsNumber = inningsNumber;
        this.overNumber = overNumber;
        this.ballsInOver = ballsInOver;
        this.score = requireNonNull(score, "score");
        this.isMaiden = isMaiden;
    }


}
