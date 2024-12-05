package A;

import B.x;
import C.InterfaceC1010d;
import java.util.concurrent.Executor;
import v.InterfaceC4076e;
import w.InterfaceC4117b;

/* loaded from: classes3.dex */
public final class d implements InterfaceC4117b {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f59a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f60b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f61c;

    /* renamed from: d, reason: collision with root package name */
    private final L5.a f62d;

    /* renamed from: e, reason: collision with root package name */
    private final L5.a f63e;

    public d(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5) {
        this.f59a = aVar;
        this.f60b = aVar2;
        this.f61c = aVar3;
        this.f62d = aVar4;
        this.f63e = aVar5;
    }

    public static d a(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, InterfaceC4076e interfaceC4076e, x xVar, InterfaceC1010d interfaceC1010d, D.b bVar) {
        return new c(executor, interfaceC4076e, xVar, interfaceC1010d, bVar);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((Executor) this.f59a.get(), (InterfaceC4076e) this.f60b.get(), (x) this.f61c.get(), (InterfaceC1010d) this.f62d.get(), (D.b) this.f63e.get());
    }
}
