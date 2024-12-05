package t4;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import z3.e;
import z3.h;
import z3.j;

/* loaded from: classes.dex */
public class b implements j {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(String str, z3.c cVar, e eVar) {
        try {
            c.b(str);
            return cVar.h().a(eVar);
        } finally {
            c.a();
        }
    }

    @Override // z3.j
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final z3.c cVar : componentRegistrar.getComponents()) {
            final String i6 = cVar.i();
            if (i6 != null) {
                cVar = cVar.t(new h() { // from class: t4.a
                    @Override // z3.h
                    public final Object a(e eVar) {
                        Object c6;
                        c6 = b.c(i6, cVar, eVar);
                        return c6;
                    }
                });
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }
}
