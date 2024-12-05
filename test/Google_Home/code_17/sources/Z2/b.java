package z2;

import O5.r;
import O5.s;
import O5.t;
import O5.x;
import P5.Q;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import i6.AbstractC3001j;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import org.json.JSONObject;
import u2.f;
import y2.e;

/* loaded from: classes4.dex */
public final class b implements InterfaceC4225a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f41119b = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0937b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f41120a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0937b(JSONObject jSONObject) {
            super(1);
            this.f41120a = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r invoke(String str) {
            return x.a(str, this.f41120a.get(str).toString());
        }
    }

    @Override // z2.InterfaceC4225a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f a(JSONObject json) {
        Object b8;
        Map map;
        AbstractC3255y.i(json, "json");
        try {
            s.a aVar = s.f8302b;
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
                AbstractC3255y.f(optJSONObject);
                Iterator<String> keys = optJSONObject.keys();
                AbstractC3255y.h(keys, "keys(...)");
                map = Q.u(AbstractC3001j.y(AbstractC3001j.c(keys), new C0937b(optJSONObject)));
            } else {
                map = null;
            }
            b8 = s.b(new f(l13, l11, l9, l12, l10, l8, l14, map));
        } catch (Throwable th) {
            s.a aVar2 = s.f8302b;
            b8 = s.b(t.a(th));
        }
        f fVar = new f(null, "An improperly formatted error response was found.", null, null, null, null, null, null, 253, null);
        if (s.g(b8)) {
            b8 = fVar;
        }
        return (f) b8;
    }
}
