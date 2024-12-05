package c.h.j;

/* compiled from: Pools.java */
/* loaded from: classes.dex */
public class i<T> extends h<T> {

    /* renamed from: c, reason: collision with root package name */
    private final Object f2748c;

    public i(int i2) {
        super(i2);
        this.f2748c = new Object();
    }

    @Override // c.h.j.h, c.h.j.g
    public boolean a(T t) {
        boolean a;
        synchronized (this.f2748c) {
            a = super.a(t);
        }
        return a;
    }

    @Override // c.h.j.h, c.h.j.g
    public T b() {
        T t;
        synchronized (this.f2748c) {
            t = (T) super.b();
        }
        return t;
    }
}
