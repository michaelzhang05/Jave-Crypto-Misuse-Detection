package h1;

import B0.C1062c;
import B0.InterfaceC1064e;
import B0.r;
import android.content.Context;

/* loaded from: classes3.dex */
public abstract class h {

    /* loaded from: classes3.dex */
    public interface a {
        String a(Object obj);
    }

    public static C1062c b(String str, String str2) {
        return C1062c.l(f.a(str, str2), f.class);
    }

    public static C1062c c(final String str, final a aVar) {
        return C1062c.m(f.class).b(r.k(Context.class)).f(new B0.h() { // from class: h1.g
            @Override // B0.h
            public final Object a(InterfaceC1064e interfaceC1064e) {
                f d8;
                d8 = h.d(str, aVar, interfaceC1064e);
                return d8;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f d(String str, a aVar, InterfaceC1064e interfaceC1064e) {
        return f.a(str, aVar.a((Context) interfaceC1064e.a(Context.class)));
    }
}
