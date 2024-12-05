package c3;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* renamed from: c3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1916b implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f14909b = new a(null);

    /* renamed from: c3.b$a */
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
    public com.stripe.android.model.a a(JSONObject json) {
        AbstractC3159y.i(json, "json");
        return new com.stripe.android.model.a(v2.e.l(json, "city"), v2.e.l(json, "country"), v2.e.l(json, "line1"), v2.e.l(json, "line2"), v2.e.l(json, "postal_code"), v2.e.l(json, "state"));
    }
}
