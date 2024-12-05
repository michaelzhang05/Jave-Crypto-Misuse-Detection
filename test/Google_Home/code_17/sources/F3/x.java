package f3;

import com.stripe.android.model.u;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* loaded from: classes4.dex */
public final class x implements InterfaceC4225a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f31951b = new a(null);

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC4225a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f31952b = new a(null);

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
        public u.e a(JSONObject json) {
            com.stripe.android.model.o oVar;
            AbstractC3255y.i(json, "json");
            String l8 = y2.e.l(json, "code");
            String l9 = y2.e.l(json, "decline_code");
            String l10 = y2.e.l(json, "doc_url");
            String l11 = y2.e.l(json, "message");
            String l12 = y2.e.l(json, "param");
            JSONObject optJSONObject = json.optJSONObject("payment_method");
            if (optJSONObject != null) {
                oVar = new v().a(optJSONObject);
            } else {
                oVar = null;
            }
            return new u.e(l8, l9, l10, l11, l12, oVar, u.e.c.f25782b.a(y2.e.l(json, "type")));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[LOOP:0: B:16:0x0063->B:18:0x0069, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    @Override // z2.InterfaceC4225a
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
        throw new UnsupportedOperationException("Method not decompiled: f3.x.a(org.json.JSONObject):com.stripe.android.model.u");
    }
}
