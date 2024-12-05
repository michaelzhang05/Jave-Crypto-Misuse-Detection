package x3;

import android.content.Context;

/* renamed from: x3.T, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3897T implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f39299a;

    public C3897T(I5.a aVar) {
        this.f39299a = aVar;
    }

    public static C3897T a(I5.a aVar) {
        return new C3897T(aVar);
    }

    public static j2.r c(Context context) {
        return (j2.r) u5.h.d(AbstractC3891M.f39288a.h(context));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j2.r get() {
        return c((Context) this.f39299a.get());
    }
}
