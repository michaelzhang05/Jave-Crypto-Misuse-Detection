package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class K implements M, InterfaceC3172z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfInt f33296a;

    private /* synthetic */ K(PrimitiveIterator.OfInt ofInt) {
        this.f33296a = ofInt;
    }

    public static /* synthetic */ M a(PrimitiveIterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof L ? ((L) ofInt).f33297a : new K(ofInt);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfInt ofInt = this.f33296a;
        if (obj instanceof K) {
            obj = ((K) obj).f33296a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.S
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f33296a.forEachRemaining((PrimitiveIterator.OfInt) obj);
    }

    @Override // j$.util.M, java.util.Iterator, j$.util.InterfaceC3172z
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f33296a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.M
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f33296a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f33296a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f33296a.hashCode();
    }

    @Override // j$.util.M, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f33296a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f33296a.next();
    }

    @Override // j$.util.M
    public final /* synthetic */ int nextInt() {
        return this.f33296a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f33296a.remove();
    }
}
