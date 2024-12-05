package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3155x0 implements K3 {

    /* renamed from: a, reason: collision with root package name */
    final EnumC3151w0 f33842a;

    /* renamed from: b, reason: collision with root package name */
    final Supplier f33843b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3155x0(EnumC3071f3 enumC3071f3, EnumC3151w0 enumC3151w0, Supplier supplier) {
        this.f33842a = enumC3151w0;
        this.f33843b = supplier;
    }

    @Override // j$.util.stream.K3
    public final Object b(AbstractC3047b abstractC3047b, Spliterator spliterator) {
        AbstractC3147v0 abstractC3147v0 = (AbstractC3147v0) this.f33843b.get();
        abstractC3047b.R(spliterator, abstractC3147v0);
        return Boolean.valueOf(abstractC3147v0.f33828b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.K3
    public final Object c(AbstractC3047b abstractC3047b, Spliterator spliterator) {
        return (Boolean) new C3159y0(this, abstractC3047b, spliterator).invoke();
    }

    @Override // j$.util.stream.K3
    public final int d() {
        return EnumC3066e3.f33724u | EnumC3066e3.f33721r;
    }
}
