package f3;

import e3.C2777A;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* loaded from: classes4.dex */
public final class s implements InterfaceC4225a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f31918b = new a(null);

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
    public C2777A a(JSONObject json) {
        AbstractC3255y.i(json, "json");
        return new C2777A(new C2777A.a(json.getJSONObject("card_brand_choice").getBoolean("eligible")));
    }
}
