package j$.util;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class s0 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Collection f33453a;

    /* renamed from: b, reason: collision with root package name */
    private Iterator f33454b = null;

    /* renamed from: c, reason: collision with root package name */
    private final int f33455c;

    /* renamed from: d, reason: collision with root package name */
    private long f33456d;

    /* renamed from: e, reason: collision with root package name */
    private int f33457e;

    public s0(int i8, java.util.Collection collection) {
        this.f33453a = collection;
        this.f33455c = i8 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f33455c;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        if (this.f33454b != null) {
            return this.f33456d;
        }
        java.util.Collection collection = this.f33453a;
        this.f33454b = collection.iterator();
        long size = collection.size();
        this.f33456d = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f33454b;
        if (it == null) {
            Iterator it2 = this.f33453a.iterator();
            this.f33454b = it2;
            this.f33456d = r0.size();
            it = it2;
        }
        AbstractC3027d.r(it, consumer);
    }

    @Override // j$.util.Spliterator
    public Comparator getComparator() {
        if (AbstractC3027d.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
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
        consumer.getClass();
        if (this.f33454b == null) {
            this.f33454b = this.f33453a.iterator();
            this.f33456d = r0.size();
        }
        if (!this.f33454b.hasNext()) {
            return false;
        }
        consumer.accept(this.f33454b.next());
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        long j8;
        Iterator it = this.f33454b;
        if (it == null) {
            java.util.Collection collection = this.f33453a;
            Iterator it2 = collection.iterator();
            this.f33454b = it2;
            j8 = collection.size();
            this.f33456d = j8;
            it = it2;
        } else {
            j8 = this.f33456d;
        }
        if (j8 <= 1 || !it.hasNext()) {
            return null;
        }
        int i8 = this.f33457e + 1024;
        if (i8 > j8) {
            i8 = (int) j8;
        }
        if (i8 > 33554432) {
            i8 = 33554432;
        }
        Object[] objArr = new Object[i8];
        int i9 = 0;
        do {
            objArr[i9] = it.next();
            i9++;
            if (i9 >= i8) {
                break;
            }
        } while (it.hasNext());
        this.f33457e = i9;
        long j9 = this.f33456d;
        if (j9 != Long.MAX_VALUE) {
            this.f33456d = j9 - i9;
        }
        return new l0(objArr, 0, i9, this.f33455c);
    }
}
