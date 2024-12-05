package B5;

import O5.I;
import a6.InterfaceC1668n;
import b.AbstractC1941c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes5.dex */
public final class n extends AbstractC3256z implements InterfaceC1668n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f964a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s sVar) {
        super(2);
        this.f964a = sVar;
    }

    @Override // a6.InterfaceC1668n
    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        ((Boolean) obj2).booleanValue();
        H6.f j8 = R7.d.f9662a.j();
        List list = j8.f3926c.f3921a;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (intValue == ((H6.d) obj3).f3914a) {
                arrayList.add(obj3);
            }
        }
        s sVar = this.f964a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            H6.d dVar = (H6.d) it.next();
            List list2 = j8.f3925b.f3890h;
            List list3 = dVar.f3919f;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it2 = list3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (AbstractC1941c.a((Number) it2.next(), list2)) {
                        sVar.f969A.set(intValue);
                        break;
                    }
                }
            }
        }
        return I.f8278a;
    }
}
