package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class H implements K3 {

    /* renamed from: a, reason: collision with root package name */
    final int f32316a;

    /* renamed from: b, reason: collision with root package name */
    final Object f32317b;

    /* renamed from: c, reason: collision with root package name */
    final Predicate f32318c;

    /* renamed from: d, reason: collision with root package name */
    final Supplier f32319d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H(boolean z8, EnumC2921f3 enumC2921f3, Object obj, Predicate predicate, Supplier supplier) {
        this.f32316a = (z8 ? 0 : EnumC2916e3.f32527r) | EnumC2916e3.f32530u;
        this.f32317b = obj;
        this.f32318c = predicate;
        this.f32319d = supplier;
    }

    @Override // j$.util.stream.K3
    public final Object b(AbstractC2897b abstractC2897b, Spliterator spliterator) {
        L3 l32 = (L3) this.f32319d.get();
        abstractC2897b.R(spliterator, l32);
        Object obj = l32.get();
        return obj != null ? obj : this.f32317b;
    }

    @Override // j$.util.stream.K3
    public final Object c(AbstractC2897b abstractC2897b, Spliterator spliterator) {
        return new N(this, EnumC2916e3.ORDERED.r(abstractC2897b.G()), abstractC2897b, spliterator).invoke();
    }

    @Override // j$.util.stream.K3
    public final int d() {
        return this.f32316a;
    }
}
