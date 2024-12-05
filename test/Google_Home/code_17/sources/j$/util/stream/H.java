package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class H implements K3 {

    /* renamed from: a, reason: collision with root package name */
    final int f33510a;

    /* renamed from: b, reason: collision with root package name */
    final Object f33511b;

    /* renamed from: c, reason: collision with root package name */
    final Predicate f33512c;

    /* renamed from: d, reason: collision with root package name */
    final Supplier f33513d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H(boolean z8, EnumC3071f3 enumC3071f3, Object obj, Predicate predicate, Supplier supplier) {
        this.f33510a = (z8 ? 0 : EnumC3066e3.f33721r) | EnumC3066e3.f33724u;
        this.f33511b = obj;
        this.f33512c = predicate;
        this.f33513d = supplier;
    }

    @Override // j$.util.stream.K3
    public final Object b(AbstractC3047b abstractC3047b, Spliterator spliterator) {
        L3 l32 = (L3) this.f33513d.get();
        abstractC3047b.R(spliterator, l32);
        Object obj = l32.get();
        return obj != null ? obj : this.f33511b;
    }

    @Override // j$.util.stream.K3
    public final Object c(AbstractC3047b abstractC3047b, Spliterator spliterator) {
        return new N(this, EnumC3066e3.ORDERED.r(abstractC3047b.G()), abstractC3047b, spliterator).invoke();
    }

    @Override // j$.util.stream.K3
    public final int d() {
        return this.f33510a;
    }
}
