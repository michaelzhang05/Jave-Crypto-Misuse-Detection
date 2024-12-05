package l1;

import android.content.Context;

/* loaded from: classes.dex */
public final class h implements f1.b {

    /* renamed from: a, reason: collision with root package name */
    private final y4.a f7292a;

    public h(y4.a aVar) {
        this.f7292a = aVar;
    }

    public static h a(y4.a aVar) {
        return new h(aVar);
    }

    public static String c(Context context) {
        return (String) f1.d.c(f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // y4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.f7292a.get());
    }
}
