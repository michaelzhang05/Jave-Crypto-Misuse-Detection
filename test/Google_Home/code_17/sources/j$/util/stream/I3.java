package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class I3 extends AbstractC3076g3 {
    @Override // j$.util.stream.AbstractC3076g3
    final void d() {
        C3046a3 c3046a3 = new C3046a3();
        this.f33746h = c3046a3;
        Objects.requireNonNull(c3046a3);
        this.f33743e = this.f33740b.S(new H3(c3046a3, 0));
        this.f33744f = new C3042a(6, this);
    }

    @Override // j$.util.stream.AbstractC3076g3
    final AbstractC3076g3 e(Spliterator spliterator) {
        return new AbstractC3076g3(this.f33740b, spliterator, this.f33739a);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f33746h != null || this.f33747i) {
            do {
            } while (tryAdvance(consumer));
            return;
        }
        Objects.requireNonNull(consumer);
        c();
        Objects.requireNonNull(consumer);
        H3 h32 = new H3(consumer, 1);
        this.f33740b.R(this.f33742d, h32);
        this.f33747i = true;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean a8 = a();
        if (a8) {
            C3046a3 c3046a3 = (C3046a3) this.f33746h;
            long j8 = this.f33745g;
            if (c3046a3.f33694c != 0) {
                if (j8 >= c3046a3.count()) {
                    throw new IndexOutOfBoundsException(Long.toString(j8));
                }
                for (int i8 = 0; i8 <= c3046a3.f33694c; i8++) {
                    long j9 = c3046a3.f33695d[i8];
                    Object[] objArr = c3046a3.f33673f[i8];
                    if (j8 < objArr.length + j9) {
                        obj = objArr[(int) (j8 - j9)];
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j8));
            }
            if (j8 >= c3046a3.f33693b) {
                throw new IndexOutOfBoundsException(Long.toString(j8));
            }
            obj = c3046a3.f33672e[(int) j8];
            consumer.o(obj);
        }
        return a8;
    }
}
