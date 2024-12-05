package j2;

import g2.EnumC2864d;
import g2.InterfaceC2865e;
import h2.AbstractC2897a;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: j2.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3187g extends AbstractC2897a {

    /* renamed from: a, reason: collision with root package name */
    private EnumC2864d f33921a = EnumC2864d.UNKNOWN;

    /* renamed from: b, reason: collision with root package name */
    private float f33922b;

    /* renamed from: c, reason: collision with root package name */
    private float f33923c;

    /* renamed from: d, reason: collision with root package name */
    private String f33924d;

    @Override // h2.AbstractC2897a, h2.c
    public void e(InterfaceC2865e youTubePlayer, float f8) {
        AbstractC3255y.i(youTubePlayer, "youTubePlayer");
        this.f33922b = f8;
    }

    @Override // h2.AbstractC2897a, h2.c
    public void f(InterfaceC2865e youTubePlayer, EnumC2864d state) {
        AbstractC3255y.i(youTubePlayer, "youTubePlayer");
        AbstractC3255y.i(state, "state");
        this.f33921a = state;
    }

    @Override // h2.AbstractC2897a, h2.c
    public void i(InterfaceC2865e youTubePlayer, String videoId) {
        AbstractC3255y.i(youTubePlayer, "youTubePlayer");
        AbstractC3255y.i(videoId, "videoId");
        this.f33924d = videoId;
    }

    @Override // h2.AbstractC2897a, h2.c
    public void j(InterfaceC2865e youTubePlayer, float f8) {
        AbstractC3255y.i(youTubePlayer, "youTubePlayer");
        this.f33923c = f8;
    }
}
