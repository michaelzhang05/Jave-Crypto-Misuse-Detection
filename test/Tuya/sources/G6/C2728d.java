package g6;

import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: g6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2728d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2728d f31292a = new C2728d();

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f31293b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f31294c;

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f31295d;

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f31296e;

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f31297f;

    /* renamed from: g, reason: collision with root package name */
    public static final Charset f31298g;

    static {
        Charset forName = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
        AbstractC3159y.h(forName, "forName(...)");
        f31293b = forName;
        Charset forName2 = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF16_NAME);
        AbstractC3159y.h(forName2, "forName(...)");
        f31294c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        AbstractC3159y.h(forName3, "forName(...)");
        f31295d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        AbstractC3159y.h(forName4, "forName(...)");
        f31296e = forName4;
        Charset forName5 = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.ASCII_NAME);
        AbstractC3159y.h(forName5, "forName(...)");
        f31297f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        AbstractC3159y.h(forName6, "forName(...)");
        f31298g = forName6;
    }

    private C2728d() {
    }
}
