package l6;

import a6.InterfaceC1668n;

/* renamed from: l6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3344a extends F0 implements InterfaceC3390x0, S5.d, M {

    /* renamed from: c, reason: collision with root package name */
    private final S5.g f34593c;

    public AbstractC3344a(S5.g gVar, boolean z8, boolean z9) {
        super(z9);
        if (z8) {
            g0((InterfaceC3390x0) gVar.get(InterfaceC3390x0.f34661n0));
        }
        this.f34593c = gVar.plus(this);
    }

    protected void J0(Object obj) {
        H(obj);
    }

    public final void M0(O o8, Object obj, InterfaceC1668n interfaceC1668n) {
        o8.b(interfaceC1668n, obj, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // l6.F0
    public String P() {
        return Q.a(this) + " was cancelled";
    }

    @Override // l6.F0
    public final void f0(Throwable th) {
        K.a(this.f34593c, th);
    }

    @Override // S5.d
    public final S5.g getContext() {
        return this.f34593c;
    }

    @Override // l6.M
    public S5.g getCoroutineContext() {
        return this.f34593c;
    }

    @Override // l6.F0, l6.InterfaceC3390x0
    public boolean isActive() {
        return super.isActive();
    }

    @Override // l6.F0
    public String o0() {
        String b8 = H.b(this.f34593c);
        if (b8 == null) {
            return super.o0();
        }
        return '\"' + b8 + "\":" + super.o0();
    }

    @Override // S5.d
    public final void resumeWith(Object obj) {
        Object m02 = m0(AbstractC3343G.d(obj, null, 1, null));
        if (m02 == G0.f34553b) {
            return;
        }
        J0(m02);
    }

    @Override // l6.F0
    protected final void t0(Object obj) {
        if (obj instanceof C3339C) {
            C3339C c3339c = (C3339C) obj;
            K0(c3339c.f34530a, c3339c.a());
        } else {
            L0(obj);
        }
    }

    protected void L0(Object obj) {
    }

    protected void K0(Throwable th, boolean z8) {
    }
}
