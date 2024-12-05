package c3;

import b3.C1856A;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* loaded from: classes4.dex */
public final class s implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f14943b = new a(null);

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
    public C1856A a(JSONObject json) {
        AbstractC3159y.i(json, "json");
        return new C1856A(new C1856A.a(json.getJSONObject("card_brand_choice").getBoolean("eligible")));
    }
}
