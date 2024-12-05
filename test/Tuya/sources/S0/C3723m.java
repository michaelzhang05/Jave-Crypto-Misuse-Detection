package s0;

import P.e;
import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC1940d;
import com.google.android.gms.tasks.Task;
import j0.C3045v;
import r0.C3679j;
import s0.AbstractC3731v;

/* renamed from: s0.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3723m extends P.e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3723m(Context context, AbstractC3731v.a aVar) {
        super(context, AbstractC3731v.f37811a, aVar, e.a.f7846c);
    }

    public Task s(final C3715e c3715e) {
        return e(AbstractC1940d.a().e(23705).b(new Q.i() { // from class: s0.C
            @Override // Q.i
            public final void a(Object obj, Object obj2) {
                ((C3045v) obj).m0(C3715e.this, (C3679j) obj2);
            }
        }).a());
    }

    public Task t(final C3720j c3720j) {
        return g(AbstractC1940d.a().b(new Q.i() { // from class: s0.D
            @Override // Q.i
            public final void a(Object obj, Object obj2) {
                ((C3045v) obj).n0(C3720j.this, (C3679j) obj2);
            }
        }).d(P.f37713c).c(true).e(23707).a());
    }
}
