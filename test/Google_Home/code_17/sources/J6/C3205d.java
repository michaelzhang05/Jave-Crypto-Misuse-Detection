package j6;

import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: j6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3205d {

    /* renamed from: a, reason: collision with root package name */
    public static final C3205d f34019a = new C3205d();

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f34020b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f34021c;

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f34022d;

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f34023e;

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f34024f;

    /* renamed from: g, reason: collision with root package name */
    public static final Charset f34025g;

    static {
        Charset forName = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
        AbstractC3255y.h(forName, "forName(...)");
        f34020b = forName;
        Charset forName2 = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF16_NAME);
        AbstractC3255y.h(forName2, "forName(...)");
        f34021c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        AbstractC3255y.h(forName3, "forName(...)");
        f34022d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        AbstractC3255y.h(forName4, "forName(...)");
        f34023e = forName4;
        Charset forName5 = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.ASCII_NAME);
        AbstractC3255y.h(forName5, "forName(...)");
        f34024f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        AbstractC3255y.h(forName6, "forName(...)");
        f34025g = forName6;
    }

    private C3205d() {
    }
}
