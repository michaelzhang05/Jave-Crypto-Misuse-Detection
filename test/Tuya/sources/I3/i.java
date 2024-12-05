package I3;

import M5.AbstractC1246t;
import com.stripe.android.model.o;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import y3.AbstractC3991f;
import y3.i;

/* loaded from: classes4.dex */
public abstract class i {
    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC3991f.C0916f c(o oVar) {
        return new AbstractC3991f.C0916f(oVar, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(List list, y3.i iVar) {
        i.d dVar;
        Integer num = null;
        if (iVar instanceof i.d) {
            dVar = (i.d) iVar;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            Iterator it = list.iterator();
            int i8 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (AbstractC3159y.d(((o) it.next()).f24408a, ((i.d) iVar).getId())) {
                        break;
                    }
                    i8++;
                } else {
                    i8 = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i8);
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            o oVar = (o) list.get(num.intValue());
            return AbstractC1246t.G0(AbstractC1246t.e(oVar), AbstractC1246t.E0(list, oVar));
        }
        return list;
    }
}
