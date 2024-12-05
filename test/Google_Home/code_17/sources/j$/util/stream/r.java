package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class r extends AbstractC3080h2 {
    static P0 U(AbstractC3047b abstractC3047b, Spliterator spliterator) {
        C3097l c3097l = new C3097l(28);
        C3097l c3097l2 = new C3097l(29);
        C3112o c3112o = new C3112o(0);
        Objects.requireNonNull(c3097l);
        Objects.requireNonNull(c3097l2);
        Objects.requireNonNull(c3112o);
        return new P0((Collection) new F1(EnumC3071f3.REFERENCE, c3112o, c3097l2, c3097l, 3).c(abstractC3047b, spliterator));
    }

    @Override // j$.util.stream.AbstractC3047b
    final L0 K(AbstractC3047b abstractC3047b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC3066e3.DISTINCT.r(abstractC3047b.G())) {
            return abstractC3047b.y(spliterator, false, intFunction);
        }
        if (EnumC3066e3.ORDERED.r(abstractC3047b.G())) {
            return U(abstractC3047b, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        C3102m c3102m = new C3102m(3, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(c3102m);
        new S(c3102m, false).e(abstractC3047b, spliterator);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new P0(keySet);
    }

    @Override // j$.util.stream.AbstractC3047b
    final Spliterator L(AbstractC3047b abstractC3047b, Spliterator spliterator) {
        return EnumC3066e3.DISTINCT.r(abstractC3047b.G()) ? abstractC3047b.T(spliterator) : EnumC3066e3.ORDERED.r(abstractC3047b.G()) ? U(abstractC3047b, spliterator).spliterator() : new C3111n3(abstractC3047b.T(spliterator));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3047b
    public final InterfaceC3125q2 N(int i8, InterfaceC3125q2 interfaceC3125q2) {
        Objects.requireNonNull(interfaceC3125q2);
        return EnumC3066e3.DISTINCT.r(i8) ? interfaceC3125q2 : EnumC3066e3.SORTED.r(i8) ? new C3117p(interfaceC3125q2) : new C3122q(interfaceC3125q2);
    }
}
