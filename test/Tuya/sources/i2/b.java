package I2;

import android.content.Context;

/* loaded from: classes4.dex */
public final class b implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f3908a;

    public b(I5.a aVar) {
        this.f3908a = aVar;
    }

    public static b a(I5.a aVar) {
        return new b(aVar);
    }

    public static a c(Context context) {
        return new a(context);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c((Context) this.f3908a.get());
    }
}
