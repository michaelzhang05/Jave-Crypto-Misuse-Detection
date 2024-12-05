package o6;

import l6.InterfaceC3390x0;
import n6.EnumC3487a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class y implements InterfaceC3698L, InterfaceC3706f, p6.p {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3390x0 f36817a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ InterfaceC3698L f36818b;

    public y(InterfaceC3698L interfaceC3698L, InterfaceC3390x0 interfaceC3390x0) {
        this.f36817a = interfaceC3390x0;
        this.f36818b = interfaceC3698L;
    }

    @Override // p6.p
    public InterfaceC3706f a(S5.g gVar, int i8, EnumC3487a enumC3487a) {
        return AbstractC3700N.d(this, gVar, i8, enumC3487a);
    }

    @Override // o6.InterfaceC3687A, o6.InterfaceC3706f
    public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
        return this.f36818b.collect(interfaceC3707g, dVar);
    }

    @Override // o6.InterfaceC3698L
    public Object getValue() {
        return this.f36818b.getValue();
    }
}
