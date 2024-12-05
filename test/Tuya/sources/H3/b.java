package H3;

import e3.m;
import java.util.Set;
import k3.i;
import r2.InterfaceC3684d;

/* loaded from: classes4.dex */
public final class b implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f3490a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f3491b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f3492c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f3493d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.a f3494e;

    /* renamed from: f, reason: collision with root package name */
    private final I5.a f3495f;

    public b(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6) {
        this.f3490a = aVar;
        this.f3491b = aVar2;
        this.f3492c = aVar3;
        this.f3493d = aVar4;
        this.f3494e = aVar5;
        this.f3495f = aVar6;
    }

    public static b a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6) {
        return new b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static a c(m mVar, I5.a aVar, InterfaceC3684d interfaceC3684d, i iVar, P5.g gVar, Set set) {
        return new a(mVar, aVar, interfaceC3684d, iVar, gVar, set);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c((m) this.f3490a.get(), this.f3491b, (InterfaceC3684d) this.f3492c.get(), (i) this.f3493d.get(), (P5.g) this.f3494e.get(), (Set) this.f3495f.get());
    }
}
