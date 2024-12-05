package o2;

import O5.x;
import P5.AbstractC1378t;
import P5.Q;
import e3.C2787a;
import e3.C2789c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;
import o2.f;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f35827a = new g();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f35828b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f35829c;

    static {
        C2789c c2789c = new C2789c("4000000000000000", "4999999999999999");
        C2787a.EnumC0723a enumC0723a = C2787a.EnumC0723a.f31412j;
        f35828b = Q.k(x.a("4000002500001001", AbstractC1378t.p(new C2787a(c2789c, 16, enumC0723a, null, 8, null), new C2787a(new C2789c("4000000000000000", "4999999999999999"), 16, C2787a.EnumC0723a.f31405c, null, 8, null))), x.a("5555552500001001", AbstractC1378t.p(new C2787a(new C2789c("5100000000000000", "5599999999999999"), 16, enumC0723a, null, 8, null), new C2787a(new C2789c("5100000000000000", "5599999999999999"), 16, C2787a.EnumC0723a.f31406d, null, 8, null))));
        f35829c = 8;
    }

    private g() {
    }

    public final List a(f.b cardNumber) {
        List list;
        AbstractC3255y.i(cardNumber, "cardNumber");
        Map map = f35828b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (j6.n.C(cardNumber.g(), (String) entry.getKey(), false, 2, null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Map.Entry entry2 = (Map.Entry) AbstractC1378t.L0(linkedHashMap.entrySet());
        if (entry2 != null) {
            list = (List) entry2.getValue();
        }
        if (list == null) {
            return AbstractC1378t.m();
        }
        return list;
    }
}
