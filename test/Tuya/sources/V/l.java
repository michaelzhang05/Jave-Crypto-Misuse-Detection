package v;

import android.content.Context;
import w.InterfaceC3836b;

/* loaded from: classes3.dex */
public final class l implements InterfaceC3836b {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f38605a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f38606b;

    public l(I5.a aVar, I5.a aVar2) {
        this.f38605a = aVar;
        this.f38606b = aVar2;
    }

    public static l a(I5.a aVar, I5.a aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c((Context) this.f38605a.get(), this.f38606b.get());
    }
}
