package c3;

import androidx.autofill.HintConstants;
import com.stripe.android.model.n;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* loaded from: classes4.dex */
public final class u implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f14955b = new a(null);

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
        private static final a f14956b = new a(null);

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
        public n.g a(JSONObject json) {
            com.stripe.android.model.o oVar;
            AbstractC3159y.i(json, "json");
            String l8 = v2.e.l(json, "charge");
            String l9 = v2.e.l(json, "code");
            String l10 = v2.e.l(json, "decline_code");
            String l11 = v2.e.l(json, "doc_url");
            String l12 = v2.e.l(json, "message");
            String l13 = v2.e.l(json, "param");
            JSONObject optJSONObject = json.optJSONObject("payment_method");
            if (optJSONObject != null) {
                oVar = new v().a(optJSONObject);
            } else {
                oVar = null;
            }
            return new n.g(l8, l9, l10, l11, l12, l13, oVar, n.g.c.f24389b.a(v2.e.l(json, "type")));
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f14957b = new a(null);

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
        public n.h a(JSONObject json) {
            com.stripe.android.model.a aVar;
            AbstractC3159y.i(json, "json");
            JSONObject optJSONObject = json.optJSONObject("address");
            if (optJSONObject == null || (aVar = new C1916b().a(optJSONObject)) == null) {
                aVar = new com.stripe.android.model.a(null, null, null, null, null, null, 63, null);
            }
            return new n.h(aVar, v2.e.l(json, "carrier"), v2.e.l(json, "name"), v2.e.l(json, HintConstants.AUTOFILL_HINT_PHONE), v2.e.l(json, "tracking_number"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013b A[LOOP:0: B:28:0x0135->B:30:0x013b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    @Override // w2.InterfaceC3845a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.stripe.android.model.n a(org.json.JSONObject r31) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.u.a(org.json.JSONObject):com.stripe.android.model.n");
    }
}
