package n3;

import A2.C0947e;
import A2.InterfaceC0945c;

/* loaded from: classes4.dex */
public final class k implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f35442a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f35443b;

    public k(L5.a aVar, L5.a aVar2) {
        this.f35442a = aVar;
        this.f35443b = aVar2;
    }

    public static k a(L5.a aVar, L5.a aVar2) {
        return new k(aVar, aVar2);
    }

    public static j c(InterfaceC0945c interfaceC0945c, C0947e c0947e) {
        return new j(interfaceC0945c, c0947e);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c((InterfaceC0945c) this.f35442a.get(), (C0947e) this.f35443b.get());
    }
}
