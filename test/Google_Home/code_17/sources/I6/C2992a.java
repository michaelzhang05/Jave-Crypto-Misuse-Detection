package i6;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: i6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2992a implements InterfaceC2998g {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f32981a;

    public C2992a(InterfaceC2998g sequence) {
        AbstractC3255y.i(sequence, "sequence");
        this.f32981a = new AtomicReference(sequence);
    }

    @Override // i6.InterfaceC2998g
    public Iterator iterator() {
        InterfaceC2998g interfaceC2998g = (InterfaceC2998g) this.f32981a.getAndSet(null);
        if (interfaceC2998g != null) {
            return interfaceC2998g.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
