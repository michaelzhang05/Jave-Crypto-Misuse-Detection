package l1;

import B0.C1062c;
import B0.InterfaceC1064e;
import B0.h;
import B0.j;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* renamed from: l1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3164b implements j {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(String str, C1062c c1062c, InterfaceC1064e interfaceC1064e) {
        try {
            AbstractC3165c.b(str);
            return c1062c.h().a(interfaceC1064e);
        } finally {
            AbstractC3165c.a();
        }
    }

    @Override // B0.j
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C1062c c1062c : componentRegistrar.getComponents()) {
            final String i8 = c1062c.i();
            if (i8 != null) {
                c1062c = c1062c.t(new h() { // from class: l1.a
                    @Override // B0.h
                    public final Object a(InterfaceC1064e interfaceC1064e) {
                        Object c8;
                        c8 = C3164b.c(i8, c1062c, interfaceC1064e);
                        return c8;
                    }
                });
            }
            arrayList.add(c1062c);
        }
        return arrayList;
    }
}
