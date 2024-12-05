package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class O implements Q, InterfaceC3022z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfLong f32105a;

    private /* synthetic */ O(PrimitiveIterator.OfLong ofLong) {
        this.f32105a = ofLong;
    }

    public static /* synthetic */ Q a(PrimitiveIterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof P ? ((P) ofLong).f32106a : new O(ofLong);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfLong ofLong = this.f32105a;
        if (obj instanceof O) {
            obj = ((O) obj).f32105a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.S
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f32105a.forEachRemaining((PrimitiveIterator.OfLong) obj);
    }

    @Override // j$.util.Q, java.util.Iterator, j$.util.InterfaceC3022z
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f32105a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.Q
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f32105a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f32105a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f32105a.hashCode();
    }

    @Override // j$.util.Q, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f32105a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f32105a.next();
    }

    @Override // j$.util.Q
    public final /* synthetic */ long nextLong() {
        return this.f32105a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f32105a.remove();
    }
}
