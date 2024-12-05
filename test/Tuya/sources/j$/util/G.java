package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class G implements I, InterfaceC3022z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfDouble f32099a;

    private /* synthetic */ G(PrimitiveIterator.OfDouble ofDouble) {
        this.f32099a = ofDouble;
    }

    public static /* synthetic */ I a(PrimitiveIterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof H ? ((H) ofDouble).f32100a : new G(ofDouble);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfDouble ofDouble = this.f32099a;
        if (obj instanceof G) {
            obj = ((G) obj).f32099a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.S
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f32099a.forEachRemaining((PrimitiveIterator.OfDouble) obj);
    }

    @Override // j$.util.I, java.util.Iterator, j$.util.InterfaceC3022z
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f32099a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.I
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f32099a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f32099a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f32099a.hashCode();
    }

    @Override // j$.util.I, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f32099a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f32099a.next();
    }

    @Override // j$.util.I
    public final /* synthetic */ double nextDouble() {
        return this.f32099a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f32099a.remove();
    }
}
