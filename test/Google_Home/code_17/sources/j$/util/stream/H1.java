package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class H1 extends AbstractC3163z0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f33514h;

    public /* synthetic */ H1(int i8) {
        this.f33514h = i8;
    }

    @Override // j$.util.stream.AbstractC3163z0, j$.util.stream.K3
    public final Object b(AbstractC3047b abstractC3047b, Spliterator spliterator) {
        switch (this.f33514h) {
            case 0:
                return EnumC3066e3.SIZED.r(abstractC3047b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.b(abstractC3047b, spliterator);
            case 1:
                return EnumC3066e3.SIZED.r(abstractC3047b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.b(abstractC3047b, spliterator);
            case 2:
                return EnumC3066e3.SIZED.r(abstractC3047b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.b(abstractC3047b, spliterator);
            default:
                return EnumC3066e3.SIZED.r(abstractC3047b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.b(abstractC3047b, spliterator);
        }
    }

    @Override // j$.util.stream.AbstractC3163z0, j$.util.stream.K3
    public final Object c(AbstractC3047b abstractC3047b, Spliterator spliterator) {
        switch (this.f33514h) {
            case 0:
                return EnumC3066e3.SIZED.r(abstractC3047b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.c(abstractC3047b, spliterator);
            case 1:
                return EnumC3066e3.SIZED.r(abstractC3047b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.c(abstractC3047b, spliterator);
            case 2:
                return EnumC3066e3.SIZED.r(abstractC3047b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.c(abstractC3047b, spliterator);
            default:
                return EnumC3066e3.SIZED.r(abstractC3047b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.c(abstractC3047b, spliterator);
        }
    }

    @Override // j$.util.stream.AbstractC3163z0, j$.util.stream.K3
    public final int d() {
        switch (this.f33514h) {
            case 0:
                return EnumC3066e3.f33721r;
            case 1:
                return EnumC3066e3.f33721r;
            case 2:
                return EnumC3066e3.f33721r;
            default:
                return EnumC3066e3.f33721r;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, j$.util.stream.V1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, j$.util.stream.V1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, j$.util.stream.V1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, j$.util.stream.V1] */
    @Override // j$.util.stream.AbstractC3163z0
    public final V1 f0() {
        switch (this.f33514h) {
            case 0:
                return new Object();
            case 1:
                return new Object();
            case 2:
                return new Object();
            default:
                return new Object();
        }
    }
}
