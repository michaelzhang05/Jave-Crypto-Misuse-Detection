package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2964o1 extends AbstractC2969p1 {
    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f32597a == null) {
            return;
        }
        if (this.f32600d == null) {
            Spliterator spliterator = this.f32599c;
            if (spliterator != null) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            ArrayDeque b8 = b();
            while (true) {
                L0 a8 = AbstractC2969p1.a(b8);
                if (a8 == null) {
                    this.f32597a = null;
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
        boolean tryAdvance = this.f32600d.tryAdvance(consumer);
        if (!tryAdvance) {
            if (this.f32599c == null && (a8 = AbstractC2969p1.a(this.f32601e)) != null) {
                Spliterator spliterator = a8.spliterator();
                this.f32600d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
            this.f32597a = null;
        }
        return tryAdvance;
    }
}
