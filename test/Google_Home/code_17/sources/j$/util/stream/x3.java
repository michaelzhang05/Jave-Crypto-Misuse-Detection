package j$.util.stream;

import j$.util.AbstractC3027d;
import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class x3 extends z3 implements j$.util.f0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public x3(j$.util.f0 f0Var, long j8, long j9) {
        super(f0Var, j8, j9, 0L, Math.min(f0Var.estimateSize(), j9));
    }

    protected abstract Object b();

    @Override // j$.util.f0
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        long j8 = this.f33873e;
        long j9 = this.f33869a;
        if (j9 >= j8) {
            return;
        }
        long j10 = this.f33872d;
        if (j10 >= j8) {
            return;
        }
        if (j10 >= j9 && ((j$.util.f0) this.f33871c).estimateSize() + j10 <= this.f33870b) {
            ((j$.util.f0) this.f33871c).forEachRemaining(obj);
            this.f33872d = this.f33873e;
            return;
        }
        while (j9 > this.f33872d) {
            ((j$.util.f0) this.f33871c).tryAdvance(b());
            this.f33872d++;
        }
        while (this.f33872d < this.f33873e) {
            ((j$.util.f0) this.f33871c).tryAdvance(obj);
            this.f33872d++;
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
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

    @Override // j$.util.f0
    public final boolean tryAdvance(Object obj) {
        long j8;
        Objects.requireNonNull(obj);
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
            ((j$.util.f0) this.f33871c).tryAdvance(b());
            this.f33872d++;
        }
        if (j8 >= this.f33873e) {
            return false;
        }
        this.f33872d = j8 + 1;
        return ((j$.util.f0) this.f33871c).tryAdvance(obj);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }
}
