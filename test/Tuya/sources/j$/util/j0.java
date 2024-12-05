package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class j0 implements Q, LongConsumer, InterfaceC3022z {

    /* renamed from: a, reason: collision with root package name */
    boolean f32233a = false;

    /* renamed from: b, reason: collision with root package name */
    long f32234b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c0 f32235c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(c0 c0Var) {
        this.f32235c = c0Var;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f32233a = true;
        this.f32234b = j8;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.Q, java.util.Iterator, j$.util.InterfaceC3022z
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (x0.f32700a) {
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
        if (!this.f32233a) {
            this.f32235c.tryAdvance((LongConsumer) this);
        }
        return this.f32233a;
    }

    @Override // java.util.Iterator
    public final Long next() {
        if (!x0.f32700a) {
            return Long.valueOf(nextLong());
        }
        x0.a(j0.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    @Override // j$.util.Q
    public final long nextLong() {
        if (!this.f32233a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f32233a = false;
        return this.f32234b;
    }
}
