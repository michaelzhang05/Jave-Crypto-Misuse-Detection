package o3;

import android.content.Context;

/* renamed from: o3.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3535q implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f35947a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f35948b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f35949c;

    public C3535q(L5.a aVar, L5.a aVar2, L5.a aVar3) {
        this.f35947a = aVar;
        this.f35948b = aVar2;
        this.f35949c = aVar3;
    }

    public static C3535q a(L5.a aVar, L5.a aVar2, L5.a aVar3) {
        return new C3535q(aVar, aVar2, aVar3);
    }

    public static C3534p c(C3537s c3537s, C3522d c3522d, Context context) {
        return new C3534p(c3537s, c3522d, context);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3534p get() {
        return c((C3537s) this.f35947a.get(), (C3522d) this.f35948b.get(), (Context) this.f35949c.get());
    }
}
