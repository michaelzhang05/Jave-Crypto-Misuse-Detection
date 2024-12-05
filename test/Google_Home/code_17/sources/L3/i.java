package L3;

import B3.f;
import B3.i;
import P5.AbstractC1378t;
import com.stripe.android.model.o;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class i {
    /* JADX INFO: Access modifiers changed from: private */
    public static final f.C0009f c(o oVar) {
        return new f.C0009f(oVar, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(List list, B3.i iVar) {
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
                    if (AbstractC3255y.d(((o) it.next()).f25463a, ((i.d) iVar).getId())) {
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
            return AbstractC1378t.G0(AbstractC1378t.e(oVar), AbstractC1378t.E0(list, oVar));
        }
        return list;
    }
}
