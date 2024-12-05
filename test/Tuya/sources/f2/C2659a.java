package f2;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2659a {

    /* renamed from: b, reason: collision with root package name */
    public static final b f31004b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final C2659a f31005c = new C0738a().e(1).c();

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f31006a;

    /* renamed from: f2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0738a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0739a f31007b = new C0739a(null);

        /* renamed from: a, reason: collision with root package name */
        private final JSONObject f31008a = new JSONObject();

        /* renamed from: f2.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0739a {
            private C0739a() {
            }

            public /* synthetic */ C0739a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        public C0738a() {
            a("autoplay", 0);
            a(CampaignEx.JSON_NATIVE_VIDEO_MUTE, 0);
            a("controls", 0);
            a("enablejsapi", 1);
            a("fs", 0);
            b(TtmlNode.ATTR_TTS_ORIGIN, "https://www.youtube.com");
            a("rel", 0);
            a("showinfo", 0);
            a("iv_load_policy", 3);
            a("modestbranding", 1);
            a("cc_load_policy", 0);
        }

        private final void a(String str, int i8) {
            try {
                this.f31008a.put(str, i8);
            } catch (JSONException unused) {
                throw new RuntimeException("Illegal JSON value " + str + ": " + i8);
            }
        }

        private final void b(String str, String str2) {
            try {
                this.f31008a.put(str, str2);
            } catch (JSONException unused) {
                throw new RuntimeException("Illegal JSON value " + str + ": " + str2);
            }
        }

        public final C2659a c() {
            return new C2659a(this.f31008a, null);
        }

        public final C0738a d(int i8) {
            a("cc_load_policy", i8);
            return this;
        }

        public final C0738a e(int i8) {
            a("controls", i8);
            return this;
        }

        public final C0738a f(int i8) {
            a("fs", i8);
            return this;
        }

        public final C0738a g(int i8) {
            a("iv_load_policy", i8);
            return this;
        }

        public final C0738a h(int i8) {
            a("rel", i8);
            return this;
        }
    }

    /* renamed from: f2.a$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final C2659a a() {
            return C2659a.f31005c;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public /* synthetic */ C2659a(JSONObject jSONObject, AbstractC3151p abstractC3151p) {
        this(jSONObject);
    }

    public final String b() {
        String string = this.f31006a.getString(TtmlNode.ATTR_TTS_ORIGIN);
        AbstractC3159y.h(string, "playerOptions.getString(Builder.ORIGIN)");
        return string;
    }

    public String toString() {
        String jSONObject = this.f31006a.toString();
        AbstractC3159y.h(jSONObject, "playerOptions.toString()");
        return jSONObject;
    }

    private C2659a(JSONObject jSONObject) {
        this.f31006a = jSONObject;
    }
}
