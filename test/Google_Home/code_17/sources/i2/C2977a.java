package i2;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: i2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2977a {

    /* renamed from: b, reason: collision with root package name */
    public static final b f32867b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final C2977a f32868c = new C0764a().e(1).c();

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f32869a;

    /* renamed from: i2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0764a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0765a f32870b = new C0765a(null);

        /* renamed from: a, reason: collision with root package name */
        private final JSONObject f32871a = new JSONObject();

        /* renamed from: i2.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0765a {
            private C0765a() {
            }

            public /* synthetic */ C0765a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        public C0764a() {
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
                this.f32871a.put(str, i8);
            } catch (JSONException unused) {
                throw new RuntimeException("Illegal JSON value " + str + ": " + i8);
            }
        }

        private final void b(String str, String str2) {
            try {
                this.f32871a.put(str, str2);
            } catch (JSONException unused) {
                throw new RuntimeException("Illegal JSON value " + str + ": " + str2);
            }
        }

        public final C2977a c() {
            return new C2977a(this.f32871a, null);
        }

        public final C0764a d(int i8) {
            a("cc_load_policy", i8);
            return this;
        }

        public final C0764a e(int i8) {
            a("controls", i8);
            return this;
        }

        public final C0764a f(int i8) {
            a("fs", i8);
            return this;
        }

        public final C0764a g(int i8) {
            a("iv_load_policy", i8);
            return this;
        }

        public final C0764a h(int i8) {
            a("rel", i8);
            return this;
        }
    }

    /* renamed from: i2.a$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final C2977a a() {
            return C2977a.f32868c;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public /* synthetic */ C2977a(JSONObject jSONObject, AbstractC3247p abstractC3247p) {
        this(jSONObject);
    }

    public final String b() {
        String string = this.f32869a.getString(TtmlNode.ATTR_TTS_ORIGIN);
        AbstractC3255y.h(string, "playerOptions.getString(Builder.ORIGIN)");
        return string;
    }

    public String toString() {
        String jSONObject = this.f32869a.toString();
        AbstractC3255y.h(jSONObject, "playerOptions.toString()");
        return jSONObject;
    }

    private C2977a(JSONObject jSONObject) {
        this.f32869a = jSONObject;
    }
}
