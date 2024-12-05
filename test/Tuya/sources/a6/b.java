package A6;

import M5.AbstractC1246t;
import e6.InterfaceC2643c;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import t6.InterfaceC3796a;
import t6.i;

/* loaded from: classes5.dex */
public abstract class b {
    private b() {
    }

    public static /* synthetic */ t6.b c(b bVar, InterfaceC2643c interfaceC2643c, List list, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                list = AbstractC1246t.m();
            }
            return bVar.b(interfaceC2643c, list);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
    }

    public abstract void a(d dVar);

    public abstract t6.b b(InterfaceC2643c interfaceC2643c, List list);

    public abstract InterfaceC3796a d(InterfaceC2643c interfaceC2643c, String str);

    public abstract i e(InterfaceC2643c interfaceC2643c, Object obj);

    public /* synthetic */ b(AbstractC3151p abstractC3151p) {
        this();
    }
}
