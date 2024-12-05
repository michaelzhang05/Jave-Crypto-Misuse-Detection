package j$.util.stream;

import j$.util.AbstractC3027d;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.n3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3111n3 implements Spliterator, Consumer {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f33780d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Spliterator f33781a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f33782b;

    /* renamed from: c, reason: collision with root package name */
    private Object f33783c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3111n3(Spliterator spliterator) {
        this(spliterator, new ConcurrentHashMap());
    }

    private C3111n3(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f33781a = spliterator;
        this.f33782b = concurrentHashMap;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f33783c = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Consumer consumer, Object obj) {
        if (this.f33782b.putIfAbsent(obj != null ? obj : f33780d, Boolean.TRUE) == null) {
            consumer.accept(obj);
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return (this.f33781a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f33781a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.f33781a.forEachRemaining(new C3102m(2, this, consumer));
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f33781a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC3027d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC3027d.e(this, i8);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        while (this.f33781a.tryAdvance(this)) {
            Object obj = this.f33783c;
            if (obj == null) {
                obj = f33780d;
            }
            if (this.f33782b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.f33783c);
                this.f33783c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator trySplit = this.f33781a.trySplit();
        if (trySplit != null) {
            return new C3111n3(trySplit, this.f33782b);
        }
        return null;
    }
}
