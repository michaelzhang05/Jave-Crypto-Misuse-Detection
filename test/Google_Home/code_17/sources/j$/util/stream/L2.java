package j$.util.stream;

import j$.util.Comparator$CC;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class L2 extends AbstractC3080h2 {

    /* renamed from: m, reason: collision with root package name */
    private final boolean f33542m;

    /* renamed from: n, reason: collision with root package name */
    private final Comparator f33543n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L2(AbstractC3047b abstractC3047b) {
        super(abstractC3047b, EnumC3066e3.f33720q | EnumC3066e3.f33718o, 0);
        this.f33542m = true;
        this.f33543n = Comparator$CC.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public L2(AbstractC3047b abstractC3047b, Comparator comparator) {
        super(abstractC3047b, EnumC3066e3.f33720q | EnumC3066e3.f33719p, 0);
        this.f33542m = false;
        this.f33543n = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.AbstractC3047b
    public final L0 K(AbstractC3047b abstractC3047b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC3066e3.SORTED.r(abstractC3047b.G()) && this.f33542m) {
            return abstractC3047b.y(spliterator, false, intFunction);
        }
        Object[] n8 = abstractC3047b.y(spliterator, true, intFunction).n(intFunction);
        Arrays.sort(n8, this.f33543n);
        return new O0(n8);
    }

    @Override // j$.util.stream.AbstractC3047b
    public final InterfaceC3125q2 N(int i8, InterfaceC3125q2 interfaceC3125q2) {
        Objects.requireNonNull(interfaceC3125q2);
        if (EnumC3066e3.SORTED.r(i8) && this.f33542m) {
            return interfaceC3125q2;
        }
        boolean r8 = EnumC3066e3.SIZED.r(i8);
        Comparator comparator = this.f33543n;
        return r8 ? new E2(interfaceC3125q2, comparator) : new E2(interfaceC3125q2, comparator);
    }
}
