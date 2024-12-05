package j1;

import android.content.Context;
import k1.x;

/* loaded from: classes.dex */
public final class i implements f1.b {

    /* renamed from: a, reason: collision with root package name */
    private final y4.a f7075a;

    /* renamed from: b, reason: collision with root package name */
    private final y4.a f7076b;

    /* renamed from: c, reason: collision with root package name */
    private final y4.a f7077c;

    /* renamed from: d, reason: collision with root package name */
    private final y4.a f7078d;

    public i(y4.a aVar, y4.a aVar2, y4.a aVar3, y4.a aVar4) {
        this.f7075a = aVar;
        this.f7076b = aVar2;
        this.f7077c = aVar3;
        this.f7078d = aVar4;
    }

    public static i a(y4.a aVar, y4.a aVar2, y4.a aVar3, y4.a aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static x c(Context context, l1.d dVar, k1.f fVar, n1.a aVar) {
        return (x) f1.d.c(h.a(context, dVar, fVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // y4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c((Context) this.f7075a.get(), (l1.d) this.f7076b.get(), (k1.f) this.f7077c.get(), (n1.a) this.f7078d.get());
    }
}
