package q3;

import android.content.Context;

/* loaded from: classes4.dex */
public final class D implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f38127a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f38128b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f38129c;

    public D(L5.a aVar, L5.a aVar2, L5.a aVar3) {
        this.f38127a = aVar;
        this.f38128b = aVar2;
        this.f38129c = aVar3;
    }

    public static D a(L5.a aVar, L5.a aVar2, L5.a aVar3) {
        return new D(aVar, aVar2, aVar3);
    }

    public static Z3.a c(Context context, boolean z8, S5.g gVar) {
        return (Z3.a) x5.h.d(AbstractC3832B.f38125a.b(context, z8, gVar));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Z3.a get() {
        return c((Context) this.f38127a.get(), ((Boolean) this.f38128b.get()).booleanValue(), (S5.g) this.f38129c.get());
    }
}
