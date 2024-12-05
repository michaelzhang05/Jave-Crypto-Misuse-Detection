package kotlin.reflect.x.internal.m0;

/* compiled from: HashPMap.java */
/* loaded from: classes2.dex */
public final class b<K, V> {
    private static final b<Object, Object> a = new b<>(d.a(), 0);

    /* renamed from: b, reason: collision with root package name */
    private final d<a<e<K, V>>> f21455b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21456c;

    private b(d<a<e<K, V>>> dVar, int i2) {
        this.f21455b = dVar;
        this.f21456c = i2;
    }

    private static /* synthetic */ void a(int i2) {
        Object[] objArr = new Object[2];
        objArr[0] = "kotlin/reflect/jvm/internal/pcollections/HashPMap";
        if (i2 != 1) {
            objArr[1] = "empty";
        } else {
            objArr[1] = "minus";
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", objArr));
    }

    public static <K, V> b<K, V> b() {
        b<K, V> bVar = (b<K, V>) a;
        if (bVar == null) {
            a(0);
        }
        return bVar;
    }

    private a<e<K, V>> d(int i2) {
        a<e<K, V>> b2 = this.f21455b.b(i2);
        return b2 == null ? a.b() : b2;
    }

    private static <K, V> int e(a<e<K, V>> aVar, Object obj) {
        int i2 = 0;
        while (aVar != null && aVar.size() > 0) {
            if (aVar.f21451g.f21463f.equals(obj)) {
                return i2;
            }
            aVar = aVar.f21452h;
            i2++;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V c(Object obj) {
        for (a d2 = d(obj.hashCode()); d2 != null && d2.size() > 0; d2 = d2.f21452h) {
            e eVar = (e) d2.f21451g;
            if (eVar.f21463f.equals(obj)) {
                return eVar.f21464g;
            }
        }
        return null;
    }

    public b<K, V> f(K k2, V v) {
        a<e<K, V>> d2 = d(k2.hashCode());
        int size = d2.size();
        int e2 = e(d2, k2);
        if (e2 != -1) {
            d2 = d2.o(e2);
        }
        a<e<K, V>> x = d2.x(new e<>(k2, v));
        return new b<>(this.f21455b.c(k2.hashCode(), x), (this.f21456c - size) + x.size());
    }
}
