package kotlin.reflect.x.internal.l0.m;

import java.util.Iterator;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: ArrayMap.kt */
/* loaded from: classes2.dex */
public abstract class c<T> implements Iterable<T>, KMappedMarker {
    private c() {
    }

    public /* synthetic */ c(g gVar) {
        this();
    }

    public abstract int a();

    public abstract void b(int i2, T t);

    public abstract T get(int i2);

    @Override // java.lang.Iterable
    public abstract Iterator<T> iterator();
}
