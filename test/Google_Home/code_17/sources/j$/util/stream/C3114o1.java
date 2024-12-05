package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3114o1 extends AbstractC3119p1 {
    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f33791a == null) {
            return;
        }
        if (this.f33794d == null) {
            Spliterator spliterator = this.f33793c;
            if (spliterator != null) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            ArrayDeque b8 = b();
            while (true) {
                L0 a8 = AbstractC3119p1.a(b8);
                if (a8 == null) {
                    this.f33791a = null;
                    return;
                }
                a8.forEach(consumer);
            }
        }
        do {
        } while (tryAdvance(consumer));
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        L0 a8;
        if (!c()) {
            return false;
        }
        boolean tryAdvance = this.f33794d.tryAdvance(consumer);
        if (!tryAdvance) {
            if (this.f33793c == null && (a8 = AbstractC3119p1.a(this.f33795e)) != null) {
                Spliterator spliterator = a8.spliterator();
                this.f33794d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
            this.f33791a = null;
        }
        return tryAdvance;
    }
}
