package F2;

import A2.C0947e;
import A2.InterfaceC0945c;
import S5.g;
import x5.e;

/* loaded from: classes4.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f2749a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f2750b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f2751c;

    public d(L5.a aVar, L5.a aVar2, L5.a aVar3) {
        this.f2749a = aVar;
        this.f2750b = aVar2;
        this.f2751c = aVar3;
    }

    public static d a(L5.a aVar, L5.a aVar2, L5.a aVar3) {
        return new d(aVar, aVar2, aVar3);
    }

    public static c c(InterfaceC0945c interfaceC0945c, C0947e c0947e, g gVar) {
        return new c(interfaceC0945c, c0947e, gVar);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((InterfaceC0945c) this.f2749a.get(), (C0947e) this.f2750b.get(), (g) this.f2751c.get());
    }
}
