package f3;

import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* renamed from: f3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2826b implements InterfaceC4225a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f31884b = new a(null);

    /* renamed from: f3.b$a */
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
    public com.stripe.android.model.a a(JSONObject json) {
        AbstractC3255y.i(json, "json");
        return new com.stripe.android.model.a(y2.e.l(json, "city"), y2.e.l(json, "country"), y2.e.l(json, "line1"), y2.e.l(json, "line2"), y2.e.l(json, "postal_code"), y2.e.l(json, "state"));
    }
}
