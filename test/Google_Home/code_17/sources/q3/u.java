package q3;

import android.content.Context;

/* loaded from: classes4.dex */
public final class u implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final s f38248a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f38249b;

    public u(s sVar, L5.a aVar) {
        this.f38248a = sVar;
        this.f38249b = aVar;
    }

    public static u a(s sVar, L5.a aVar) {
        return new u(sVar, aVar);
    }

    public static boolean c(s sVar, Context context) {
        return sVar.b(context);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(c(this.f38248a, (Context) this.f38249b.get()));
    }
}
