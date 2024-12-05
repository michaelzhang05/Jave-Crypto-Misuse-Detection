package A2;

import A2.j;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class k implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f194a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f195b;

    public k(L5.a aVar, L5.a aVar2) {
        this.f194a = aVar;
        this.f195b = aVar2;
    }

    public static k a(L5.a aVar, L5.a aVar2) {
        return new k(aVar, aVar2);
    }

    public static j.c c(Function0 function0, Function0 function02) {
        return new j.c(function0, function02);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j.c get() {
        return c((Function0) this.f194a.get(), (Function0) this.f195b.get());
    }
}
