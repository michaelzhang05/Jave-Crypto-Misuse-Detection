package i6;

/* renamed from: i6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2809a extends F0 implements InterfaceC2855x0, P5.d, M {

    /* renamed from: c, reason: collision with root package name */
    private final P5.g f31741c;

    public AbstractC2809a(P5.g gVar, boolean z8, boolean z9) {
        super(z9);
        if (z8) {
            g0((InterfaceC2855x0) gVar.get(InterfaceC2855x0.f31809n0));
        }
        this.f31741c = gVar.plus(this);
    }

    protected void K0(Object obj) {
        H(obj);
    }

    public final void N0(O o8, Object obj, X5.n nVar) {
        o8.b(nVar, obj, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i6.F0
    public String P() {
        return Q.a(this) + " was cancelled";
    }

    @Override // i6.F0
    public final void f0(Throwable th) {
        K.a(this.f31741c, th);
    }

    @Override // P5.d
    public final P5.g getContext() {
        return this.f31741c;
    }

    @Override // i6.M
    public P5.g getCoroutineContext() {
        return this.f31741c;
    }

    @Override // i6.F0, i6.InterfaceC2855x0
    public boolean isActive() {
        return super.isActive();
    }

    @Override // i6.F0
    public String p0() {
        String b8 = H.b(this.f31741c);
        if (b8 == null) {
            return super.p0();
        }
        return '\"' + b8 + "\":" + super.p0();
    }

    @Override // P5.d
    public final void resumeWith(Object obj) {
        Object n02 = n0(AbstractC2808G.d(obj, null, 1, null));
        if (n02 == G0.f31701b) {
            return;
        }
        K0(n02);
    }

    @Override // i6.F0
    protected final void u0(Object obj) {
        if (obj instanceof C2804C) {
            C2804C c2804c = (C2804C) obj;
            L0(c2804c.f31678a, c2804c.a());
        } else {
            M0(obj);
        }
    }

    protected void M0(Object obj) {
    }

    protected void L0(Throwable th, boolean z8) {
    }
}
