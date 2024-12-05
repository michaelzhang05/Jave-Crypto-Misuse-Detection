package X3;

import L5.s;
import M5.Q;
import java.security.interfaces.ECPublicKey;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class f implements b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f12249b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final U3.c f12250a;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public f(U3.c errorReporter) {
        AbstractC3159y.i(errorReporter, "errorReporter");
        this.f12250a = errorReporter;
    }

    private final ECPublicKey b(Object obj) {
        String str;
        R1.b x8;
        if (obj instanceof Map) {
            AbstractC3159y.g(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            x8 = R1.b.y((Map) obj);
        } else {
            if (obj != null) {
                str = obj.toString();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            x8 = R1.b.x(str);
        }
        ECPublicKey A8 = x8.A();
        AbstractC3159y.h(A8, "toECPublicKey(...)");
        return A8;
    }

    @Override // X3.b
    public X3.a a(JSONObject payloadJson) {
        Object b8;
        AbstractC3159y.i(payloadJson, "payloadJson");
        try {
            s.a aVar = L5.s.f6511b;
            Map m8 = Z1.k.m(payloadJson.toString());
            AbstractC3159y.h(m8, "parse(...)");
            Map y8 = Q.y(m8);
            b8 = L5.s.b(new X3.a(String.valueOf(y8.get("acsURL")), b(y8.get("acsEphemPubKey")), b(y8.get("sdkEphemPubKey"))));
        } catch (Throwable th) {
            s.a aVar2 = L5.s.f6511b;
            b8 = L5.s.b(L5.t.a(th));
        }
        Throwable e8 = L5.s.e(b8);
        if (e8 != null) {
            this.f12250a.i(new IllegalArgumentException("Failed to parse ACS data: " + payloadJson, e8));
        }
        L5.t.b(b8);
        return (X3.a) b8;
    }
}
