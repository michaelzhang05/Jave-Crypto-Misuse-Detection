package f3;

import androidx.core.app.NotificationCompat;
import com.stripe.android.model.BankAccount;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* renamed from: f3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2827c implements InterfaceC4225a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f31885b = new a(null);

    /* renamed from: f3.c$a */
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
    public BankAccount a(JSONObject json) {
        AbstractC3255y.i(json, "json");
        return new BankAccount(y2.e.l(json, "id"), y2.e.l(json, "account_holder_name"), BankAccount.Type.f25056b.a(y2.e.l(json, "account_holder_type")), y2.e.l(json, "bank_name"), y2.e.f40920a.g(json, "country"), y2.e.h(json, "currency"), y2.e.l(json, "fingerprint"), y2.e.l(json, "last4"), y2.e.l(json, "routing_number"), BankAccount.Status.f25047b.a(y2.e.l(json, NotificationCompat.CATEGORY_STATUS)));
    }
}
