package z1;

import B1.h;
import E1.g;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;
import y1.AbstractC3969b;
import y1.C3981n;

/* renamed from: z1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4014b {

    /* renamed from: a, reason: collision with root package name */
    private final C3981n f40053a;

    private C4014b(C3981n c3981n) {
        this.f40053a = c3981n;
    }

    private void e(float f8) {
        if (f8 > 0.0f) {
        } else {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    private void f(float f8) {
        if (f8 >= 0.0f && f8 <= 1.0f) {
        } else {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public static C4014b g(AbstractC3969b abstractC3969b) {
        C3981n c3981n = (C3981n) abstractC3969b;
        g.b(abstractC3969b, "AdSession is null");
        g.k(c3981n);
        g.h(c3981n);
        g.g(c3981n);
        g.m(c3981n);
        C4014b c4014b = new C4014b(c3981n);
        c3981n.w().m(c4014b);
        return c4014b;
    }

    public void a(EnumC4013a enumC4013a) {
        g.b(enumC4013a, "InteractionType is null");
        g.f(this.f40053a);
        JSONObject jSONObject = new JSONObject();
        E1.c.h(jSONObject, "interactionType", enumC4013a);
        this.f40053a.w().f("adUserInteraction", jSONObject);
    }

    public void b() {
        g.f(this.f40053a);
        this.f40053a.w().d("bufferFinish");
    }

    public void c() {
        g.f(this.f40053a);
        this.f40053a.w().d("bufferStart");
    }

    public void d() {
        g.f(this.f40053a);
        this.f40053a.w().d(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
    }

    public void h() {
        g.f(this.f40053a);
        this.f40053a.w().d("firstQuartile");
    }

    public void i() {
        g.f(this.f40053a);
        this.f40053a.w().d(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
    }

    public void j() {
        g.f(this.f40053a);
        this.f40053a.w().d(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void k() {
        g.f(this.f40053a);
        this.f40053a.w().d(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void l() {
        g.f(this.f40053a);
        this.f40053a.w().d("skipped");
    }

    public void m(float f8, float f9) {
        e(f8);
        f(f9);
        g.f(this.f40053a);
        JSONObject jSONObject = new JSONObject();
        E1.c.h(jSONObject, TypedValues.TransitionType.S_DURATION, Float.valueOf(f8));
        E1.c.h(jSONObject, "mediaPlayerVolume", Float.valueOf(f9));
        E1.c.h(jSONObject, "deviceVolume", Float.valueOf(h.d().c()));
        this.f40053a.w().f("start", jSONObject);
    }

    public void n() {
        g.f(this.f40053a);
        this.f40053a.w().d("thirdQuartile");
    }

    public void o(float f8) {
        f(f8);
        g.f(this.f40053a);
        JSONObject jSONObject = new JSONObject();
        E1.c.h(jSONObject, "mediaPlayerVolume", Float.valueOf(f8));
        E1.c.h(jSONObject, "deviceVolume", Float.valueOf(h.d().c()));
        this.f40053a.w().f("volumeChange", jSONObject);
    }
}
