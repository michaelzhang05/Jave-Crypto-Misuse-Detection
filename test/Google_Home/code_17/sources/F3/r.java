package f3;

import h3.C2902d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* loaded from: classes4.dex */
public final class r implements InterfaceC4225a {

    /* renamed from: c, reason: collision with root package name */
    private static final a f31916c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f31917b;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public r(Function0 timestampSupplier) {
        AbstractC3255y.i(timestampSupplier, "timestampSupplier");
        this.f31917b = timestampSupplier;
    }

    @Override // z2.InterfaceC4225a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2902d a(JSONObject json) {
        String l8;
        String l9;
        AbstractC3255y.i(json, "json");
        String l10 = y2.e.l(json, "guid");
        if (l10 == null || (l8 = y2.e.l(json, "muid")) == null || (l9 = y2.e.l(json, "sid")) == null) {
            return null;
        }
        return new C2902d(l10, l8, l9, ((Number) this.f31917b.invoke()).longValue());
    }
}
