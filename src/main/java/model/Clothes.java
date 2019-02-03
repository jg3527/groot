package model;

import com.google.auto.value.AutoValue;

import java.util.Optional;

/**
 * Created by jingguo on 2/2/19.
 */
@AutoValue
abstract class Clothes {
    public abstract Optional<String> clothesDescription();
    public abstract Optional<String> size();
    public abstract Optional<String> clothesId();
    public abstract Optional<String> owner();

    static Builder builder() {
        return new AutoValue_Clothes.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder setClothesDescription(Optional<String> value);
        public abstract Builder setSize(Optional<String> value);
        public abstract Builder setClothesId(Optional<String> value);
        public abstract Builder setOwner(Optional<String> value);
        public abstract Payment build();
    }
}
