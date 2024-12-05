package androidx.navigation;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class NamedNavArgument {
    private final NavArgument argument;
    private final String name;

    public NamedNavArgument(String name, NavArgument argument) {
        AbstractC3159y.i(name, "name");
        AbstractC3159y.i(argument, "argument");
        this.name = name;
        this.argument = argument;
    }

    public final String component1() {
        return this.name;
    }

    public final NavArgument component2() {
        return this.argument;
    }

    public final NavArgument getArgument() {
        return this.argument;
    }

    public final String getName() {
        return this.name;
    }
}
