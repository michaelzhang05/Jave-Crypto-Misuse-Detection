package w2;

import L5.r;
import L5.s;
import L5.t;
import L5.x;
import M5.Q;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import f6.AbstractC2683j;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import org.json.JSONObject;
import r2.f;
import v2.e;

/* loaded from: classes4.dex */
public final class b implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f38996b = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0901b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f38997a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0901b(JSONObject jSONObject) {
            super(1);
            this.f38997a = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r invoke(String str) {
            return x.a(str, this.f38997a.get(str).toString());
        }
    }

    @Override // w2.InterfaceC3845a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f a(JSONObject json) {
        Object b8;
        Map map;
        AbstractC3159y.i(json, "json");
        try {
            s.a aVar = s.f6511b;
            JSONObject jSONObject = json.getJSONObject(CampaignEx.JSON_NATIVE_VIDEO_ERROR);
            String l8 = e.l(jSONObject, "charge");
            String l9 = e.l(jSONObject, "code");
            String l10 = e.l(jSONObject, "decline_code");
            String l11 = e.l(jSONObject, "message");
            String l12 = e.l(jSONObject, "param");
            String l13 = e.l(jSONObject, "type");
            String l14 = e.l(jSONObject, "doc_url");
            JSONObject optJSONObject = jSONObject.optJSONObject("extra_fields");
            if (optJSONObject != null) {
                AbstractC3159y.f(optJSONObject);
                Iterator<String> keys = optJSONObject.keys();
                AbstractC3159y.h(keys, "keys(...)");
                map = Q.u(AbstractC2683j.y(AbstractC2683j.c(keys), new C0901b(optJSONObject)));
            } else {
                map = null;
            }
            b8 = s.b(new f(l13, l11, l9, l12, l10, l8, l14, map));
        } catch (Throwable th) {
            s.a aVar2 = s.f6511b;
            b8 = s.b(t.a(th));
        }
        f fVar = new f(null, "An improperly formatted error response was found.", null, null, null, null, null, null, 253, null);
        if (s.g(b8)) {
            b8 = fVar;
        }
        return (f) b8;
    }
}
