package model;

/**
 * Created by jingguo on 2/2/19.
 */
import com.google.auto.value.AutoValue;

import java.util.Optional;


@AutoValue
public abstract class Transaction {

    public abstract int shopId();
    public abstract String date();
    public abstract Clothes clothes1();
    public abstract Optional<Clothes> clothes2();

    public abstract Optional<Payment> payment();

    public abstract  Optional<ActionType> action();
    public abstract Optional<MovePath> movePath();
    

    public enum ActionType {
        CHANGE, // Customer change clothes
        RETURN, // Customer return clothes
        INNER_MOVE, // Move clothes between shops
        OUTER_MOVE, // Move clothes to other owner's shops
        ADD, // Add clothes
        TAKE_AWAY // Give to other owners to sell
    }

}
