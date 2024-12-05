package A6;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import z6.c;

/* renamed from: A6.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0997p extends AbstractC0976a {

    /* renamed from: a, reason: collision with root package name */
    private final w6.b f589a;

    public /* synthetic */ AbstractC0997p(w6.b bVar, AbstractC3247p abstractC3247p) {
        this(bVar);
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public abstract y6.f a();

    @Override // w6.i
    public void d(z6.f encoder, Object obj) {
        AbstractC3255y.i(encoder, "encoder");
        int j8 = j(obj);
        y6.f a8 = a();
        z6.d j9 = encoder.j(a8, j8);
        Iterator i8 = i(obj);
        for (int i9 = 0; i9 < j8; i9++) {
            j9.C(a(), i9, this.f589a, i8.next());
        }
        j9.b(a8);
    }

    @Override // A6.AbstractC0976a
    protected final void l(z6.c decoder, Object obj, int i8, int i9) {
        AbstractC3255y.i(decoder, "decoder");
        if (i9 >= 0) {
            for (int i10 = 0; i10 < i9; i10++) {
                m(decoder, i8 + i10, obj, false);
            }
            return;
        }
        throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
    }

    @Override // A6.AbstractC0976a
    protected void m(z6.c decoder, int i8, Object obj, boolean z8) {
        AbstractC3255y.i(decoder, "decoder");
        s(obj, i8, c.a.c(decoder, a(), i8, this.f589a, null, 8, null));
    }

    protected abstract void s(Object obj, int i8, Object obj2);

    private AbstractC0997p(w6.b bVar) {
        super(null);
        this.f589a = bVar;
    }
}
