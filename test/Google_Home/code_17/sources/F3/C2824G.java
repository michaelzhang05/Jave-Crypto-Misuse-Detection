package f3;

import e3.M;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* renamed from: f3.G, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2824G implements InterfaceC4225a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f31882b = new a(null);

    /* renamed from: f3.G$a */
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
    public M a(JSONObject json) {
        AbstractC3255y.i(json, "json");
        return new M(y2.e.l(json, "statement_descriptor"), y2.e.l(json, "android_appId"), y2.e.l(json, "android_nonceStr"), y2.e.l(json, "android_package"), y2.e.l(json, "android_partnerId"), y2.e.l(json, "android_prepayId"), y2.e.l(json, "android_sign"), y2.e.l(json, "android_timeStamp"), y2.e.l(json, "qr_code_url"));
    }
}
