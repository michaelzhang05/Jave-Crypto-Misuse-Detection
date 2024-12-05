package V3;

import P5.AbstractC1378t;
import V3.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class d implements m {

    /* renamed from: b, reason: collision with root package name */
    private static final a f10682b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final List f10683c = AbstractC1378t.p(new l.c(), new l.d(), new l.b(), new l.a(false, 1, null), new l.e());

    /* renamed from: a, reason: collision with root package name */
    private final List f10684a;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public d(List securityChecks) {
        AbstractC3255y.i(securityChecks, "securityChecks");
        this.f10684a = securityChecks;
    }

    @Override // V3.m
    public List a() {
        List list = this.f10684a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((l) obj).a()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1378t.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((l) it.next()).b());
        }
        return arrayList2;
    }

    public /* synthetic */ d(List list, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? f10683c : list);
    }
}
