package androidx.datastore.core;

import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes3.dex */
public abstract class State<T> {
    private final int version;

    public /* synthetic */ State(int i8, AbstractC3151p abstractC3151p) {
        this(i8);
    }

    public final int getVersion() {
        return this.version;
    }

    private State(int i8) {
        this.version = i8;
    }
}
