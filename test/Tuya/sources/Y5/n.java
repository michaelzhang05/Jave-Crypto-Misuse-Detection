package y5;

import L5.I;
import b.AbstractC1832c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes5.dex */
public final class n extends AbstractC3160z implements X5.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f39920a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s sVar) {
        super(2);
        this.f39920a = sVar;
    }

    @Override // X5.n
    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        ((Boolean) obj2).booleanValue();
        E6.f j8 = O7.d.f7806a.j();
        List list = j8.f2376c.f2371a;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (intValue == ((E6.d) obj3).f2364a) {
                arrayList.add(obj3);
            }
        }
        s sVar = this.f39920a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            E6.d dVar = (E6.d) it.next();
            List list2 = j8.f2375b.f2340h;
            List list3 = dVar.f2369f;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it2 = list3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (AbstractC1832c.a((Number) it2.next(), list2)) {
                        sVar.f39925A.set(intValue);
                        break;
                    }
                }
            }
        }
        return I.f6487a;
    }
}
