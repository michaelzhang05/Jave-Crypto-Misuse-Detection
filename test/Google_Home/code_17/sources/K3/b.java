package K3;

import h3.m;
import java.util.Set;
import n3.i;
import u2.InterfaceC4057d;

/* loaded from: classes4.dex */
public final class b implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f5093a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f5094b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f5095c;

    /* renamed from: d, reason: collision with root package name */
    private final L5.a f5096d;

    /* renamed from: e, reason: collision with root package name */
    private final L5.a f5097e;

    /* renamed from: f, reason: collision with root package name */
    private final L5.a f5098f;

    public b(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5, L5.a aVar6) {
        this.f5093a = aVar;
        this.f5094b = aVar2;
        this.f5095c = aVar3;
        this.f5096d = aVar4;
        this.f5097e = aVar5;
        this.f5098f = aVar6;
    }

    public static b a(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5, L5.a aVar6) {
        return new b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static a c(m mVar, L5.a aVar, InterfaceC4057d interfaceC4057d, i iVar, S5.g gVar, Set set) {
        return new a(mVar, aVar, interfaceC4057d, iVar, gVar, set);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c((m) this.f5093a.get(), this.f5094b, (InterfaceC4057d) this.f5095c.get(), (i) this.f5096d.get(), (S5.g) this.f5097e.get(), (Set) this.f5098f.get());
    }
}
