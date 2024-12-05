package e1;

import android.content.Context;

/* loaded from: classes.dex */
public final class l implements f1.b {

    /* renamed from: a, reason: collision with root package name */
    private final y4.a f6514a;

    /* renamed from: b, reason: collision with root package name */
    private final y4.a f6515b;

    public l(y4.a aVar, y4.a aVar2) {
        this.f6514a = aVar;
        this.f6515b = aVar2;
    }

    public static l a(y4.a aVar, y4.a aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // y4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c((Context) this.f6514a.get(), this.f6515b.get());
    }
}
