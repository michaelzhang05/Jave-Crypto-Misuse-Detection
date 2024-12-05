package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class J2 extends AbstractC3053c0 {
    @Override // j$.util.stream.AbstractC3047b
    public final L0 K(AbstractC3047b abstractC3047b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC3066e3.SORTED.r(abstractC3047b.G())) {
            return abstractC3047b.y(spliterator, false, intFunction);
        }
        int[] iArr = (int[]) ((H0) abstractC3047b.y(spliterator, true, intFunction)).d();
        Arrays.sort(iArr);
        return new C3079h1(iArr);
    }

    @Override // j$.util.stream.AbstractC3047b
    public final InterfaceC3125q2 N(int i8, InterfaceC3125q2 interfaceC3125q2) {
        Objects.requireNonNull(interfaceC3125q2);
        return EnumC3066e3.SORTED.r(i8) ? interfaceC3125q2 : EnumC3066e3.SIZED.r(i8) ? new AbstractC3095k2(interfaceC3125q2) : new AbstractC3095k2(interfaceC3125q2);
    }
}
