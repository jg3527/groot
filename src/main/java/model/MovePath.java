package model;

import com.google.auto.value.AutoValue;

import java.util.Optional;

/**
 * Created by jingguo on 2/2/19.
 */
@AutoValue
public abstract class MovePath {
    public abstract Optional<String> from();
    public abstract Optional<String> to();

    static Builder builder() {
        return new AutoValue_MovePath.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder setFrom(String from);
        public abstract Builder setTo(String to);
        public abstract MovePath build();
    }
}
