package d2;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: d2.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2553q {

    /* renamed from: c, reason: collision with root package name */
    public static final a f30146c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final b f30147a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f30148b;

    /* renamed from: d2.q$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: d2.q$b */
    /* loaded from: classes4.dex */
    public interface b {
        void a();

        InterfaceC2541e getInstance();

        Collection getListeners();
    }

    public C2553q(b youTubePlayerOwner) {
        AbstractC3159y.i(youTubePlayerOwner, "youTubePlayerOwner");
        this.f30147a = youTubePlayerOwner;
        this.f30148b = new Handler(Looper.getMainLooper());
    }

    private final EnumC2537a l(String str) {
        if (g6.n.s(str, "small", true)) {
            return EnumC2537a.SMALL;
        }
        if (g6.n.s(str, "medium", true)) {
            return EnumC2537a.MEDIUM;
        }
        if (g6.n.s(str, "large", true)) {
            return EnumC2537a.LARGE;
        }
        if (g6.n.s(str, "hd720", true)) {
            return EnumC2537a.HD720;
        }
        if (g6.n.s(str, "hd1080", true)) {
            return EnumC2537a.HD1080;
        }
        if (g6.n.s(str, "highres", true)) {
            return EnumC2537a.HIGH_RES;
        }
        if (g6.n.s(str, "default", true)) {
            return EnumC2537a.DEFAULT;
        }
        return EnumC2537a.UNKNOWN;
    }

    private final EnumC2538b m(String str) {
        if (g6.n.s(str, "0.25", true)) {
            return EnumC2538b.RATE_0_25;
        }
        if (g6.n.s(str, "0.5", true)) {
            return EnumC2538b.RATE_0_5;
        }
        if (g6.n.s(str, "1", true)) {
            return EnumC2538b.RATE_1;
        }
        if (g6.n.s(str, "1.5", true)) {
            return EnumC2538b.RATE_1_5;
        }
        if (g6.n.s(str, "2", true)) {
            return EnumC2538b.RATE_2;
        }
        return EnumC2538b.UNKNOWN;
    }

    private final EnumC2539c n(String str) {
        if (g6.n.s(str, "2", true)) {
            return EnumC2539c.INVALID_PARAMETER_IN_REQUEST;
        }
        if (g6.n.s(str, CampaignEx.CLICKMODE_ON, true)) {
            return EnumC2539c.HTML_5_PLAYER;
        }
        if (g6.n.s(str, "100", true)) {
            return EnumC2539c.VIDEO_NOT_FOUND;
        }
        if (g6.n.s(str, "101", true)) {
            return EnumC2539c.VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER;
        }
        if (g6.n.s(str, "150", true)) {
            return EnumC2539c.VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER;
        }
        return EnumC2539c.UNKNOWN;
    }

    private final EnumC2540d o(String str) {
        if (g6.n.s(str, "UNSTARTED", true)) {
            return EnumC2540d.UNSTARTED;
        }
        if (g6.n.s(str, "ENDED", true)) {
            return EnumC2540d.ENDED;
        }
        if (g6.n.s(str, "PLAYING", true)) {
            return EnumC2540d.PLAYING;
        }
        if (g6.n.s(str, "PAUSED", true)) {
            return EnumC2540d.PAUSED;
        }
        if (g6.n.s(str, "BUFFERING", true)) {
            return EnumC2540d.BUFFERING;
        }
        if (g6.n.s(str, "CUED", true)) {
            return EnumC2540d.VIDEO_CUED;
        }
        return EnumC2540d.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(C2553q this$0) {
        AbstractC3159y.i(this$0, "this$0");
        Iterator it = this$0.f30147a.getListeners().iterator();
        while (it.hasNext()) {
            ((e2.c) it.next()).f(this$0.f30147a.getInstance());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(C2553q this$0, EnumC2539c playerError) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(playerError, "$playerError");
        Iterator it = this$0.f30147a.getListeners().iterator();
        while (it.hasNext()) {
            ((e2.c) it.next()).c(this$0.f30147a.getInstance(), playerError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(C2553q this$0, EnumC2537a playbackQuality) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(playbackQuality, "$playbackQuality");
        Iterator it = this$0.f30147a.getListeners().iterator();
        while (it.hasNext()) {
            ((e2.c) it.next()).b(this$0.f30147a.getInstance(), playbackQuality);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(C2553q this$0, EnumC2538b playbackRate) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(playbackRate, "$playbackRate");
        Iterator it = this$0.f30147a.getListeners().iterator();
        while (it.hasNext()) {
            ((e2.c) it.next()).d(this$0.f30147a.getInstance(), playbackRate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(C2553q this$0) {
        AbstractC3159y.i(this$0, "this$0");
        Iterator it = this$0.f30147a.getListeners().iterator();
        while (it.hasNext()) {
            ((e2.c) it.next()).g(this$0.f30147a.getInstance());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(C2553q this$0, EnumC2540d playerState) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(playerState, "$playerState");
        Iterator it = this$0.f30147a.getListeners().iterator();
        while (it.hasNext()) {
            ((e2.c) it.next()).j(this$0.f30147a.getInstance(), playerState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(C2553q this$0, float f8) {
        AbstractC3159y.i(this$0, "this$0");
        Iterator it = this$0.f30147a.getListeners().iterator();
        while (it.hasNext()) {
            ((e2.c) it.next()).i(this$0.f30147a.getInstance(), f8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(C2553q this$0, float f8) {
        AbstractC3159y.i(this$0, "this$0");
        Iterator it = this$0.f30147a.getListeners().iterator();
        while (it.hasNext()) {
            ((e2.c) it.next()).a(this$0.f30147a.getInstance(), f8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(C2553q this$0, String videoId) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(videoId, "$videoId");
        Iterator it = this$0.f30147a.getListeners().iterator();
        while (it.hasNext()) {
            ((e2.c) it.next()).h(this$0.f30147a.getInstance(), videoId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(C2553q this$0, float f8) {
        AbstractC3159y.i(this$0, "this$0");
        Iterator it = this$0.f30147a.getListeners().iterator();
        while (it.hasNext()) {
            ((e2.c) it.next()).e(this$0.f30147a.getInstance(), f8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(C2553q this$0) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f30147a.a();
    }

    @JavascriptInterface
    public final boolean sendApiChange() {
        return this.f30148b.post(new Runnable() { // from class: d2.l
            @Override // java.lang.Runnable
            public final void run() {
                C2553q.p(C2553q.this);
            }
        });
    }

    @JavascriptInterface
    public final void sendError(String error) {
        AbstractC3159y.i(error, "error");
        final EnumC2539c n8 = n(error);
        this.f30148b.post(new Runnable() { // from class: d2.o
            @Override // java.lang.Runnable
            public final void run() {
                C2553q.q(C2553q.this, n8);
            }
        });
    }

    @JavascriptInterface
    public final void sendPlaybackQualityChange(String quality) {
        AbstractC3159y.i(quality, "quality");
        final EnumC2537a l8 = l(quality);
        this.f30148b.post(new Runnable() { // from class: d2.h
            @Override // java.lang.Runnable
            public final void run() {
                C2553q.r(C2553q.this, l8);
            }
        });
    }

    @JavascriptInterface
    public final void sendPlaybackRateChange(String rate) {
        AbstractC3159y.i(rate, "rate");
        final EnumC2538b m8 = m(rate);
        this.f30148b.post(new Runnable() { // from class: d2.j
            @Override // java.lang.Runnable
            public final void run() {
                C2553q.s(C2553q.this, m8);
            }
        });
    }

    @JavascriptInterface
    public final boolean sendReady() {
        return this.f30148b.post(new Runnable() { // from class: d2.m
            @Override // java.lang.Runnable
            public final void run() {
                C2553q.t(C2553q.this);
            }
        });
    }

    @JavascriptInterface
    public final void sendStateChange(String state) {
        AbstractC3159y.i(state, "state");
        final EnumC2540d o8 = o(state);
        this.f30148b.post(new Runnable() { // from class: d2.p
            @Override // java.lang.Runnable
            public final void run() {
                C2553q.u(C2553q.this, o8);
            }
        });
    }

    @JavascriptInterface
    public final void sendVideoCurrentTime(String seconds) {
        AbstractC3159y.i(seconds, "seconds");
        try {
            final float parseFloat = Float.parseFloat(seconds);
            this.f30148b.post(new Runnable() { // from class: d2.f
                @Override // java.lang.Runnable
                public final void run() {
                    C2553q.v(C2553q.this, parseFloat);
                }
            });
        } catch (NumberFormatException e8) {
            e8.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void sendVideoDuration(String seconds) {
        AbstractC3159y.i(seconds, "seconds");
        try {
            if (TextUtils.isEmpty(seconds)) {
                seconds = MBridgeConstans.ENDCARD_URL_TYPE_PL;
            }
            final float parseFloat = Float.parseFloat(seconds);
            this.f30148b.post(new Runnable() { // from class: d2.i
                @Override // java.lang.Runnable
                public final void run() {
                    C2553q.w(C2553q.this, parseFloat);
                }
            });
        } catch (NumberFormatException e8) {
            e8.printStackTrace();
        }
    }

    @JavascriptInterface
    public final boolean sendVideoId(final String videoId) {
        AbstractC3159y.i(videoId, "videoId");
        return this.f30148b.post(new Runnable() { // from class: d2.k
            @Override // java.lang.Runnable
            public final void run() {
                C2553q.x(C2553q.this, videoId);
            }
        });
    }

    @JavascriptInterface
    public final void sendVideoLoadedFraction(String fraction) {
        AbstractC3159y.i(fraction, "fraction");
        try {
            final float parseFloat = Float.parseFloat(fraction);
            this.f30148b.post(new Runnable() { // from class: d2.n
                @Override // java.lang.Runnable
                public final void run() {
                    C2553q.y(C2553q.this, parseFloat);
                }
            });
        } catch (NumberFormatException e8) {
            e8.printStackTrace();
        }
    }

    @JavascriptInterface
    public final boolean sendYouTubeIFrameAPIReady() {
        return this.f30148b.post(new Runnable() { // from class: d2.g
            @Override // java.lang.Runnable
            public final void run() {
                C2553q.z(C2553q.this);
            }
        });
    }
}
