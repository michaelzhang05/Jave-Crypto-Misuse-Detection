package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class r extends AbstractC2930h2 {
    static P0 U(AbstractC2897b abstractC2897b, Spliterator spliterator) {
        C2947l c2947l = new C2947l(28);
        C2947l c2947l2 = new C2947l(29);
        C2962o c2962o = new C2962o(0);
        Objects.requireNonNull(c2947l);
        Objects.requireNonNull(c2947l2);
        Objects.requireNonNull(c2962o);
        return new P0((Collection) new F1(EnumC2921f3.REFERENCE, c2962o, c2947l2, c2947l, 3).c(abstractC2897b, spliterator));
    }

    @Override // j$.util.stream.AbstractC2897b
    final L0 K(AbstractC2897b abstractC2897b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC2916e3.DISTINCT.r(abstractC2897b.G())) {
            return abstractC2897b.y(spliterator, false, intFunction);
        }
        if (EnumC2916e3.ORDERED.r(abstractC2897b.G())) {
            return U(abstractC2897b, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        C2952m c2952m = new C2952m(3, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(c2952m);
        new S(c2952m, false).e(abstractC2897b, spliterator);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new P0(keySet);
    }

    @Override // j$.util.stream.AbstractC2897b
    final Spliterator L(AbstractC2897b abstractC2897b, Spliterator spliterator) {
        return EnumC2916e3.DISTINCT.r(abstractC2897b.G()) ? abstractC2897b.T(spliterator) : EnumC2916e3.ORDERED.r(abstractC2897b.G()) ? U(abstractC2897b, spliterator).spliterator() : new C2961n3(abstractC2897b.T(spliterator));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC2897b
    public final InterfaceC2975q2 N(int i8, InterfaceC2975q2 interfaceC2975q2) {
        Objects.requireNonNull(interfaceC2975q2);
        return EnumC2916e3.DISTINCT.r(i8) ? interfaceC2975q2 : EnumC2916e3.SORTED.r(i8) ? new C2967p(interfaceC2975q2) : new C2972q(interfaceC2975q2);
    }
}
