package s3;

import P5.g;
import u5.e;
import x2.C3875e;
import x2.InterfaceC3873c;

/* renamed from: s3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3748d implements e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f37861a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f37862b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f37863c;

    public C3748d(I5.a aVar, I5.a aVar2, I5.a aVar3) {
        this.f37861a = aVar;
        this.f37862b = aVar2;
        this.f37863c = aVar3;
    }

    public static C3748d a(I5.a aVar, I5.a aVar2, I5.a aVar3) {
        return new C3748d(aVar, aVar2, aVar3);
    }

    public static C3747c c(InterfaceC3873c interfaceC3873c, C3875e c3875e, g gVar) {
        return new C3747c(interfaceC3873c, c3875e, gVar);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3747c get() {
        return c((InterfaceC3873c) this.f37861a.get(), (C3875e) this.f37862b.get(), (g) this.f37863c.get());
    }
}
