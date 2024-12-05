package A3;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class U implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f295a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f296b;

    public U(L5.a aVar, L5.a aVar2) {
        this.f295a = aVar;
        this.f296b = aVar2;
    }

    public static U a(L5.a aVar, L5.a aVar2) {
        return new U(aVar, aVar2);
    }

    public static Function1 c(Context context, S5.g gVar) {
        return (Function1) x5.h.d(M.f283a.i(context, gVar));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Function1 get() {
        return c((Context) this.f295a.get(), (S5.g) this.f296b.get());
    }
}
