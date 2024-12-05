package f6;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f6.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2684k {

    /* renamed from: f6.k$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC2680g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X5.n f31142a;

        public a(X5.n nVar) {
            this.f31142a = nVar;
        }

        @Override // f6.InterfaceC2680g
        public Iterator iterator() {
            return AbstractC2683j.a(this.f31142a);
        }
    }

    public static Iterator a(X5.n block) {
        AbstractC3159y.i(block, "block");
        C2681h c2681h = new C2681h();
        c2681h.i(Q5.b.a(block, c2681h, c2681h));
        return c2681h;
    }

    public static InterfaceC2680g b(X5.n block) {
        AbstractC3159y.i(block, "block");
        return new a(block);
    }
}
