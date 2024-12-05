package kotlin.reflect.x.internal.m0;

/* compiled from: IntTreePMap.java */
/* loaded from: classes2.dex */
final class d<V> {
    private static final d<Object> a = new d<>(c.a);

    /* renamed from: b, reason: collision with root package name */
    private final c<V> f21462b;

    private d(c<V> cVar) {
        this.f21462b = cVar;
    }

    public static <V> d<V> a() {
        return (d<V>) a;
    }

    private d<V> d(c<V> cVar) {
        return cVar == this.f21462b ? this : new d<>(cVar);
    }

    public V b(int i2) {
        return this.f21462b.a(i2);
    }

    public d<V> c(int i2, V v) {
        return d(this.f21462b.b(i2, v));
    }
}
