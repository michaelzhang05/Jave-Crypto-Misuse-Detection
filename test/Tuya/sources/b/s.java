package B;

import C.InterfaceC1069c;
import C.InterfaceC1070d;
import android.content.Context;
import java.util.concurrent.Executor;
import w.InterfaceC3836b;

/* loaded from: classes3.dex */
public final class s implements InterfaceC3836b {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f571a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f572b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f573c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f574d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.a f575e;

    /* renamed from: f, reason: collision with root package name */
    private final I5.a f576f;

    /* renamed from: g, reason: collision with root package name */
    private final I5.a f577g;

    /* renamed from: h, reason: collision with root package name */
    private final I5.a f578h;

    /* renamed from: i, reason: collision with root package name */
    private final I5.a f579i;

    public s(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6, I5.a aVar7, I5.a aVar8, I5.a aVar9) {
        this.f571a = aVar;
        this.f572b = aVar2;
        this.f573c = aVar3;
        this.f574d = aVar4;
        this.f575e = aVar5;
        this.f576f = aVar6;
        this.f577g = aVar7;
        this.f578h = aVar8;
        this.f579i = aVar9;
    }

    public static s a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6, I5.a aVar7, I5.a aVar8, I5.a aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, v.e eVar, InterfaceC1070d interfaceC1070d, x xVar, Executor executor, D.b bVar, E.a aVar, E.a aVar2, InterfaceC1069c interfaceC1069c) {
        return new r(context, eVar, interfaceC1070d, xVar, executor, bVar, aVar, aVar2, interfaceC1069c);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.f571a.get(), (v.e) this.f572b.get(), (InterfaceC1070d) this.f573c.get(), (x) this.f574d.get(), (Executor) this.f575e.get(), (D.b) this.f576f.get(), (E.a) this.f577g.get(), (E.a) this.f578h.get(), (InterfaceC1069c) this.f579i.get());
    }
}
