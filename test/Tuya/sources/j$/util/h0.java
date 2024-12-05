package j$.util;

import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class h0 implements Iterator, Consumer {

    /* renamed from: a, reason: collision with root package name */
    boolean f32221a = false;

    /* renamed from: b, reason: collision with root package name */
    Object f32222b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Spliterator f32223c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(Spliterator spliterator) {
        this.f32223c = spliterator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f32221a = true;
        this.f32222b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f32221a) {
            this.f32223c.tryAdvance(this);
        }
        return this.f32221a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f32221a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f32221a = false;
        return this.f32222b;
    }
}
