package m3;

import j2.p;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* renamed from: m3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3398c implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f34926a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f34927b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f34928c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f34929d;

    public C3398c(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4) {
        this.f34926a = aVar;
        this.f34927b = aVar2;
        this.f34928c = aVar3;
        this.f34929d = aVar4;
    }

    public static C3398c a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4) {
        return new C3398c(aVar, aVar2, aVar3, aVar4);
    }

    public static com.stripe.android.payments.core.authentication.threeds2.b c(p pVar, boolean z8, Function0 function0, Set set) {
        return new com.stripe.android.payments.core.authentication.threeds2.b(pVar, z8, function0, set);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.payments.core.authentication.threeds2.b get() {
        return c((p) this.f34926a.get(), ((Boolean) this.f34927b.get()).booleanValue(), (Function0) this.f34928c.get(), (Set) this.f34929d.get());
    }
}
