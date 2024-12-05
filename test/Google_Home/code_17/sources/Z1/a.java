package Z1;

import W1.g;
import W1.i;

/* loaded from: classes4.dex */
public class a implements e {
    @Override // Z1.e
    public void a(Object obj, Appendable appendable, g gVar) {
        gVar.c(appendable);
        boolean z8 = false;
        for (Object obj2 : (Object[]) obj) {
            if (z8) {
                gVar.m(appendable);
            } else {
                z8 = true;
            }
            i.b(obj2, appendable, gVar);
        }
        gVar.d(appendable);
    }
}
