package x3;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* renamed from: x3.U, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3898U implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f39300a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f39301b;

    public C3898U(I5.a aVar, I5.a aVar2) {
        this.f39300a = aVar;
        this.f39301b = aVar2;
    }

    public static C3898U a(I5.a aVar, I5.a aVar2) {
        return new C3898U(aVar, aVar2);
    }

    public static Function1 c(Context context, P5.g gVar) {
        return (Function1) u5.h.d(AbstractC3891M.f39288a.i(context, gVar));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Function1 get() {
        return c((Context) this.f39300a.get(), (P5.g) this.f39301b.get());
    }
}
