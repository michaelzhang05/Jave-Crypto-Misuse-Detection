package l1;

import android.content.Context;

/* loaded from: classes.dex */
public final class u0 implements f1.b {

    /* renamed from: a, reason: collision with root package name */
    private final y4.a f7340a;

    /* renamed from: b, reason: collision with root package name */
    private final y4.a f7341b;

    /* renamed from: c, reason: collision with root package name */
    private final y4.a f7342c;

    public u0(y4.a aVar, y4.a aVar2, y4.a aVar3) {
        this.f7340a = aVar;
        this.f7341b = aVar2;
        this.f7342c = aVar3;
    }

    public static u0 a(y4.a aVar, y4.a aVar2, y4.a aVar3) {
        return new u0(aVar, aVar2, aVar3);
    }

    public static t0 c(Context context, String str, int i6) {
        return new t0(context, str, i6);
    }

    @Override // y4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t0 get() {
        return c((Context) this.f7340a.get(), (String) this.f7341b.get(), ((Integer) this.f7342c.get()).intValue());
    }
}
