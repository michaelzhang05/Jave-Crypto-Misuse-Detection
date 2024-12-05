package B;

import C.InterfaceC1070d;
import java.util.concurrent.Executor;
import w.InterfaceC3836b;

/* loaded from: classes3.dex */
public final class w implements InterfaceC3836b {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f586a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f587b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f588c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f589d;

    public w(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4) {
        this.f586a = aVar;
        this.f587b = aVar2;
        this.f588c = aVar3;
        this.f589d = aVar4;
    }

    public static w a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, InterfaceC1070d interfaceC1070d, x xVar, D.b bVar) {
        return new v(executor, interfaceC1070d, xVar, bVar);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Executor) this.f586a.get(), (InterfaceC1070d) this.f587b.get(), (x) this.f588c.get(), (D.b) this.f589d.get());
    }
}
