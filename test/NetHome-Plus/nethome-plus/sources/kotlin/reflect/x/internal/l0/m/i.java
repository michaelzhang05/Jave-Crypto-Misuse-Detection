package kotlin.reflect.x.internal.l0.m;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: ArrayMap.kt */
/* loaded from: classes2.dex */
public final class i extends c {

    /* renamed from: f, reason: collision with root package name */
    public static final i f21413f = new i();

    /* compiled from: ArrayMap.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Iterator, KMappedMarker {
        a() {
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private i() {
        super(null);
    }

    @Override // kotlin.reflect.x.internal.l0.m.c
    public int a() {
        return 0;
    }

    @Override // kotlin.reflect.x.internal.l0.m.c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Void get(int i2) {
        return null;
    }

    @Override // kotlin.reflect.x.internal.l0.m.c, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    @Override // kotlin.reflect.x.internal.l0.m.c
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void b(int i2, Void r2) {
        l.f(r2, "value");
        throw new IllegalStateException();
    }
}
