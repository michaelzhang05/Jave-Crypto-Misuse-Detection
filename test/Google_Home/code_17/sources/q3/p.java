package q3;

import android.content.Context;
import i3.C2978a;

/* loaded from: classes4.dex */
public final class p implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f38242a;

    public p(L5.a aVar) {
        this.f38242a = aVar;
    }

    public static p a(L5.a aVar) {
        return new p(aVar);
    }

    public static C2978a c(Context context) {
        return (C2978a) x5.h.d(o.f38238a.a(context));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2978a get() {
        return c((Context) this.f38242a.get());
    }
}
