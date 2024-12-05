package j2;

import g2.EnumC2863c;
import g2.EnumC2864d;
import g2.InterfaceC2865e;
import h2.AbstractC2897a;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: j2.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3186f extends AbstractC2897a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f33915a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f33916b;

    /* renamed from: c, reason: collision with root package name */
    private EnumC2863c f33917c;

    /* renamed from: d, reason: collision with root package name */
    private String f33918d;

    /* renamed from: e, reason: collision with root package name */
    private float f33919e;

    /* renamed from: j2.f$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33920a;

        static {
            int[] iArr = new int[EnumC2864d.values().length];
            try {
                iArr[EnumC2864d.ENDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2864d.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2864d.PLAYING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f33920a = iArr;
        }
    }

    @Override // h2.AbstractC2897a, h2.c
    public void e(InterfaceC2865e youTubePlayer, float f8) {
        AbstractC3255y.i(youTubePlayer, "youTubePlayer");
        this.f33919e = f8;
    }

    @Override // h2.AbstractC2897a, h2.c
    public void f(InterfaceC2865e youTubePlayer, EnumC2864d state) {
        AbstractC3255y.i(youTubePlayer, "youTubePlayer");
        AbstractC3255y.i(state, "state");
        int i8 = a.f33920a[state.ordinal()];
        if (i8 != 1 && i8 != 2) {
            if (i8 == 3) {
                this.f33916b = true;
                return;
            }
            return;
        }
        this.f33916b = false;
    }

    @Override // h2.AbstractC2897a, h2.c
    public void h(InterfaceC2865e youTubePlayer, EnumC2863c error) {
        AbstractC3255y.i(youTubePlayer, "youTubePlayer");
        AbstractC3255y.i(error, "error");
        if (error == EnumC2863c.HTML_5_PLAYER) {
            this.f33917c = error;
        }
    }

    @Override // h2.AbstractC2897a, h2.c
    public void i(InterfaceC2865e youTubePlayer, String videoId) {
        AbstractC3255y.i(youTubePlayer, "youTubePlayer");
        AbstractC3255y.i(videoId, "videoId");
        this.f33918d = videoId;
    }

    public final void k() {
        this.f33915a = true;
    }

    public final void l() {
        this.f33915a = false;
    }

    public final void m(InterfaceC2865e youTubePlayer) {
        AbstractC3255y.i(youTubePlayer, "youTubePlayer");
        String str = this.f33918d;
        if (str == null) {
            return;
        }
        boolean z8 = this.f33916b;
        if (z8 && this.f33917c == EnumC2863c.HTML_5_PLAYER) {
            AbstractC3188h.a(youTubePlayer, this.f33915a, str, this.f33919e);
        } else if (!z8 && this.f33917c == EnumC2863c.HTML_5_PLAYER) {
            youTubePlayer.c(str, this.f33919e);
        }
        this.f33917c = null;
    }
}
