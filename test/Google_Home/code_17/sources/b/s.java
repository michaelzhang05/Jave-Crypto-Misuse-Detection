package B;

import C.InterfaceC1009c;
import C.InterfaceC1010d;
import android.content.Context;
import java.util.concurrent.Executor;
import v.InterfaceC4076e;
import w.InterfaceC4117b;

/* loaded from: classes3.dex */
public final class s implements InterfaceC4117b {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f696a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f697b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f698c;

    /* renamed from: d, reason: collision with root package name */
    private final L5.a f699d;

    /* renamed from: e, reason: collision with root package name */
    private final L5.a f700e;

    /* renamed from: f, reason: collision with root package name */
    private final L5.a f701f;

    /* renamed from: g, reason: collision with root package name */
    private final L5.a f702g;

    /* renamed from: h, reason: collision with root package name */
    private final L5.a f703h;

    /* renamed from: i, reason: collision with root package name */
    private final L5.a f704i;

    public s(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5, L5.a aVar6, L5.a aVar7, L5.a aVar8, L5.a aVar9) {
        this.f696a = aVar;
        this.f697b = aVar2;
        this.f698c = aVar3;
        this.f699d = aVar4;
        this.f700e = aVar5;
        this.f701f = aVar6;
        this.f702g = aVar7;
        this.f703h = aVar8;
        this.f704i = aVar9;
    }

    public static s a(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5, L5.a aVar6, L5.a aVar7, L5.a aVar8, L5.a aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, InterfaceC4076e interfaceC4076e, InterfaceC1010d interfaceC1010d, x xVar, Executor executor, D.b bVar, E.a aVar, E.a aVar2, InterfaceC1009c interfaceC1009c) {
        return new r(context, interfaceC4076e, interfaceC1010d, xVar, executor, bVar, aVar, aVar2, interfaceC1009c);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.f696a.get(), (InterfaceC4076e) this.f697b.get(), (InterfaceC1010d) this.f698c.get(), (x) this.f699d.get(), (Executor) this.f700e.get(), (D.b) this.f701f.get(), (E.a) this.f702g.get(), (E.a) this.f703h.get(), (InterfaceC1009c) this.f704i.get());
    }
}
