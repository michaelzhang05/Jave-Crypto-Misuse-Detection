package f.b;

import javax.inject.Provider;

/* compiled from: DoubleCheck.java */
/* loaded from: classes2.dex */
public final class a<T> implements Provider<T> {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private volatile Provider<T> f17934b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Object f17935c = a;

    private a(Provider<T> provider) {
        this.f17934b = provider;
    }

    public static <P extends Provider<T>, T> Provider<T> a(P p) {
        b.b(p);
        return p instanceof a ? p : new a(p);
    }

    private static Object b(Object obj, Object obj2) {
        if (!(obj != a) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public T get() {
        T t = (T) this.f17935c;
        Object obj = a;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f17935c;
                if (t == obj) {
                    t = this.f17934b.get();
                    this.f17935c = b(this.f17935c, t);
                    this.f17934b = null;
                }
            }
        }
        return t;
    }
}
