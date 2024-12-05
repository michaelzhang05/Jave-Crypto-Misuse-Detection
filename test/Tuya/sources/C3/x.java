package c3;

import com.stripe.android.model.u;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* loaded from: classes4.dex */
public final class x implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f14976b = new a(null);

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f14977b = new a(null);

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
        public u.e a(JSONObject json) {
            com.stripe.android.model.o oVar;
            AbstractC3159y.i(json, "json");
            String l8 = v2.e.l(json, "code");
            String l9 = v2.e.l(json, "decline_code");
            String l10 = v2.e.l(json, "doc_url");
            String l11 = v2.e.l(json, "message");
            String l12 = v2.e.l(json, "param");
            JSONObject optJSONObject = json.optJSONObject("payment_method");
            if (optJSONObject != null) {
                oVar = new v().a(optJSONObject);
            } else {
                oVar = null;
            }
            return new u.e(l8, l9, l10, l11, l12, oVar, u.e.c.f24727b.a(v2.e.l(json, "type")));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[LOOP:0: B:16:0x0063->B:18:0x0069, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    @Override // w2.InterfaceC3845a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.stripe.android.model.u a(org.json.JSONObject r24) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.x.a(org.json.JSONObject):com.stripe.android.model.u");
    }
}
