package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3109n1 extends AbstractC3119p1 implements j$.util.f0 {
    @Override // j$.util.f0
    public final void forEachRemaining(Object obj) {
        if (this.f33791a == null) {
            return;
        }
        if (this.f33794d == null) {
            Spliterator spliterator = this.f33793c;
            if (spliterator != null) {
                ((j$.util.f0) spliterator).forEachRemaining(obj);
                return;
            }
            ArrayDeque b8 = b();
            while (true) {
                K0 k02 = (K0) AbstractC3119p1.a(b8);
                if (k02 == null) {
                    this.f33791a = null;
                    return;
                }
                k02.e(obj);
            }
        }
        do {
        } while (tryAdvance(obj));
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

    @Override // j$.util.f0
    public final boolean tryAdvance(Object obj) {
        K0 k02;
        if (!c()) {
            return false;
        }
        boolean tryAdvance = ((j$.util.f0) this.f33794d).tryAdvance(obj);
        if (!tryAdvance) {
            if (this.f33793c == null && (k02 = (K0) AbstractC3119p1.a(this.f33795e)) != null) {
                j$.util.f0 spliterator = k02.spliterator();
                this.f33794d = spliterator;
                return spliterator.tryAdvance(obj);
            }
            this.f33791a = null;
        }
        return tryAdvance;
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
