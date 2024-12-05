package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class H1 extends AbstractC3013z0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f32320h;

    public /* synthetic */ H1(int i8) {
        this.f32320h = i8;
    }

    @Override // j$.util.stream.AbstractC3013z0, j$.util.stream.K3
    public final Object b(AbstractC2897b abstractC2897b, Spliterator spliterator) {
        switch (this.f32320h) {
            case 0:
                return EnumC2916e3.SIZED.r(abstractC2897b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.b(abstractC2897b, spliterator);
            case 1:
                return EnumC2916e3.SIZED.r(abstractC2897b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.b(abstractC2897b, spliterator);
            case 2:
                return EnumC2916e3.SIZED.r(abstractC2897b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.b(abstractC2897b, spliterator);
            default:
                return EnumC2916e3.SIZED.r(abstractC2897b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.b(abstractC2897b, spliterator);
        }
    }

    @Override // j$.util.stream.AbstractC3013z0, j$.util.stream.K3
    public final Object c(AbstractC2897b abstractC2897b, Spliterator spliterator) {
        switch (this.f32320h) {
            case 0:
                return EnumC2916e3.SIZED.r(abstractC2897b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.c(abstractC2897b, spliterator);
            case 1:
                return EnumC2916e3.SIZED.r(abstractC2897b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.c(abstractC2897b, spliterator);
            case 2:
                return EnumC2916e3.SIZED.r(abstractC2897b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.c(abstractC2897b, spliterator);
            default:
                return EnumC2916e3.SIZED.r(abstractC2897b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.c(abstractC2897b, spliterator);
        }
    }

    @Override // j$.util.stream.AbstractC3013z0, j$.util.stream.K3
    public final int d() {
        switch (this.f32320h) {
            case 0:
                return EnumC2916e3.f32527r;
            case 1:
                return EnumC2916e3.f32527r;
            case 2:
                return EnumC2916e3.f32527r;
            default:
                return EnumC2916e3.f32527r;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, j$.util.stream.V1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, j$.util.stream.V1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, j$.util.stream.V1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, j$.util.stream.V1] */
    @Override // j$.util.stream.AbstractC3013z0
    public final V1 f0() {
        switch (this.f32320h) {
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
