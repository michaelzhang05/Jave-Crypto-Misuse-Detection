package j$.util.stream;

import java.util.Comparator;

/* loaded from: classes2.dex */
abstract class E2 extends AbstractC3105m2 {

    /* renamed from: b, reason: collision with root package name */
    protected final Comparator f33490b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f33491c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E2(InterfaceC3125q2 interfaceC3125q2, Comparator comparator) {
        super(interfaceC3125q2);
        this.f33490b = comparator;
    }

    @Override // j$.util.stream.AbstractC3105m2, j$.util.stream.InterfaceC3125q2
    public final boolean m() {
        this.f33491c = true;
        return false;
    }
}
