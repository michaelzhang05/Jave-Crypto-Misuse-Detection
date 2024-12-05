package f3;

import e3.C2788b;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* loaded from: classes4.dex */
public final class q implements InterfaceC4225a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f31915b = new a(null);

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    @Override // z2.InterfaceC4225a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2788b a(JSONObject json) {
        AbstractC3255y.i(json, "json");
        Map k8 = y2.e.f40920a.k(json, "parsed_bank_status");
        if (k8 == null || k8.isEmpty()) {
            k8 = null;
        }
        if (k8 != null) {
            return new C2788b(k8);
        }
        return new C2788b(null, 1, null);
    }
}
