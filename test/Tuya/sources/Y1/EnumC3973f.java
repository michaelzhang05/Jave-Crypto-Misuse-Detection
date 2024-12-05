package y1;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* renamed from: y1.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC3973f {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(MimeTypes.BASE_TYPE_VIDEO),
    AUDIO(MimeTypes.BASE_TYPE_AUDIO);


    /* renamed from: a, reason: collision with root package name */
    private final String f39701a;

    EnumC3973f(String str) {
        this.f39701a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f39701a;
    }
}
