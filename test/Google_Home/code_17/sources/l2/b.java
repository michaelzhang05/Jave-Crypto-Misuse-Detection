package L2;

import android.content.Context;

/* loaded from: classes4.dex */
public final class b implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f5903a;

    public b(L5.a aVar) {
        this.f5903a = aVar;
    }

    public static b a(L5.a aVar) {
        return new b(aVar);
    }

    public static a c(Context context) {
        return new a(context);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c((Context) this.f5903a.get());
    }
}
