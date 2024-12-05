package j1;

import D0.C1053c;
import D0.InterfaceC1055e;
import D0.r;
import android.content.Context;

/* loaded from: classes4.dex */
public abstract class h {

    /* loaded from: classes4.dex */
    public interface a {
        String a(Object obj);
    }

    public static C1053c b(String str, String str2) {
        return C1053c.l(AbstractC3180f.a(str, str2), AbstractC3180f.class);
    }

    public static C1053c c(final String str, final a aVar) {
        return C1053c.m(AbstractC3180f.class).b(r.l(Context.class)).f(new D0.h() { // from class: j1.g
            @Override // D0.h
            public final Object a(InterfaceC1055e interfaceC1055e) {
                AbstractC3180f d8;
                d8 = h.d(str, aVar, interfaceC1055e);
                return d8;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC3180f d(String str, a aVar, InterfaceC1055e interfaceC1055e) {
        return AbstractC3180f.a(str, aVar.a((Context) interfaceC1055e.a(Context.class)));
    }
}
