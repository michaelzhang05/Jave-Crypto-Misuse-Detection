package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class H implements PrimitiveIterator.OfDouble {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f32100a;

    private /* synthetic */ H(I i8) {
        this.f32100a = i8;
    }

    public static /* synthetic */ PrimitiveIterator.OfDouble a(I i8) {
        if (i8 == null) {
            return null;
        }
        return i8 instanceof G ? ((G) i8).f32099a : new H(i8);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        I i8 = this.f32100a;
        if (obj instanceof H) {
            obj = ((H) obj).f32100a;
        }
        return i8.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f32100a.forEachRemaining((Object) doubleConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f32100a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.f32100a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f32100a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f32100a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f32100a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f32100a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    public final /* synthetic */ double nextDouble() {
        return this.f32100a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f32100a.remove();
    }
}
