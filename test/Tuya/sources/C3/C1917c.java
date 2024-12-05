package c3;

import androidx.core.app.NotificationCompat;
import com.stripe.android.model.BankAccount;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* renamed from: c3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1917c implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f14910b = new a(null);

    /* renamed from: c3.c$a */
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
    public BankAccount a(JSONObject json) {
        AbstractC3159y.i(json, "json");
        return new BankAccount(v2.e.l(json, "id"), v2.e.l(json, "account_holder_name"), BankAccount.Type.f24001b.a(v2.e.l(json, "account_holder_type")), v2.e.l(json, "bank_name"), v2.e.f38789a.g(json, "country"), v2.e.h(json, "currency"), v2.e.l(json, "fingerprint"), v2.e.l(json, "last4"), v2.e.l(json, "routing_number"), BankAccount.Status.f23992b.a(v2.e.l(json, NotificationCompat.CATEGORY_STATUS)));
    }
}
