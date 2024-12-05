package f3;

import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* loaded from: classes4.dex */
public final class p implements InterfaceC4225a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f31914b = new a(null);

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
    public e3.x a(JSONObject json) {
        AbstractC3255y.i(json, "json");
        return new e3.x(y2.e.l(json, "client_secret"), y2.e.l(json, "id"));
    }
}
