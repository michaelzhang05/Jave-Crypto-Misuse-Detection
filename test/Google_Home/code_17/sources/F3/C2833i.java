package f3;

import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* renamed from: f3.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2833i implements InterfaceC4225a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f31892b = new a(null);

    /* renamed from: f3.i$a */
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
    public e3.p a(JSONObject json) {
        AbstractC3255y.i(json, "json");
        return new e3.p(y2.e.f40920a.f(json, "exists"), new C2832h().a(json), y2.e.l(json, "error_message"), (String) null, 8, (AbstractC3247p) null);
    }
}
