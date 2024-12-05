package androidx.core.util;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: c, reason: collision with root package name */
    private final Object f2267c;

    public g(int i6) {
        super(i6);
        this.f2267c = new Object();
    }

    @Override // androidx.core.util.f, androidx.core.util.e
    public boolean a(Object obj) {
        boolean a6;
        synchronized (this.f2267c) {
            a6 = super.a(obj);
        }
        return a6;
    }

    @Override // androidx.core.util.f, androidx.core.util.e
    public Object b() {
        Object b6;
        synchronized (this.f2267c) {
            b6 = super.b();
        }
        return b6;
    }
}
