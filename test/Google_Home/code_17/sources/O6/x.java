package o6;

import l6.InterfaceC3390x0;
import n6.EnumC3487a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class x implements InterfaceC3687A, InterfaceC3706f, p6.p {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3390x0 f36815a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ InterfaceC3687A f36816b;

    public x(InterfaceC3687A interfaceC3687A, InterfaceC3390x0 interfaceC3390x0) {
        this.f36815a = interfaceC3390x0;
        this.f36816b = interfaceC3687A;
    }

    @Override // p6.p
    public InterfaceC3706f a(S5.g gVar, int i8, EnumC3487a enumC3487a) {
        return AbstractC3689C.e(this, gVar, i8, enumC3487a);
    }

    @Override // o6.InterfaceC3687A, o6.InterfaceC3706f
    public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
        return this.f36816b.collect(interfaceC3707g, dVar);
    }
}
