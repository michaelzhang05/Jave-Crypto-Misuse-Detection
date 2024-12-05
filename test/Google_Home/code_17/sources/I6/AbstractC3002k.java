package i6;

import a6.InterfaceC1668n;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i6.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3002k {

    /* renamed from: i6.k$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC2998g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f33005a;

        public a(InterfaceC1668n interfaceC1668n) {
            this.f33005a = interfaceC1668n;
        }

        @Override // i6.InterfaceC2998g
        public Iterator iterator() {
            return AbstractC3001j.a(this.f33005a);
        }
    }

    public static Iterator a(InterfaceC1668n block) {
        AbstractC3255y.i(block, "block");
        C2999h c2999h = new C2999h();
        c2999h.l(T5.b.a(block, c2999h, c2999h));
        return c2999h;
    }

    public static InterfaceC2998g b(InterfaceC1668n block) {
        AbstractC3255y.i(block, "block");
        return new a(block);
    }
}
