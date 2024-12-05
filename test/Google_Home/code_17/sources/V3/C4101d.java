package v3;

import A2.C0947e;
import A2.InterfaceC0945c;
import S5.g;
import x5.e;

/* renamed from: v3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4101d implements e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f40134a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f40135b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f40136c;

    public C4101d(L5.a aVar, L5.a aVar2, L5.a aVar3) {
        this.f40134a = aVar;
        this.f40135b = aVar2;
        this.f40136c = aVar3;
    }

    public static C4101d a(L5.a aVar, L5.a aVar2, L5.a aVar3) {
        return new C4101d(aVar, aVar2, aVar3);
    }

    public static C4100c c(InterfaceC0945c interfaceC0945c, C0947e c0947e, g gVar) {
        return new C4100c(interfaceC0945c, c0947e, gVar);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4100c get() {
        return c((InterfaceC0945c) this.f40134a.get(), (C0947e) this.f40135b.get(), (g) this.f40136c.get());
    }
}
