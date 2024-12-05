package a5;

import android.content.Context;
import android.os.Bundle;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3667g;
import o5.C3678r;

/* renamed from: a5.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1636c {

    /* renamed from: j, reason: collision with root package name */
    public static final a f14106j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f14107a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14108b;

    /* renamed from: c, reason: collision with root package name */
    private String f14109c;

    /* renamed from: d, reason: collision with root package name */
    private String f14110d;

    /* renamed from: e, reason: collision with root package name */
    private long f14111e;

    /* renamed from: f, reason: collision with root package name */
    private int f14112f;

    /* renamed from: g, reason: collision with root package name */
    private long f14113g;

    /* renamed from: h, reason: collision with root package name */
    private int f14114h;

    /* renamed from: i, reason: collision with root package name */
    private long f14115i;

    /* renamed from: a5.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final boolean a(AbstractC1636c abstractC1636c, long j8) {
            if (abstractC1636c != null && abstractC1636c.o() > -1 && abstractC1636c.k() == j8 && System.currentTimeMillis() - abstractC1636c.o() < ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
                return true;
            }
            return false;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public AbstractC1636c(long j8, String packageName, String imageUrl, String type) {
        AbstractC3255y.i(packageName, "packageName");
        AbstractC3255y.i(imageUrl, "imageUrl");
        AbstractC3255y.i(type, "type");
        this.f14107a = j8;
        this.f14108b = packageName;
        this.f14109c = imageUrl;
        this.f14110d = type;
        this.f14111e = -1L;
        this.f14112f = -1;
        this.f14113g = -1L;
        this.f14115i = -1L;
    }

    private final boolean b(Context context) {
        if (new C3667g().z(context, r()) == null) {
            return true;
        }
        return false;
    }

    private final boolean c(Context context) {
        boolean z8;
        boolean z9;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long j8 = this.f14111e;
        if (currentTimeMillis - j8 > 3600 && this.f14114h < 3) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (currentTimeMillis - j8 > 86400) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            this.f14114h = 0;
            t(context);
        }
        if (z8 || z9) {
            return true;
        }
        return false;
    }

    public final boolean a(Context context) {
        AbstractC3255y.i(context, "context");
        if (c(context)) {
            return b(context);
        }
        return false;
    }

    public final boolean d() {
        if ((System.currentTimeMillis() / 1000) - this.f14115i > 86400) {
            return true;
        }
        return false;
    }

    public final void e(Context context) {
        AbstractC3255y.i(context, "context");
        this.f14113g = System.currentTimeMillis();
        t(context);
        Bundle bundle = new Bundle();
        bundle.putString("appId", String.valueOf(k()));
        bundle.putString("type", CampaignEx.JSON_NATIVE_VIDEO_CLICK);
        bundle.putString("adView", this.f14110d);
        new C3678r(context).b("ad", bundle);
    }

    public final void f(Context context) {
        AbstractC3255y.i(context, "context");
        Bundle bundle = new Bundle();
        bundle.putString("appId", String.valueOf(k()));
        bundle.putString("type", CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
        bundle.putString("adView", this.f14110d);
        new C3678r(context).b("ad", bundle);
    }

    public final void g(Context context) {
        AbstractC3255y.i(context, "context");
        Bundle bundle = new Bundle();
        bundle.putString("appId", String.valueOf(k()));
        bundle.putString("type", "imageFailed");
        bundle.putString("adView", this.f14110d);
        new C3678r(context).b("ad", bundle);
    }

    public final void h(Context context) {
        AbstractC3255y.i(context, "context");
        Bundle bundle = new Bundle();
        bundle.putString("appId", String.valueOf(k()));
        bundle.putString("type", "imageLoaded");
        bundle.putString("adView", this.f14110d);
        new C3678r(context).b("ad", bundle);
    }

    public final void i(Context context) {
        AbstractC3255y.i(context, "context");
        this.f14112f = -1;
        t(context);
    }

    public final void j(Context context) {
        AbstractC3255y.i(context, "context");
        this.f14111e = System.currentTimeMillis() / 1000;
        this.f14114h++;
        t(context);
        Bundle bundle = new Bundle();
        bundle.putString("appId", String.valueOf(k()));
        bundle.putString("type", CampaignEx.JSON_NATIVE_VIDOE_IMPRESSION);
        bundle.putString("adView", this.f14110d);
        new C3678r(context).b("ad", bundle);
    }

    public abstract long k();

    public final int l() {
        return this.f14114h;
    }

    public final int m() {
        return this.f14112f;
    }

    public abstract String n();

    public final long o() {
        return this.f14113g;
    }

    public final long p() {
        return this.f14115i;
    }

    public final long q() {
        return this.f14111e;
    }

    public abstract String r();

    public final String s() {
        return this.f14110d;
    }

    public abstract void t(Context context);

    public String toString() {
        return "AdInfo(appId=" + k() + ", packageName=" + r() + ", imageUrl=" + n() + ", lastTimeShown=" + this.f14111e + ", downloadId=" + this.f14112f + ", lastTimeClicked=" + this.f14113g + ", type=" + this.f14110d + ", counterImpressions=" + this.f14114h + ", lastTimeRequested=" + this.f14115i + ')';
    }

    public final void u(int i8) {
        this.f14114h = i8;
    }

    public final void v(int i8) {
        this.f14112f = i8;
    }

    public final void w(Context context, int i8) {
        AbstractC3255y.i(context, "context");
        this.f14112f = i8;
        t(context);
    }

    public final void x(long j8) {
        this.f14113g = j8;
    }

    public final void y(long j8) {
        this.f14115i = j8;
    }

    public final void z(long j8) {
        this.f14111e = j8;
    }
}
