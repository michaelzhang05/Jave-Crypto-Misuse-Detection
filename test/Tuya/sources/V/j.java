package v;

import android.content.Context;
import w.InterfaceC3836b;

/* loaded from: classes3.dex */
public final class j implements InterfaceC3836b {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f38597a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f38598b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f38599c;

    public j(I5.a aVar, I5.a aVar2, I5.a aVar3) {
        this.f38597a = aVar;
        this.f38598b = aVar2;
        this.f38599c = aVar3;
    }

    public static j a(I5.a aVar, I5.a aVar2, I5.a aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, E.a aVar, E.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Context) this.f38597a.get(), (E.a) this.f38598b.get(), (E.a) this.f38599c.get());
    }
}
