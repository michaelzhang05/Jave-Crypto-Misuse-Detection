package S3;

import M5.AbstractC1246t;
import S3.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class d implements m {

    /* renamed from: b, reason: collision with root package name */
    private static final a f9039b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final List f9040c = AbstractC1246t.p(new l.c(), new l.d(), new l.b(), new l.a(false, 1, null), new l.e());

    /* renamed from: a, reason: collision with root package name */
    private final List f9041a;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public d(List securityChecks) {
        AbstractC3159y.i(securityChecks, "securityChecks");
        this.f9041a = securityChecks;
    }

    @Override // S3.m
    public List a() {
        List list = this.f9041a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((l) obj).a()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1246t.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((l) it.next()).b());
        }
        return arrayList2;
    }

    public /* synthetic */ d(List list, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? f9040c : list);
    }
}
