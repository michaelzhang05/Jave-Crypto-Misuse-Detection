package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class O implements Q, InterfaceC3172z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfLong f33299a;

    private /* synthetic */ O(PrimitiveIterator.OfLong ofLong) {
        this.f33299a = ofLong;
    }

    public static /* synthetic */ Q a(PrimitiveIterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof P ? ((P) ofLong).f33300a : new O(ofLong);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfLong ofLong = this.f33299a;
        if (obj instanceof O) {
            obj = ((O) obj).f33299a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.S
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f33299a.forEachRemaining((PrimitiveIterator.OfLong) obj);
    }

    @Override // j$.util.Q, java.util.Iterator, j$.util.InterfaceC3172z
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f33299a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.Q
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f33299a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f33299a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f33299a.hashCode();
    }

    @Override // j$.util.Q, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f33299a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f33299a.next();
    }

    @Override // j$.util.Q
    public final /* synthetic */ long nextLong() {
        return this.f33299a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f33299a.remove();
    }
}
