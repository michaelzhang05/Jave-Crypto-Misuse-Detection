package j$.util.stream;

import j$.util.AbstractC3027d;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.g3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3076g3 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    final boolean f33739a;

    /* renamed from: b, reason: collision with root package name */
    final AbstractC3047b f33740b;

    /* renamed from: c, reason: collision with root package name */
    private Supplier f33741c;

    /* renamed from: d, reason: collision with root package name */
    Spliterator f33742d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC3125q2 f33743e;

    /* renamed from: f, reason: collision with root package name */
    BooleanSupplier f33744f;

    /* renamed from: g, reason: collision with root package name */
    long f33745g;

    /* renamed from: h, reason: collision with root package name */
    AbstractC3057d f33746h;

    /* renamed from: i, reason: collision with root package name */
    boolean f33747i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3076g3(AbstractC3047b abstractC3047b, Spliterator spliterator, boolean z8) {
        this.f33740b = abstractC3047b;
        this.f33741c = null;
        this.f33742d = spliterator;
        this.f33739a = z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3076g3(AbstractC3047b abstractC3047b, Supplier supplier, boolean z8) {
        this.f33740b = abstractC3047b;
        this.f33741c = supplier;
        this.f33742d = null;
        this.f33739a = z8;
    }

    private boolean b() {
        while (this.f33746h.count() == 0) {
            if (this.f33743e.m() || !this.f33744f.getAsBoolean()) {
                if (this.f33747i) {
                    return false;
                }
                this.f33743e.j();
                this.f33747i = true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        AbstractC3057d abstractC3057d = this.f33746h;
        if (abstractC3057d == null) {
            if (this.f33747i) {
                return false;
            }
            c();
            d();
            this.f33745g = 0L;
            this.f33743e.k(this.f33742d.getExactSizeIfKnown());
            return b();
        }
        long j8 = this.f33745g + 1;
        this.f33745g = j8;
        boolean z8 = j8 < abstractC3057d.count();
        if (z8) {
            return z8;
        }
        this.f33745g = 0L;
        this.f33746h.clear();
        return b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (this.f33742d == null) {
            this.f33742d = (Spliterator) this.f33741c.get();
            this.f33741c = null;
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int z8 = EnumC3066e3.z(this.f33740b.G()) & EnumC3066e3.f33709f;
        return (z8 & 64) != 0 ? (z8 & (-16449)) | (this.f33742d.characteristics() & 16448) : z8;
    }

    abstract void d();

    abstract AbstractC3076g3 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.f33742d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC3027d.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (EnumC3066e3.SIZED.r(this.f33740b.G())) {
            return this.f33742d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC3027d.e(this, i8);
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f33742d);
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.f33739a || this.f33746h != null || this.f33747i) {
            return null;
        }
        c();
        Spliterator trySplit = this.f33742d.trySplit();
        if (trySplit == null) {
            return null;
        }
        return e(trySplit);
    }
}
