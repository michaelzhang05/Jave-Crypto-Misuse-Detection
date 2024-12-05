package o1;

import D0.C1053c;
import D0.InterfaceC1055e;
import D0.h;
import D0.j;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o1.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3512b implements j {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(String str, C1053c c1053c, InterfaceC1055e interfaceC1055e) {
        try {
            AbstractC3513c.b(str);
            return c1053c.h().a(interfaceC1055e);
        } finally {
            AbstractC3513c.a();
        }
    }

    @Override // D0.j
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C1053c c1053c : componentRegistrar.getComponents()) {
            final String i8 = c1053c.i();
            if (i8 != null) {
                c1053c = c1053c.t(new h() { // from class: o1.a
                    @Override // D0.h
                    public final Object a(InterfaceC1055e interfaceC1055e) {
                        Object c8;
                        c8 = C3512b.c(i8, c1053c, interfaceC1055e);
                        return c8;
                    }
                });
            }
            arrayList.add(c1053c);
        }
        return arrayList;
    }
}
