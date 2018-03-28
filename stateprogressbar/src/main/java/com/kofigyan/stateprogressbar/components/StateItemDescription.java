package com.kofigyan.stateprogressbar.components;

/**
 * Created by Kofi Gyan on 2/20/2018.
 */

public class StateItemDescription extends BaseItem {

    private final String text;

    // private Typeface typeface;


    public static abstract class Builder<T extends Builder<T>> extends BaseItem.Builder<T> {
        private String text;

        public T text(String text) {
            this.text = text;
            return self();
        }

        public StateItemDescription build() {
            return new StateItemDescription(this);
        }
    }

    private static class Builder2 extends Builder<Builder2> {
        @Override
        protected Builder2 self() {
            return this;
        }
    }

    public static Builder<?> builder() {
        return new Builder2();
    }


    protected StateItemDescription(Builder<?> builder) {
        super(builder);
        this.text = builder.text;
    }

    public String getText() {
        return text;
    }
}
