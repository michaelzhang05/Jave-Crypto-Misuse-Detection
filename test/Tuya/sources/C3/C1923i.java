package c3;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* renamed from: c3.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1923i implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f14917b = new a(null);

    /* renamed from: c3.i$a */
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
    public b3.p a(JSONObject json) {
        AbstractC3159y.i(json, "json");
        return new b3.p(v2.e.f38789a.f(json, "exists"), new C1922h().a(json), v2.e.l(json, "error_message"), (String) null, 8, (AbstractC3151p) null);
    }
}
