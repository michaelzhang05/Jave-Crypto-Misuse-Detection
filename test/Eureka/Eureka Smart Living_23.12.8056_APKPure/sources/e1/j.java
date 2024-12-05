package e1;

import android.content.Context;

/* loaded from: classes.dex */
public final class j implements f1.b {

    /* renamed from: a, reason: collision with root package name */
    private final y4.a f6506a;

    /* renamed from: b, reason: collision with root package name */
    private final y4.a f6507b;

    /* renamed from: c, reason: collision with root package name */
    private final y4.a f6508c;

    public j(y4.a aVar, y4.a aVar2, y4.a aVar3) {
        this.f6506a = aVar;
        this.f6507b = aVar2;
        this.f6508c = aVar3;
    }

    public static j a(y4.a aVar, y4.a aVar2, y4.a aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, n1.a aVar, n1.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // y4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Context) this.f6506a.get(), (n1.a) this.f6507b.get(), (n1.a) this.f6508c.get());
    }
}
