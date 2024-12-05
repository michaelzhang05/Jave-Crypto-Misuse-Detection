package c3;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* loaded from: classes4.dex */
public final class p implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f14939b = new a(null);

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
    public b3.x a(JSONObject json) {
        AbstractC3159y.i(json, "json");
        return new b3.x(v2.e.l(json, "client_secret"), v2.e.l(json, "id"));
    }
}
