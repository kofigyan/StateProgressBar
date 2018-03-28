package com.kofigyan.stateprogressbar.components;

/**
 * Created by Kofi Gyan on 2/20/2018.
 * Builder pattern to ensure a fluent api
 * reference https://community.oracle.com/blogs/emcmanus/2010/10/24/using-builder-pattern-subclasses
 */

public class BaseItem {

    private final int color;
    private final float size;

    public static abstract class Builder<T extends Builder<T>> {

        private int color;
        private float size;

        protected abstract T self();

        public T color(int color) {
            this.color = color;
            return self();
        }

        public T size(float size) {
            this.size = size;
            return self();
        }

        public BaseItem build() {
            return new BaseItem(this);
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

    protected BaseItem(Builder<?> builder) {
        this.color = builder.color;
        this.size = builder.size;
    }

    public int getColor() {
        return color;
    }

    public float getSize() {
        return size;
    }
}
