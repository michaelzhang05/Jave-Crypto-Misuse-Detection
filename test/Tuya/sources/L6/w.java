package l6;

import i6.InterfaceC2855x0;
import k6.EnumC3132a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class w implements z, InterfaceC3358f, m6.p {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2855x0 f34798a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ z f34799b;

    public w(z zVar, InterfaceC2855x0 interfaceC2855x0) {
        this.f34798a = interfaceC2855x0;
        this.f34799b = zVar;
    }

    @Override // m6.p
    public InterfaceC3358f b(P5.g gVar, int i8, EnumC3132a enumC3132a) {
        return AbstractC3340B.e(this, gVar, i8, enumC3132a);
    }

    @Override // l6.z, l6.InterfaceC3358f
    public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
        return this.f34799b.collect(interfaceC3359g, dVar);
    }
}
