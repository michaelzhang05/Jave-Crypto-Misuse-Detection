package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.w1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3152w1 extends AbstractC3156x1 {

    /* renamed from: h, reason: collision with root package name */
    private final Object[] f33838h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3152w1(Spliterator spliterator, AbstractC3047b abstractC3047b, Object[] objArr) {
        super(spliterator, abstractC3047b, objArr.length);
        this.f33838h = objArr;
    }

    C3152w1(C3152w1 c3152w1, Spliterator spliterator, long j8, long j9) {
        super(c3152w1, spliterator, j8, j9, c3152w1.f33838h.length);
        this.f33838h = c3152w1.f33838h;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i8 = this.f33849f;
        if (i8 >= this.f33850g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f33849f));
        }
        Object[] objArr = this.f33838h;
        this.f33849f = i8 + 1;
        objArr[i8] = obj;
    }

    @Override // j$.util.stream.AbstractC3156x1
    final AbstractC3156x1 b(Spliterator spliterator, long j8, long j9) {
        return new C3152w1(this, spliterator, j8, j9);
    }
}
