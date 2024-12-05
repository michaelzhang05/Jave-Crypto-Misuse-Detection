package A3;

import A2.C0947e;
import android.content.Context;

/* loaded from: classes4.dex */
public final class N implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f288a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f289b;

    public N(L5.a aVar, L5.a aVar2) {
        this.f288a = aVar;
        this.f289b = aVar2;
    }

    public static N a(L5.a aVar, L5.a aVar2) {
        return new N(aVar, aVar2);
    }

    public static C0947e c(Context context, L5.a aVar) {
        return (C0947e) x5.h.d(M.f283a.b(context, aVar));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0947e get() {
        return c((Context) this.f288a.get(), this.f289b);
    }
}
