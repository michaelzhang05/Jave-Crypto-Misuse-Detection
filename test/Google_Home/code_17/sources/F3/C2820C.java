package f3;

import com.stripe.android.model.SourceTypeModel;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* renamed from: f3.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2820C implements InterfaceC4225a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f31873b = new a(null);

    /* renamed from: f3.C$a */
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
    public SourceTypeModel.a a(JSONObject json) {
        AbstractC3255y.i(json, "json");
        return new SourceTypeModel.a(y2.e.l(json, "bank_code"), y2.e.l(json, "branch_code"), y2.e.l(json, "country"), y2.e.l(json, "fingerprint"), y2.e.l(json, "last4"), y2.e.l(json, "mandate_reference"), y2.e.l(json, "mandate_url"));
    }
}
