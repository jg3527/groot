package model;

import com.google.auto.value.AutoValue;

import java.util.Optional;

/**
 * Created by jingguo on 2/2/19.
 */
@AutoValue
public abstract class Payment {
    
    public abstract long amount();
    public abstract PaymentType paymentType();
    public abstract boolean paymentTogether();
    
    static Builder builder() {
        return new AutoValue_Payment.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder setAmount(long amount);
        public abstract Builder setPaymentType(PaymentType paymentType);
        public abstract Payment build();
    }

    public enum PaymentType {
        WECHAT,CARD, CASH, ALIPAY
    }
}
