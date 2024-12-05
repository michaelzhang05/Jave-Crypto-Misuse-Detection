package j1;

import java.util.concurrent.Executor;
import k1.x;

/* loaded from: classes.dex */
public final class d implements f1.b {

    /* renamed from: a, reason: collision with root package name */
    private final y4.a f7069a;

    /* renamed from: b, reason: collision with root package name */
    private final y4.a f7070b;

    /* renamed from: c, reason: collision with root package name */
    private final y4.a f7071c;

    /* renamed from: d, reason: collision with root package name */
    private final y4.a f7072d;

    /* renamed from: e, reason: collision with root package name */
    private final y4.a f7073e;

    public d(y4.a aVar, y4.a aVar2, y4.a aVar3, y4.a aVar4, y4.a aVar5) {
        this.f7069a = aVar;
        this.f7070b = aVar2;
        this.f7071c = aVar3;
        this.f7072d = aVar4;
        this.f7073e = aVar5;
    }

    public static d a(y4.a aVar, y4.a aVar2, y4.a aVar3, y4.a aVar4, y4.a aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, e1.e eVar, x xVar, l1.d dVar, m1.b bVar) {
        return new c(executor, eVar, xVar, dVar, bVar);
    }

    @Override // y4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((Executor) this.f7069a.get(), (e1.e) this.f7070b.get(), (x) this.f7071c.get(), (l1.d) this.f7072d.get(), (m1.b) this.f7073e.get());
    }
}
