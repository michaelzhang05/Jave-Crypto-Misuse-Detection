package A;

import B.x;
import C.InterfaceC1070d;
import android.content.Context;
import w.AbstractC3838d;
import w.InterfaceC3836b;

/* loaded from: classes3.dex */
public final class i implements InterfaceC3836b {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f65a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f66b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f67c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f68d;

    public i(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4) {
        this.f65a = aVar;
        this.f66b = aVar2;
        this.f67c = aVar3;
        this.f68d = aVar4;
    }

    public static i a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static x c(Context context, InterfaceC1070d interfaceC1070d, B.f fVar, E.a aVar) {
        return (x) AbstractC3838d.c(h.a(context, interfaceC1070d, fVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c((Context) this.f65a.get(), (InterfaceC1070d) this.f66b.get(), (B.f) this.f67c.get(), (E.a) this.f68d.get());
    }
}
