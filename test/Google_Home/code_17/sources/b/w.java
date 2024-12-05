package B;

import C.InterfaceC1010d;
import java.util.concurrent.Executor;
import w.InterfaceC4117b;

/* loaded from: classes3.dex */
public final class w implements InterfaceC4117b {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f711a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f712b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f713c;

    /* renamed from: d, reason: collision with root package name */
    private final L5.a f714d;

    public w(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4) {
        this.f711a = aVar;
        this.f712b = aVar2;
        this.f713c = aVar3;
        this.f714d = aVar4;
    }

    public static w a(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, InterfaceC1010d interfaceC1010d, x xVar, D.b bVar) {
        return new v(executor, interfaceC1010d, xVar, bVar);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Executor) this.f711a.get(), (InterfaceC1010d) this.f712b.get(), (x) this.f713c.get(), (D.b) this.f714d.get());
    }
}
