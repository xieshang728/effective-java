package org.effective.builder;

import java.util.Objects;

public class NyPizza extends Pizza{
    public enum Size {SMALL,MEDIUM, LARGE};
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder>{
        private final Size size;

        public Builder(Size size){
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public Builder addTopping(Topping topping) {
            return super.addTopping(topping);
        }

        @Override
        Pizza build() {
            return null;
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }
}
