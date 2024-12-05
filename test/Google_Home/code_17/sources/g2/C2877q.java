package g2;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: g2.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2877q {

    /* renamed from: c, reason: collision with root package name */
    public static final a f32026c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final b f32027a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f32028b;

    /* renamed from: g2.q$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: g2.q$b */
    /* loaded from: classes4.dex */
    public interface b {
        void a();

        InterfaceC2865e getInstance();

        Collection getListeners();
    }

    public C2877q(b youTubePlayerOwner) {
        AbstractC3255y.i(youTubePlayerOwner, "youTubePlayerOwner");
        this.f32027a = youTubePlayerOwner;
        this.f32028b = new Handler(Looper.getMainLooper());
    }

    private final EnumC2861a l(String str) {
        if (j6.n.s(str, "small", true)) {
            return EnumC2861a.SMALL;
        }
        if (j6.n.s(str, "medium", true)) {
            return EnumC2861a.MEDIUM;
        }
        if (j6.n.s(str, "large", true)) {
            return EnumC2861a.LARGE;
        }
        if (j6.n.s(str, "hd720", true)) {
            return EnumC2861a.HD720;
        }
        if (j6.n.s(str, "hd1080", true)) {
            return EnumC2861a.HD1080;
        }
        if (j6.n.s(str, "highres", true)) {
            return EnumC2861a.HIGH_RES;
        }
        if (j6.n.s(str, "default", true)) {
            return EnumC2861a.DEFAULT;
        }
        return EnumC2861a.UNKNOWN;
    }

    private final EnumC2862b m(String str) {
        if (j6.n.s(str, "0.25", true)) {
            return EnumC2862b.RATE_0_25;
        }
        if (j6.n.s(str, "0.5", true)) {
            return EnumC2862b.RATE_0_5;
        }
        if (j6.n.s(str, "1", true)) {
            return EnumC2862b.RATE_1;
        }
        if (j6.n.s(str, "1.5", true)) {
            return EnumC2862b.RATE_1_5;
        }
        if (j6.n.s(str, "2", true)) {
            return EnumC2862b.RATE_2;
        }
        return EnumC2862b.UNKNOWN;
    }

    private final EnumC2863c n(String str) {
        if (j6.n.s(str, "2", true)) {
            return EnumC2863c.INVALID_PARAMETER_IN_REQUEST;
        }
        if (j6.n.s(str, CampaignEx.CLICKMODE_ON, true)) {
            return EnumC2863c.HTML_5_PLAYER;
        }
        if (j6.n.s(str, "100", true)) {
            return EnumC2863c.VIDEO_NOT_FOUND;
        }
        if (j6.n.s(str, "101", true)) {
            return EnumC2863c.VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER;
        }
        if (j6.n.s(str, "150", true)) {
            return EnumC2863c.VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER;
        }
        return EnumC2863c.UNKNOWN;
    }

    private final EnumC2864d o(String str) {
        if (j6.n.s(str, "UNSTARTED", true)) {
            return EnumC2864d.UNSTARTED;
        }
        if (j6.n.s(str, "ENDED", true)) {
            return EnumC2864d.ENDED;
        }
        if (j6.n.s(str, "PLAYING", true)) {
            return EnumC2864d.PLAYING;
        }
        if (j6.n.s(str, "PAUSED", true)) {
            return EnumC2864d.PAUSED;
        }
        if (j6.n.s(str, "BUFFERING", true)) {
            return EnumC2864d.BUFFERING;
        }
        if (j6.n.s(str, "CUED", true)) {
            return EnumC2864d.VIDEO_CUED;
        }
        return EnumC2864d.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(C2877q this$0) {
        AbstractC3255y.i(this$0, "this$0");
        Iterator it = this$0.f32027a.getListeners().iterator();
        while (it.hasNext()) {
            ((h2.c) it.next()).d(this$0.f32027a.getInstance());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(C2877q this$0, EnumC2863c playerError) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(playerError, "$playerError");
        Iterator it = this$0.f32027a.getListeners().iterator();
        while (it.hasNext()) {
            ((h2.c) it.next()).h(this$0.f32027a.getInstance(), playerError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(C2877q this$0, EnumC2861a playbackQuality) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(playbackQuality, "$playbackQuality");
        Iterator it = this$0.f32027a.getListeners().iterator();
        while (it.hasNext()) {
            ((h2.c) it.next()).g(this$0.f32027a.getInstance(), playbackQuality);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(C2877q this$0, EnumC2862b playbackRate) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(playbackRate, "$playbackRate");
        Iterator it = this$0.f32027a.getListeners().iterator();
        while (it.hasNext()) {
            ((h2.c) it.next()).b(this$0.f32027a.getInstance(), playbackRate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(C2877q this$0) {
        AbstractC3255y.i(this$0, "this$0");
        Iterator it = this$0.f32027a.getListeners().iterator();
        while (it.hasNext()) {
            ((h2.c) it.next()).c(this$0.f32027a.getInstance());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(C2877q this$0, EnumC2864d playerState) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(playerState, "$playerState");
        Iterator it = this$0.f32027a.getListeners().iterator();
        while (it.hasNext()) {
            ((h2.c) it.next()).f(this$0.f32027a.getInstance(), playerState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(C2877q this$0, float f8) {
        AbstractC3255y.i(this$0, "this$0");
        Iterator it = this$0.f32027a.getListeners().iterator();
        while (it.hasNext()) {
            ((h2.c) it.next()).e(this$0.f32027a.getInstance(), f8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(C2877q this$0, float f8) {
        AbstractC3255y.i(this$0, "this$0");
        Iterator it = this$0.f32027a.getListeners().iterator();
        while (it.hasNext()) {
            ((h2.c) it.next()).j(this$0.f32027a.getInstance(), f8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(C2877q this$0, String videoId) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(videoId, "$videoId");
        Iterator it = this$0.f32027a.getListeners().iterator();
        while (it.hasNext()) {
            ((h2.c) it.next()).i(this$0.f32027a.getInstance(), videoId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(C2877q this$0, float f8) {
        AbstractC3255y.i(this$0, "this$0");
        Iterator it = this$0.f32027a.getListeners().iterator();
        while (it.hasNext()) {
            ((h2.c) it.next()).a(this$0.f32027a.getInstance(), f8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(C2877q this$0) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f32027a.a();
    }

    @JavascriptInterface
    public final boolean sendApiChange() {
        return this.f32028b.post(new Runnable() { // from class: g2.l
            @Override // java.lang.Runnable
            public final void run() {
                C2877q.p(C2877q.this);
            }
        });
    }

    @JavascriptInterface
    public final void sendError(String error) {
        AbstractC3255y.i(error, "error");
        final EnumC2863c n8 = n(error);
        this.f32028b.post(new Runnable() { // from class: g2.o
            @Override // java.lang.Runnable
            public final void run() {
                C2877q.q(C2877q.this, n8);
            }
        });
    }

    @JavascriptInterface
    public final void sendPlaybackQualityChange(String quality) {
        AbstractC3255y.i(quality, "quality");
        final EnumC2861a l8 = l(quality);
        this.f32028b.post(new Runnable() { // from class: g2.h
            @Override // java.lang.Runnable
            public final void run() {
                C2877q.r(C2877q.this, l8);
            }
        });
    }

    @JavascriptInterface
    public final void sendPlaybackRateChange(String rate) {
        AbstractC3255y.i(rate, "rate");
        final EnumC2862b m8 = m(rate);
        this.f32028b.post(new Runnable() { // from class: g2.j
            @Override // java.lang.Runnable
            public final void run() {
                C2877q.s(C2877q.this, m8);
            }
        });
    }

    @JavascriptInterface
    public final boolean sendReady() {
        return this.f32028b.post(new Runnable() { // from class: g2.m
            @Override // java.lang.Runnable
            public final void run() {
                C2877q.t(C2877q.this);
            }
        });
    }

    @JavascriptInterface
    public final void sendStateChange(String state) {
        AbstractC3255y.i(state, "state");
        final EnumC2864d o8 = o(state);
        this.f32028b.post(new Runnable() { // from class: g2.p
            @Override // java.lang.Runnable
            public final void run() {
                C2877q.u(C2877q.this, o8);
            }
        });
    }

    @JavascriptInterface
    public final void sendVideoCurrentTime(String seconds) {
        AbstractC3255y.i(seconds, "seconds");
        try {
            final float parseFloat = Float.parseFloat(seconds);
            this.f32028b.post(new Runnable() { // from class: g2.f
                @Override // java.lang.Runnable
                public final void run() {
                    C2877q.v(C2877q.this, parseFloat);
                }
            });
        } catch (NumberFormatException e8) {
            e8.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void sendVideoDuration(String seconds) {
        AbstractC3255y.i(seconds, "seconds");
        try {
            if (TextUtils.isEmpty(seconds)) {
                seconds = MBridgeConstans.ENDCARD_URL_TYPE_PL;
            }
            final float parseFloat = Float.parseFloat(seconds);
            this.f32028b.post(new Runnable() { // from class: g2.i
                @Override // java.lang.Runnable
                public final void run() {
                    C2877q.w(C2877q.this, parseFloat);
                }
            });
        } catch (NumberFormatException e8) {
            e8.printStackTrace();
        }
    }

    @JavascriptInterface
    public final boolean sendVideoId(final String videoId) {
        AbstractC3255y.i(videoId, "videoId");
        return this.f32028b.post(new Runnable() { // from class: g2.k
            @Override // java.lang.Runnable
            public final void run() {
                C2877q.x(C2877q.this, videoId);
            }
        });
    }

    @JavascriptInterface
    public final void sendVideoLoadedFraction(String fraction) {
        AbstractC3255y.i(fraction, "fraction");
        try {
            final float parseFloat = Float.parseFloat(fraction);
            this.f32028b.post(new Runnable() { // from class: g2.n
                @Override // java.lang.Runnable
                public final void run() {
                    C2877q.y(C2877q.this, parseFloat);
                }
            });
        } catch (NumberFormatException e8) {
            e8.printStackTrace();
        }
    }

    @JavascriptInterface
    public final boolean sendYouTubeIFrameAPIReady() {
        return this.f32028b.post(new Runnable() { // from class: g2.g
            @Override // java.lang.Runnable
            public final void run() {
                C2877q.z(C2877q.this);
            }
        });
    }
}
