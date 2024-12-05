package p3;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import m2.p;

/* renamed from: p3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3741c implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f36952a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f36953b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f36954c;

    /* renamed from: d, reason: collision with root package name */
    private final L5.a f36955d;

    public C3741c(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4) {
        this.f36952a = aVar;
        this.f36953b = aVar2;
        this.f36954c = aVar3;
        this.f36955d = aVar4;
    }

    public static C3741c a(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4) {
        return new C3741c(aVar, aVar2, aVar3, aVar4);
    }

    public static com.stripe.android.payments.core.authentication.threeds2.b c(p pVar, boolean z8, Function0 function0, Set set) {
        return new com.stripe.android.payments.core.authentication.threeds2.b(pVar, z8, function0, set);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.payments.core.authentication.threeds2.b get() {
        return c((p) this.f36952a.get(), ((Boolean) this.f36953b.get()).booleanValue(), (Function0) this.f36954c.get(), (Set) this.f36955d.get());
    }
}
