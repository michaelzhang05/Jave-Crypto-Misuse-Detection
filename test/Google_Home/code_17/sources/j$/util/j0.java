package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class j0 implements Q, LongConsumer, InterfaceC3172z {

    /* renamed from: a, reason: collision with root package name */
    boolean f33427a = false;

    /* renamed from: b, reason: collision with root package name */
    long f33428b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c0 f33429c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(c0 c0Var) {
        this.f33429c = c0Var;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f33427a = true;
        this.f33428b = j8;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.Q, java.util.Iterator, j$.util.InterfaceC3172z
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (x0.f33894a) {
            x0.a(j0.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((LongConsumer) new N(consumer));
    }

    @Override // j$.util.S
    public final void forEachRemaining(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        while (hasNext()) {
            longConsumer.accept(nextLong());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f33427a) {
            this.f33429c.tryAdvance((LongConsumer) this);
        }
        return this.f33427a;
    }

    @Override // java.util.Iterator
    public final Long next() {
        if (!x0.f33894a) {
            return Long.valueOf(nextLong());
        }
        x0.a(j0.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    @Override // j$.util.Q
    public final long nextLong() {
        if (!this.f33427a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f33427a = false;
        return this.f33428b;
    }
}
