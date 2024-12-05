package C2;

import P5.g;
import u5.e;
import x2.C3875e;
import x2.InterfaceC3873c;

/* loaded from: classes4.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f1239a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f1240b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f1241c;

    public d(I5.a aVar, I5.a aVar2, I5.a aVar3) {
        this.f1239a = aVar;
        this.f1240b = aVar2;
        this.f1241c = aVar3;
    }

    public static d a(I5.a aVar, I5.a aVar2, I5.a aVar3) {
        return new d(aVar, aVar2, aVar3);
    }

    public static c c(InterfaceC3873c interfaceC3873c, C3875e c3875e, g gVar) {
        return new c(interfaceC3873c, c3875e, gVar);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((InterfaceC3873c) this.f1239a.get(), (C3875e) this.f1240b.get(), (g) this.f1241c.get());
    }
}
