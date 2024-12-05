package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3005x0 implements K3 {

    /* renamed from: a, reason: collision with root package name */
    final EnumC3001w0 f32648a;

    /* renamed from: b, reason: collision with root package name */
    final Supplier f32649b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3005x0(EnumC2921f3 enumC2921f3, EnumC3001w0 enumC3001w0, Supplier supplier) {
        this.f32648a = enumC3001w0;
        this.f32649b = supplier;
    }

    @Override // j$.util.stream.K3
    public final Object b(AbstractC2897b abstractC2897b, Spliterator spliterator) {
        AbstractC2997v0 abstractC2997v0 = (AbstractC2997v0) this.f32649b.get();
        abstractC2897b.R(spliterator, abstractC2997v0);
        return Boolean.valueOf(abstractC2997v0.f32634b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.K3
    public final Object c(AbstractC2897b abstractC2897b, Spliterator spliterator) {
        return (Boolean) new C3009y0(this, abstractC2897b, spliterator).invoke();
    }

    @Override // j$.util.stream.K3
    public final int d() {
        return EnumC2916e3.f32530u | EnumC2916e3.f32527r;
    }
}
