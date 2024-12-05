package j$.util.stream;

import j$.util.AbstractC3027d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class y3 extends z3 implements Spliterator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public y3(Spliterator spliterator, long j8, long j9) {
        super(spliterator, j8, j9, 0L, Math.min(spliterator.estimateSize(), j9));
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [j$.util.stream.z3, j$.util.Spliterator] */
    @Override // j$.util.stream.z3
    protected final Spliterator a(Spliterator spliterator, long j8, long j9, long j10, long j11) {
        return new z3(spliterator, j8, j9, j10, j11);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j8 = this.f33873e;
        long j9 = this.f33869a;
        if (j9 >= j8) {
            return;
        }
        long j10 = this.f33872d;
        if (j10 >= j8) {
            return;
        }
        if (j10 >= j9 && this.f33871c.estimateSize() + j10 <= this.f33870b) {
            this.f33871c.forEachRemaining(consumer);
            this.f33872d = this.f33873e;
            return;
        }
        while (j9 > this.f33872d) {
            this.f33871c.tryAdvance(new C3068f0(14));
            this.f33872d++;
        }
        while (this.f33872d < this.f33873e) {
            this.f33871c.tryAdvance(consumer);
            this.f33872d++;
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC3027d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC3027d.e(this, i8);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        long j8;
        Objects.requireNonNull(consumer);
        long j9 = this.f33873e;
        long j10 = this.f33869a;
        if (j10 >= j9) {
            return false;
        }
        while (true) {
            j8 = this.f33872d;
            if (j10 <= j8) {
                break;
            }
            this.f33871c.tryAdvance(new C3068f0(13));
            this.f33872d++;
        }
        if (j8 >= this.f33873e) {
            return false;
        }
        this.f33872d = j8 + 1;
        return this.f33871c.tryAdvance(consumer);
    }
}
