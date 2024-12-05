package t3;

import com.stripe.android.paymentsheet.C2626a;
import kotlin.jvm.functions.Function0;

/* renamed from: t3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4029c implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f39634a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f39635b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f39636c;

    /* renamed from: d, reason: collision with root package name */
    private final L5.a f39637d;

    public C4029c(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4) {
        this.f39634a = aVar;
        this.f39635b = aVar2;
        this.f39636c = aVar3;
        this.f39637d = aVar4;
    }

    public static C4029c a(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4) {
        return new C4029c(aVar, aVar2, aVar3, aVar4);
    }

    public static C2626a c(h3.m mVar, boolean z8, Function0 function0, Function0 function02) {
        return new C2626a(mVar, z8, function0, function02);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2626a get() {
        return c((h3.m) this.f39634a.get(), ((Boolean) this.f39635b.get()).booleanValue(), (Function0) this.f39636c.get(), (Function0) this.f39637d.get());
    }
}
