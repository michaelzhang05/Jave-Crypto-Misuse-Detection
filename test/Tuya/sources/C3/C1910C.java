package c3;

import com.stripe.android.model.SourceTypeModel;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* renamed from: c3.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1910C implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f14898b = new a(null);

    /* renamed from: c3.C$a */
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
    public SourceTypeModel.a a(JSONObject json) {
        AbstractC3159y.i(json, "json");
        return new SourceTypeModel.a(v2.e.l(json, "bank_code"), v2.e.l(json, "branch_code"), v2.e.l(json, "country"), v2.e.l(json, "fingerprint"), v2.e.l(json, "last4"), v2.e.l(json, "mandate_reference"), v2.e.l(json, "mandate_url"));
    }
}
