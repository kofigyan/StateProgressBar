package com.kofigyan.stateprogressbar.components;


/**
 * Created by Kofi Gyan on 2/20/2018.
 */

public class StateItem extends BaseItem {

    private final StateItemNumber stateItemNumber;

    private final StateItemDescription stateItemDescription;

    private final boolean isCurrentState;

    private final boolean isStateChecked;


    public static abstract class Builder<T extends Builder<T>> extends BaseItem.Builder<T> {
        private StateItemNumber stateItemNumber;
        private StateItemDescription stateItemDescription;
        private boolean isCurrentState;
        private boolean isStateChecked;

        public T stateItemNumber(StateItemNumber stateItemNumber) {
            this.stateItemNumber = stateItemNumber;
            return self();
        }

        public T stateItemDescription(StateItemDescription stateItemDescription) {
            this.stateItemDescription = stateItemDescription;
            return self();
        }

        public T isCurrentState(boolean isCurrentState) {
            this.isCurrentState = isCurrentState;
            return self();
        }

        public T isStateChecked(boolean isStateChecked) {
            this.isStateChecked = isStateChecked;
            return self();
        }

        public StateItem build() {
            return new StateItem(this);
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


    protected StateItem(Builder<?> builder) {
        super(builder);
        this.stateItemNumber = builder.stateItemNumber;
        this.stateItemDescription = builder.stateItemDescription;
        this.isCurrentState = builder.isCurrentState;
        this.isStateChecked = builder.isStateChecked;
    }


    public StateItemNumber getStateItemNumber() {
        return stateItemNumber;
    }

    public StateItemDescription getStateItemDescription() {
        return stateItemDescription;
    }

    public boolean isCurrentState() {
        return isCurrentState;
    }

    public boolean isStateChecked() {
        return isStateChecked;
    }
}
