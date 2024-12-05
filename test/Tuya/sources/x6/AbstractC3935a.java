package x6;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: x6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3935a implements t6.b {
    public /* synthetic */ AbstractC3935a(AbstractC3151p abstractC3151p) {
        this();
    }

    public static /* synthetic */ void n(AbstractC3935a abstractC3935a, w6.c cVar, int i8, Object obj, boolean z8, int i9, Object obj2) {
        if (obj2 == null) {
            if ((i9 & 8) != 0) {
                z8 = true;
            }
            abstractC3935a.m(cVar, i8, obj, z8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
    }

    private final int o(w6.c cVar, Object obj) {
        int F8 = cVar.F(a());
        h(obj, F8);
        return F8;
    }

    @Override // t6.InterfaceC3796a
    public Object c(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        return k(decoder, null);
    }

    protected abstract Object f();

    protected abstract int g(Object obj);

    protected abstract void h(Object obj, int i8);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Iterator i(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int j(Object obj);

    public final Object k(w6.e decoder, Object obj) {
        Object f8;
        AbstractC3159y.i(decoder, "decoder");
        if (obj == null || (f8 = p(obj)) == null) {
            f8 = f();
        }
        int g8 = g(f8);
        w6.c d8 = decoder.d(a());
        if (!d8.z()) {
            while (true) {
                int p8 = d8.p(a());
                if (p8 == -1) {
                    break;
                }
                n(this, d8, g8 + p8, f8, false, 8, null);
            }
        } else {
            l(d8, f8, g8, o(d8, f8));
        }
        d8.a(a());
        return q(f8);
    }

    protected abstract void l(w6.c cVar, Object obj, int i8, int i9);

    protected abstract void m(w6.c cVar, int i8, Object obj, boolean z8);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object p(Object obj);

    protected abstract Object q(Object obj);

    private AbstractC3935a() {
    }
}
