package A6;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: A6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0976a implements w6.b {
    public /* synthetic */ AbstractC0976a(AbstractC3247p abstractC3247p) {
        this();
    }

    public static /* synthetic */ void n(AbstractC0976a abstractC0976a, z6.c cVar, int i8, Object obj, boolean z8, int i9, Object obj2) {
        if (obj2 == null) {
            if ((i9 & 8) != 0) {
                z8 = true;
            }
            abstractC0976a.m(cVar, i8, obj, z8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
    }

    private final int o(z6.c cVar, Object obj) {
        int B8 = cVar.B(a());
        h(obj, B8);
        return B8;
    }

    @Override // w6.InterfaceC4150a
    public Object b(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        return k(decoder, null);
    }

    protected abstract Object f();

    protected abstract int g(Object obj);

    protected abstract void h(Object obj, int i8);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Iterator i(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int j(Object obj);

    public final Object k(z6.e decoder, Object obj) {
        Object f8;
        AbstractC3255y.i(decoder, "decoder");
        if (obj == null || (f8 = p(obj)) == null) {
            f8 = f();
        }
        int g8 = g(f8);
        z6.c d8 = decoder.d(a());
        if (!d8.w()) {
            while (true) {
                int g9 = d8.g(a());
                if (g9 == -1) {
                    break;
                }
                n(this, d8, g8 + g9, f8, false, 8, null);
            }
        } else {
            l(d8, f8, g8, o(d8, f8));
        }
        d8.b(a());
        return q(f8);
    }

    protected abstract void l(z6.c cVar, Object obj, int i8, int i9);

    protected abstract void m(z6.c cVar, int i8, Object obj, boolean z8);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object p(Object obj);

    protected abstract Object q(Object obj);

    private AbstractC0976a() {
    }
}
