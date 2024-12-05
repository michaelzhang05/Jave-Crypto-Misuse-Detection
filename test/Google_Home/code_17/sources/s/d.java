package S;

import O.a;
import O.e;
import P.i;
import Q.C1403t;
import Q.C1406w;
import Q.InterfaceC1405v;
import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC2064d;
import com.google.android.gms.tasks.Task;
import d0.AbstractC2725d;
import q0.C3826j;

/* loaded from: classes3.dex */
public final class d extends O.e implements InterfaceC1405v {

    /* renamed from: k, reason: collision with root package name */
    private static final a.g f9689k;

    /* renamed from: l, reason: collision with root package name */
    private static final a.AbstractC0143a f9690l;

    /* renamed from: m, reason: collision with root package name */
    private static final O.a f9691m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f9692n = 0;

    static {
        a.g gVar = new a.g();
        f9689k = gVar;
        c cVar = new c();
        f9690l = cVar;
        f9691m = new O.a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, C1406w c1406w) {
        super(context, f9691m, c1406w, e.a.f7808c);
    }

    @Override // Q.InterfaceC1405v
    public final Task a(final C1403t c1403t) {
        AbstractC2064d.a a8 = AbstractC2064d.a();
        a8.d(AbstractC2725d.f31126a);
        a8.c(false);
        a8.b(new i() { // from class: S.b
            @Override // P.i
            public final void a(Object obj, Object obj2) {
                int i8 = d.f9692n;
                ((a) ((e) obj).D()).s0(C1403t.this);
                ((C3826j) obj2).c(null);
            }
        });
        return d(a8.a());
    }
}
