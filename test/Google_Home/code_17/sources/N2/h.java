package N2;

import Q2.a;
import com.stripe.android.link.LinkActivityContract;

/* loaded from: classes4.dex */
public final class h implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f7690a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f7691b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f7692c;

    public h(L5.a aVar, L5.a aVar2, L5.a aVar3) {
        this.f7690a = aVar;
        this.f7691b = aVar2;
        this.f7692c = aVar3;
    }

    public static h a(L5.a aVar, L5.a aVar2, L5.a aVar3) {
        return new h(aVar, aVar2, aVar3);
    }

    public static com.stripe.android.link.a c(a.InterfaceC0180a interfaceC0180a, LinkActivityContract linkActivityContract, O2.d dVar) {
        return new com.stripe.android.link.a(interfaceC0180a, linkActivityContract, dVar);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.link.a get() {
        return c((a.InterfaceC0180a) this.f7690a.get(), (LinkActivityContract) this.f7691b.get(), (O2.d) this.f7692c.get());
    }
}
