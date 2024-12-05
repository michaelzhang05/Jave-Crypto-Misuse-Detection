package l6;

import q6.C3865F;

/* loaded from: classes5.dex */
public final class X0 {

    /* renamed from: a, reason: collision with root package name */
    public static final X0 f34587a = new X0();

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f34588b = q6.M.a(new C3865F("ThreadLocalEventLoop"));

    private X0() {
    }

    public final AbstractC3359h0 a() {
        return (AbstractC3359h0) f34588b.get();
    }

    public final AbstractC3359h0 b() {
        ThreadLocal threadLocal = f34588b;
        AbstractC3359h0 abstractC3359h0 = (AbstractC3359h0) threadLocal.get();
        if (abstractC3359h0 == null) {
            AbstractC3359h0 a8 = AbstractC3365k0.a();
            threadLocal.set(a8);
            return a8;
        }
        return abstractC3359h0;
    }

    public final void c() {
        f34588b.set(null);
    }

    public final void d(AbstractC3359h0 abstractC3359h0) {
        f34588b.set(abstractC3359h0);
    }
}
