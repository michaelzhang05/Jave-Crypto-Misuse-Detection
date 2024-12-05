package n3;

import android.content.Context;
import f3.C2660a;

/* loaded from: classes4.dex */
public final class t implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final s f36118a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f36119b;

    public t(s sVar, I5.a aVar) {
        this.f36118a = sVar;
        this.f36119b = aVar;
    }

    public static t a(s sVar, I5.a aVar) {
        return new t(sVar, aVar);
    }

    public static C2660a c(s sVar, Context context) {
        return (C2660a) u5.h.d(sVar.a(context));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2660a get() {
        return c(this.f36118a, (Context) this.f36119b.get());
    }
}
