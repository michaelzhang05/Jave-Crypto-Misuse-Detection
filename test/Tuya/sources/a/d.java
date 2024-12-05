package A;

import B.x;
import C.InterfaceC1070d;
import java.util.concurrent.Executor;
import w.InterfaceC3836b;

/* loaded from: classes3.dex */
public final class d implements InterfaceC3836b {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f59a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f60b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f61c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f62d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.a f63e;

    public d(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5) {
        this.f59a = aVar;
        this.f60b = aVar2;
        this.f61c = aVar3;
        this.f62d = aVar4;
        this.f63e = aVar5;
    }

    public static d a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, v.e eVar, x xVar, InterfaceC1070d interfaceC1070d, D.b bVar) {
        return new c(executor, eVar, xVar, interfaceC1070d, bVar);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((Executor) this.f59a.get(), (v.e) this.f60b.get(), (x) this.f61c.get(), (InterfaceC1070d) this.f62d.get(), (D.b) this.f63e.get());
    }
}
