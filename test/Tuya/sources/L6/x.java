package l6;

import i6.InterfaceC2855x0;
import k6.EnumC3132a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class x implements InterfaceC3349K, InterfaceC3358f, m6.p {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2855x0 f34800a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ InterfaceC3349K f34801b;

    public x(InterfaceC3349K interfaceC3349K, InterfaceC2855x0 interfaceC2855x0) {
        this.f34800a = interfaceC2855x0;
        this.f34801b = interfaceC3349K;
    }

    @Override // m6.p
    public InterfaceC3358f b(P5.g gVar, int i8, EnumC3132a enumC3132a) {
        return AbstractC3351M.d(this, gVar, i8, enumC3132a);
    }

    @Override // l6.z, l6.InterfaceC3358f
    public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
        return this.f34801b.collect(interfaceC3359g, dVar);
    }

    @Override // l6.InterfaceC3349K
    public Object getValue() {
        return this.f34801b.getValue();
    }
}
