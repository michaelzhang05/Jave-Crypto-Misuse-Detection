package c3;

import b3.C1867b;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* loaded from: classes4.dex */
public final class q implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f14940b = new a(null);

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    @Override // w2.InterfaceC3845a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1867b a(JSONObject json) {
        AbstractC3159y.i(json, "json");
        Map k8 = v2.e.f38789a.k(json, "parsed_bank_status");
        if (k8 == null || k8.isEmpty()) {
            k8 = null;
        }
        if (k8 != null) {
            return new C1867b(k8);
        }
        return new C1867b(null, 1, null);
    }
}
