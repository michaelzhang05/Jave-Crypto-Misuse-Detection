package c3;

import b3.M;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* renamed from: c3.G, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1914G implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f14907b = new a(null);

    /* renamed from: c3.G$a */
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
    public M a(JSONObject json) {
        AbstractC3159y.i(json, "json");
        return new M(v2.e.l(json, "statement_descriptor"), v2.e.l(json, "android_appId"), v2.e.l(json, "android_nonceStr"), v2.e.l(json, "android_package"), v2.e.l(json, "android_partnerId"), v2.e.l(json, "android_prepayId"), v2.e.l(json, "android_sign"), v2.e.l(json, "android_timeStamp"), v2.e.l(json, "qr_code_url"));
    }
}
