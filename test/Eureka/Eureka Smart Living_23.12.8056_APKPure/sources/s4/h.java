package s4;

import android.content.Context;
import z3.r;

/* loaded from: classes.dex */
public abstract class h {

    /* loaded from: classes.dex */
    public interface a {
        String a(Object obj);
    }

    public static z3.c b(String str, String str2) {
        return z3.c.l(f.a(str, str2), f.class);
    }

    public static z3.c c(final String str, final a aVar) {
        return z3.c.m(f.class).b(r.i(Context.class)).e(new z3.h() { // from class: s4.g
            @Override // z3.h
            public final Object a(z3.e eVar) {
                f d6;
                d6 = h.d(str, aVar, eVar);
                return d6;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f d(String str, a aVar, z3.e eVar) {
        return f.a(str, aVar.a((Context) eVar.a(Context.class)));
    }
}
