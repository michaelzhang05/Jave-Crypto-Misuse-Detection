package k1;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class w implements f1.b {

    /* renamed from: a, reason: collision with root package name */
    private final y4.a f7164a;

    /* renamed from: b, reason: collision with root package name */
    private final y4.a f7165b;

    /* renamed from: c, reason: collision with root package name */
    private final y4.a f7166c;

    /* renamed from: d, reason: collision with root package name */
    private final y4.a f7167d;

    public w(y4.a aVar, y4.a aVar2, y4.a aVar3, y4.a aVar4) {
        this.f7164a = aVar;
        this.f7165b = aVar2;
        this.f7166c = aVar3;
        this.f7167d = aVar4;
    }

    public static w a(y4.a aVar, y4.a aVar2, y4.a aVar3, y4.a aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, l1.d dVar, x xVar, m1.b bVar) {
        return new v(executor, dVar, xVar, bVar);
    }

    @Override // y4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Executor) this.f7164a.get(), (l1.d) this.f7165b.get(), (x) this.f7166c.get(), (m1.b) this.f7167d.get());
    }
}
