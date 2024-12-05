package j$.util;

import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class h0 implements Iterator, Consumer {

    /* renamed from: a, reason: collision with root package name */
    boolean f33415a = false;

    /* renamed from: b, reason: collision with root package name */
    Object f33416b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Spliterator f33417c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(Spliterator spliterator) {
        this.f33417c = spliterator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f33415a = true;
        this.f33416b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f33415a) {
            this.f33417c.tryAdvance(this);
        }
        return this.f33415a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f33415a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f33415a = false;
        return this.f33416b;
    }
}
