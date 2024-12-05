package k1;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class s implements f1.b {

    /* renamed from: a, reason: collision with root package name */
    private final y4.a f7149a;

    /* renamed from: b, reason: collision with root package name */
    private final y4.a f7150b;

    /* renamed from: c, reason: collision with root package name */
    private final y4.a f7151c;

    /* renamed from: d, reason: collision with root package name */
    private final y4.a f7152d;

    /* renamed from: e, reason: collision with root package name */
    private final y4.a f7153e;

    /* renamed from: f, reason: collision with root package name */
    private final y4.a f7154f;

    /* renamed from: g, reason: collision with root package name */
    private final y4.a f7155g;

    /* renamed from: h, reason: collision with root package name */
    private final y4.a f7156h;

    /* renamed from: i, reason: collision with root package name */
    private final y4.a f7157i;

    public s(y4.a aVar, y4.a aVar2, y4.a aVar3, y4.a aVar4, y4.a aVar5, y4.a aVar6, y4.a aVar7, y4.a aVar8, y4.a aVar9) {
        this.f7149a = aVar;
        this.f7150b = aVar2;
        this.f7151c = aVar3;
        this.f7152d = aVar4;
        this.f7153e = aVar5;
        this.f7154f = aVar6;
        this.f7155g = aVar7;
        this.f7156h = aVar8;
        this.f7157i = aVar9;
    }

    public static s a(y4.a aVar, y4.a aVar2, y4.a aVar3, y4.a aVar4, y4.a aVar5, y4.a aVar6, y4.a aVar7, y4.a aVar8, y4.a aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, e1.e eVar, l1.d dVar, x xVar, Executor executor, m1.b bVar, n1.a aVar, n1.a aVar2, l1.c cVar) {
        return new r(context, eVar, dVar, xVar, executor, bVar, aVar, aVar2, cVar);
    }

    @Override // y4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.f7149a.get(), (e1.e) this.f7150b.get(), (l1.d) this.f7151c.get(), (x) this.f7152d.get(), (Executor) this.f7153e.get(), (m1.b) this.f7154f.get(), (n1.a) this.f7155g.get(), (n1.a) this.f7156h.get(), (l1.c) this.f7157i.get());
    }
}
