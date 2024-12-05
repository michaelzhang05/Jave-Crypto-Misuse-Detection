package D6;

import P5.AbstractC1378t;
import h6.InterfaceC2963c;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import w6.InterfaceC4150a;
import w6.i;

/* loaded from: classes5.dex */
public abstract class b {
    private b() {
    }

    public static /* synthetic */ w6.b c(b bVar, InterfaceC2963c interfaceC2963c, List list, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                list = AbstractC1378t.m();
            }
            return bVar.b(interfaceC2963c, list);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
    }

    public abstract void a(d dVar);

    public abstract w6.b b(InterfaceC2963c interfaceC2963c, List list);

    public abstract InterfaceC4150a d(InterfaceC2963c interfaceC2963c, String str);

    public abstract i e(InterfaceC2963c interfaceC2963c, Object obj);

    public /* synthetic */ b(AbstractC3247p abstractC3247p) {
        this();
    }
}
