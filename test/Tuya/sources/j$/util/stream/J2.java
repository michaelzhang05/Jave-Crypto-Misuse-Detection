package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class J2 extends AbstractC2903c0 {
    @Override // j$.util.stream.AbstractC2897b
    public final L0 K(AbstractC2897b abstractC2897b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC2916e3.SORTED.r(abstractC2897b.G())) {
            return abstractC2897b.y(spliterator, false, intFunction);
        }
        int[] iArr = (int[]) ((H0) abstractC2897b.y(spliterator, true, intFunction)).d();
        Arrays.sort(iArr);
        return new C2929h1(iArr);
    }

    @Override // j$.util.stream.AbstractC2897b
    public final InterfaceC2975q2 N(int i8, InterfaceC2975q2 interfaceC2975q2) {
        Objects.requireNonNull(interfaceC2975q2);
        return EnumC2916e3.SORTED.r(i8) ? interfaceC2975q2 : EnumC2916e3.SIZED.r(i8) ? new AbstractC2945k2(interfaceC2975q2) : new AbstractC2945k2(interfaceC2975q2);
    }
}
