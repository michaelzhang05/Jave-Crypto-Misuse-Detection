package f6;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: f6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2674a implements InterfaceC2680g {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f31118a;

    public C2674a(InterfaceC2680g sequence) {
        AbstractC3159y.i(sequence, "sequence");
        this.f31118a = new AtomicReference(sequence);
    }

    @Override // f6.InterfaceC2680g
    public Iterator iterator() {
        InterfaceC2680g interfaceC2680g = (InterfaceC2680g) this.f31118a.getAndSet(null);
        if (interfaceC2680g != null) {
            return interfaceC2680g.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
