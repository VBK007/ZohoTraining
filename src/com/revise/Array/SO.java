package com.revise.Array;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SO <Type> implements Iterable<Type>{
    @Override
    public Iterator<Type> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Type> action) {

    }

    @Override
    public Spliterator<Type> spliterator() {
        return null;
    }
}
