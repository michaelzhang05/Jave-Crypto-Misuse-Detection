package j$.util.stream;

import j$.util.AbstractC2877d;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.g3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2926g3 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    final boolean f32545a;

    /* renamed from: b, reason: collision with root package name */
    final AbstractC2897b f32546b;

    /* renamed from: c, reason: collision with root package name */
    private Supplier f32547c;

    /* renamed from: d, reason: collision with root package name */
    Spliterator f32548d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC2975q2 f32549e;

    /* renamed from: f, reason: collision with root package name */
    BooleanSupplier f32550f;

    /* renamed from: g, reason: collision with root package name */
    long f32551g;

    /* renamed from: h, reason: collision with root package name */
    AbstractC2907d f32552h;

    /* renamed from: i, reason: collision with root package name */
    boolean f32553i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2926g3(AbstractC2897b abstractC2897b, Spliterator spliterator, boolean z8) {
        this.f32546b = abstractC2897b;
        this.f32547c = null;
        this.f32548d = spliterator;
        this.f32545a = z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2926g3(AbstractC2897b abstractC2897b, Supplier supplier, boolean z8) {
        this.f32546b = abstractC2897b;
        this.f32547c = supplier;
        this.f32548d = null;
        this.f32545a = z8;
    }

    private boolean b() {
        while (this.f32552h.count() == 0) {
            if (this.f32549e.m() || !this.f32550f.getAsBoolean()) {
                if (this.f32553i) {
                    return false;
                }
                this.f32549e.j();
                this.f32553i = true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        AbstractC2907d abstractC2907d = this.f32552h;
        if (abstractC2907d == null) {
            if (this.f32553i) {
                return false;
            }
            c();
            d();
            this.f32551g = 0L;
            this.f32549e.k(this.f32548d.getExactSizeIfKnown());
            return b();
        }
        long j8 = this.f32551g + 1;
        this.f32551g = j8;
        boolean z8 = j8 < abstractC2907d.count();
        if (z8) {
            return z8;
        }
        this.f32551g = 0L;
        this.f32552h.clear();
        return b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (this.f32548d == null) {
            this.f32548d = (Spliterator) this.f32547c.get();
            this.f32547c = null;
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int z8 = EnumC2916e3.z(this.f32546b.G()) & EnumC2916e3.f32515f;
        return (z8 & 64) != 0 ? (z8 & (-16449)) | (this.f32548d.characteristics() & 16448) : z8;
    }

    abstract void d();

    abstract AbstractC2926g3 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.f32548d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC2877d.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (EnumC2916e3.SIZED.r(this.f32546b.G())) {
            return this.f32548d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC2877d.e(this, i8);
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f32548d);
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.f32545a || this.f32552h != null || this.f32553i) {
            return null;
        }
        c();
        Spliterator trySplit = this.f32548d.trySplit();
        if (trySplit == null) {
            return null;
        }
        return e(trySplit);
    }
}
