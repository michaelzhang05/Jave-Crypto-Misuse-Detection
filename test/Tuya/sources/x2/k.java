package x2;

import kotlin.jvm.functions.Function0;
import x2.j;

/* loaded from: classes4.dex */
public final class k implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f39199a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f39200b;

    public k(I5.a aVar, I5.a aVar2) {
        this.f39199a = aVar;
        this.f39200b = aVar2;
    }

    public static k a(I5.a aVar, I5.a aVar2) {
        return new k(aVar, aVar2);
    }

    public static j.c c(Function0 function0, Function0 function02) {
        return new j.c(function0, function02);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j.c get() {
        return c((Function0) this.f39199a.get(), (Function0) this.f39200b.get());
    }
}
