package A6;

import g6.C2887g;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import z6.c;

/* loaded from: classes5.dex */
public abstract class T extends AbstractC0976a {

    /* renamed from: a, reason: collision with root package name */
    private final w6.b f528a;

    /* renamed from: b, reason: collision with root package name */
    private final w6.b f529b;

    public /* synthetic */ T(w6.b bVar, w6.b bVar2, AbstractC3247p abstractC3247p) {
        this(bVar, bVar2);
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
        int i9 = 0;
        while (i8.hasNext()) {
            Map.Entry entry = (Map.Entry) i8.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i10 = i9 + 1;
            j9.C(a(), i9, r(), key);
            i9 += 2;
            j9.C(a(), i10, s(), value);
        }
        j9.b(a8);
    }

    public final w6.b r() {
        return this.f528a;
    }

    public final w6.b s() {
        return this.f529b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void l(z6.c decoder, Map builder, int i8, int i9) {
        AbstractC3255y.i(decoder, "decoder");
        AbstractC3255y.i(builder, "builder");
        if (i9 >= 0) {
            C2887g r8 = g6.m.r(g6.m.s(0, i9 * 2), 2);
            int e8 = r8.e();
            int f8 = r8.f();
            int j8 = r8.j();
            if ((j8 <= 0 || e8 > f8) && (j8 >= 0 || f8 > e8)) {
                return;
            }
            while (true) {
                m(decoder, i8 + e8, builder, false);
                if (e8 != f8) {
                    e8 += j8;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // A6.AbstractC0976a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void m(z6.c decoder, int i8, Map builder, boolean z8) {
        int i9;
        Object c8;
        AbstractC3255y.i(decoder, "decoder");
        AbstractC3255y.i(builder, "builder");
        Object c9 = c.a.c(decoder, a(), i8, this.f528a, null, 8, null);
        if (z8) {
            i9 = decoder.g(a());
            if (i9 != i8 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i8 + ", returned index for value: " + i9).toString());
            }
        } else {
            i9 = i8 + 1;
        }
        int i10 = i9;
        if (builder.containsKey(c9) && !(this.f529b.a().getKind() instanceof y6.e)) {
            c8 = decoder.x(a(), i10, this.f529b, P5.Q.i(builder, c9));
        } else {
            c8 = c.a.c(decoder, a(), i10, this.f529b, null, 8, null);
        }
        builder.put(c9, c8);
    }

    private T(w6.b bVar, w6.b bVar2) {
        super(null);
        this.f528a = bVar;
        this.f529b = bVar2;
    }
}
