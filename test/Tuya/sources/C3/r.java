package c3;

import e3.C2582d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* loaded from: classes4.dex */
public final class r implements InterfaceC3845a {

    /* renamed from: c, reason: collision with root package name */
    private static final a f14941c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f14942b;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public r(Function0 timestampSupplier) {
        AbstractC3159y.i(timestampSupplier, "timestampSupplier");
        this.f14942b = timestampSupplier;
    }

    @Override // w2.InterfaceC3845a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2582d a(JSONObject json) {
        String l8;
        String l9;
        AbstractC3159y.i(json, "json");
        String l10 = v2.e.l(json, "guid");
        if (l10 == null || (l8 = v2.e.l(json, "muid")) == null || (l9 = v2.e.l(json, "sid")) == null) {
            return null;
        }
        return new C2582d(l10, l8, l9, ((Number) this.f14942b.invoke()).longValue());
    }
}
