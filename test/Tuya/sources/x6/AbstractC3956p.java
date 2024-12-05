package x6;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import w6.c;

/* renamed from: x6.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3956p extends AbstractC3935a {

    /* renamed from: a, reason: collision with root package name */
    private final t6.b f39594a;

    public /* synthetic */ AbstractC3956p(t6.b bVar, AbstractC3151p abstractC3151p) {
        this(bVar);
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public abstract v6.f a();

    @Override // t6.i
    public void e(w6.f encoder, Object obj) {
        AbstractC3159y.i(encoder, "encoder");
        int j8 = j(obj);
        v6.f a8 = a();
        w6.d B8 = encoder.B(a8, j8);
        Iterator i8 = i(obj);
        for (int i9 = 0; i9 < j8; i9++) {
            B8.A(a(), i9, this.f39594a, i8.next());
        }
        B8.a(a8);
    }

    @Override // x6.AbstractC3935a
    protected final void l(w6.c decoder, Object obj, int i8, int i9) {
        AbstractC3159y.i(decoder, "decoder");
        if (i9 >= 0) {
            for (int i10 = 0; i10 < i9; i10++) {
                m(decoder, i8 + i10, obj, false);
            }
            return;
        }
        throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
    }

    @Override // x6.AbstractC3935a
    protected void m(w6.c decoder, int i8, Object obj, boolean z8) {
        AbstractC3159y.i(decoder, "decoder");
        s(obj, i8, c.a.c(decoder, a(), i8, this.f39594a, null, 8, null));
    }

    protected abstract void s(Object obj, int i8, Object obj2);

    private AbstractC3956p(t6.b bVar) {
        super(null);
        this.f39594a = bVar;
    }
}
