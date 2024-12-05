package kotlin.reflect.x.internal.l0.m;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: ArrayMap.kt */
/* loaded from: classes2.dex */
public final class o<T> extends c<T> {

    /* renamed from: f, reason: collision with root package name */
    private final T f21418f;

    /* renamed from: g, reason: collision with root package name */
    private final int f21419g;

    /* compiled from: ArrayMap.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Iterator<T>, KMappedMarker {

        /* renamed from: f, reason: collision with root package name */
        private boolean f21420f = true;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ o<T> f21421g;

        a(o<T> oVar) {
            this.f21421g = oVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21420f;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f21420f) {
                this.f21420f = false;
                return this.f21421g.w();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(T t, int i2) {
        super(null);
        l.f(t, "value");
        this.f21418f = t;
        this.f21419g = i2;
    }

    @Override // kotlin.reflect.x.internal.l0.m.c
    public int a() {
        return 1;
    }

    @Override // kotlin.reflect.x.internal.l0.m.c
    public void b(int i2, T t) {
        l.f(t, "value");
        throw new IllegalStateException();
    }

    public final int f() {
        return this.f21419g;
    }

    @Override // kotlin.reflect.x.internal.l0.m.c
    public T get(int i2) {
        if (i2 == this.f21419g) {
            return this.f21418f;
        }
        return null;
    }

    @Override // kotlin.reflect.x.internal.l0.m.c, java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this);
    }

    public final T w() {
        return this.f21418f;
    }
}
