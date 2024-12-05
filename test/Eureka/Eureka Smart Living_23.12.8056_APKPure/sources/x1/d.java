package x1;

import android.content.Context;
import com.google.android.gms.common.api.internal.c;
import l2.i;
import l2.j;
import t1.a;
import t1.d;
import v1.r;
import v1.t;
import v1.u;

/* loaded from: classes.dex */
public final class d extends t1.d implements t {

    /* renamed from: k, reason: collision with root package name */
    private static final a.g f9827k;

    /* renamed from: l, reason: collision with root package name */
    private static final a.AbstractC0138a f9828l;

    /* renamed from: m, reason: collision with root package name */
    private static final t1.a f9829m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f9830n = 0;

    static {
        a.g gVar = new a.g();
        f9827k = gVar;
        c cVar = new c();
        f9828l = cVar;
        f9829m = new t1.a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, u uVar) {
        super(context, f9829m, uVar, d.a.f9292c);
    }

    @Override // v1.t
    public final i a(final r rVar) {
        c.a a6 = com.google.android.gms.common.api.internal.c.a();
        a6.d(d2.d.f6476a);
        a6.c(false);
        a6.b(new u1.i() { // from class: x1.b
            @Override // u1.i
            public final void accept(Object obj, Object obj2) {
                r rVar2 = r.this;
                int i6 = d.f9830n;
                ((a) ((e) obj).C()).z(rVar2);
                ((j) obj2).c(null);
            }
        });
        return c(a6.a());
    }
}
