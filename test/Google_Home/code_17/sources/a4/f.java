package a4;

import O5.s;
import P5.Q;
import java.security.interfaces.ECPublicKey;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class f implements InterfaceC1628b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f13870b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final X3.c f13871a;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public f(X3.c errorReporter) {
        AbstractC3255y.i(errorReporter, "errorReporter");
        this.f13871a = errorReporter;
    }

    private final ECPublicKey b(Object obj) {
        String str;
        U1.b x8;
        if (obj instanceof Map) {
            AbstractC3255y.g(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            x8 = U1.b.y((Map) obj);
        } else {
            if (obj != null) {
                str = obj.toString();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            x8 = U1.b.x(str);
        }
        ECPublicKey z8 = x8.z();
        AbstractC3255y.h(z8, "toECPublicKey(...)");
        return z8;
    }

    @Override // a4.InterfaceC1628b
    public C1627a a(JSONObject payloadJson) {
        Object b8;
        AbstractC3255y.i(payloadJson, "payloadJson");
        try {
            s.a aVar = O5.s.f8302b;
            Map m8 = c2.k.m(payloadJson.toString());
            AbstractC3255y.h(m8, "parse(...)");
            Map y8 = Q.y(m8);
            b8 = O5.s.b(new C1627a(String.valueOf(y8.get("acsURL")), b(y8.get("acsEphemPubKey")), b(y8.get("sdkEphemPubKey"))));
        } catch (Throwable th) {
            s.a aVar2 = O5.s.f8302b;
            b8 = O5.s.b(O5.t.a(th));
        }
        Throwable e8 = O5.s.e(b8);
        if (e8 != null) {
            this.f13871a.l(new IllegalArgumentException("Failed to parse ACS data: " + payloadJson, e8));
        }
        O5.t.b(b8);
        return (C1627a) b8;
    }
}
