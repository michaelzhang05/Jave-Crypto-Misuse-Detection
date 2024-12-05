package l6;

/* renamed from: l6.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3385v extends AbstractC3394z0 implements InterfaceC3383u {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3387w f34657e;

    public C3385v(InterfaceC3387w interfaceC3387w) {
        this.f34657e = interfaceC3387w;
    }

    @Override // l6.InterfaceC3383u
    public boolean b(Throwable th) {
        return s().Q(th);
    }

    @Override // l6.InterfaceC3383u
    public InterfaceC3390x0 getParent() {
        return s();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        r((Throwable) obj);
        return O5.I.f8278a;
    }

    @Override // l6.AbstractC3341E
    public void r(Throwable th) {
        this.f34657e.m(s());
    }
}
