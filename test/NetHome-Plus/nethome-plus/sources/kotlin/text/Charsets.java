package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: Charsets.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0010\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlin/text/Charsets;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "ISO_8859_1", "Ljava/nio/charset/Charset;", "US_ASCII", "UTF_16", "UTF_16BE", "UTF_16LE", "UTF_32", "UTF32", "()Ljava/nio/charset/Charset;", "UTF_32BE", "UTF32_BE", "UTF_32LE", "UTF32_LE", "UTF_8", "utf_32", "utf_32be", "utf_32le", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.h0.d, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class Charsets {
    public static final Charsets a = new Charsets();

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f21561b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f21562c;

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f21563d;

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f21564e;

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f21565f;

    /* renamed from: g, reason: collision with root package name */
    public static final Charset f21566g;

    /* renamed from: h, reason: collision with root package name */
    private static Charset f21567h;

    /* renamed from: i, reason: collision with root package name */
    private static Charset f21568i;

    static {
        Charset forName = Charset.forName("UTF-8");
        l.e(forName, "forName(\"UTF-8\")");
        f21561b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        l.e(forName2, "forName(\"UTF-16\")");
        f21562c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        l.e(forName3, "forName(\"UTF-16BE\")");
        f21563d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        l.e(forName4, "forName(\"UTF-16LE\")");
        f21564e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        l.e(forName5, "forName(\"US-ASCII\")");
        f21565f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        l.e(forName6, "forName(\"ISO-8859-1\")");
        f21566g = forName6;
    }

    private Charsets() {
    }

    public final Charset a() {
        Charset charset = f21568i;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        l.e(forName, "forName(\"UTF-32BE\")");
        f21568i = forName;
        return forName;
    }

    public final Charset b() {
        Charset charset = f21567h;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        l.e(forName, "forName(\"UTF-32LE\")");
        f21567h = forName;
        return forName;
    }
}
