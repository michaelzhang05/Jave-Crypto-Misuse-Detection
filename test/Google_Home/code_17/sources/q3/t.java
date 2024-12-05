package q3;

import android.content.Context;
import i3.C2978a;

/* loaded from: classes4.dex */
public final class t implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final s f38246a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f38247b;

    public t(s sVar, L5.a aVar) {
        this.f38246a = sVar;
        this.f38247b = aVar;
    }

    public static t a(s sVar, L5.a aVar) {
        return new t(sVar, aVar);
    }

    public static C2978a c(s sVar, Context context) {
        return (C2978a) x5.h.d(sVar.a(context));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2978a get() {
        return c(this.f38246a, (Context) this.f38247b.get());
    }
}
