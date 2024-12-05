package w4;

import android.net.Uri;
import g6.n;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: w4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3850c {

    /* renamed from: a, reason: collision with root package name */
    public static final C3850c f39051a = new C3850c();

    private C3850c() {
    }

    public final boolean a(String url) {
        boolean z8;
        AbstractC3159y.i(url, "url");
        Uri parse = Uri.parse(url);
        if (!AbstractC3159y.d(parse.getScheme(), "https")) {
            return false;
        }
        String host = parse.getHost();
        if (!AbstractC3159y.d(host, "stripe.com")) {
            if (host != null) {
                z8 = n.r(host, ".stripe.com", false, 2, null);
            } else {
                z8 = false;
            }
            if (!z8) {
                return false;
            }
        }
        return true;
    }
}
