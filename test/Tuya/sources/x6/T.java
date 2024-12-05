package x6;

import d6.C2563g;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import w6.c;

/* loaded from: classes5.dex */
public abstract class T extends AbstractC3935a {

    /* renamed from: a, reason: collision with root package name */
    private final t6.b f39533a;

    /* renamed from: b, reason: collision with root package name */
    private final t6.b f39534b;

    public /* synthetic */ T(t6.b bVar, t6.b bVar2, AbstractC3151p abstractC3151p) {
        this(bVar, bVar2);
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
        int i9 = 0;
        while (i8.hasNext()) {
            Map.Entry entry = (Map.Entry) i8.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i10 = i9 + 1;
            B8.A(a(), i9, r(), key);
            i9 += 2;
            B8.A(a(), i10, s(), value);
        }
        B8.a(a8);
    }

    public final t6.b r() {
        return this.f39533a;
    }

    public final t6.b s() {
        return this.f39534b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void l(w6.c decoder, Map builder, int i8, int i9) {
        AbstractC3159y.i(decoder, "decoder");
        AbstractC3159y.i(builder, "builder");
        if (i9 >= 0) {
            C2563g r8 = d6.m.r(d6.m.s(0, i9 * 2), 2);
            int g8 = r8.g();
            int h8 = r8.h();
            int i10 = r8.i();
            if ((i10 <= 0 || g8 > h8) && (i10 >= 0 || h8 > g8)) {
                return;
            }
            while (true) {
                m(decoder, i8 + g8, builder, false);
                if (g8 != h8) {
                    g8 += i10;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x6.AbstractC3935a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void m(w6.c decoder, int i8, Map builder, boolean z8) {
        int i9;
        Object c8;
        AbstractC3159y.i(decoder, "decoder");
        AbstractC3159y.i(builder, "builder");
        Object c9 = c.a.c(decoder, a(), i8, this.f39533a, null, 8, null);
        if (z8) {
            i9 = decoder.p(a());
            if (i9 != i8 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i8 + ", returned index for value: " + i9).toString());
            }
        } else {
            i9 = i8 + 1;
        }
        int i10 = i9;
        if (builder.containsKey(c9) && !(this.f39534b.a().getKind() instanceof v6.e)) {
            c8 = decoder.r(a(), i10, this.f39534b, M5.Q.i(builder, c9));
        } else {
            c8 = c.a.c(decoder, a(), i10, this.f39534b, null, 8, null);
        }
        builder.put(c9, c8);
    }

    private T(t6.b bVar, t6.b bVar2) {
        super(null);
        this.f39533a = bVar;
        this.f39534b = bVar2;
    }
}
