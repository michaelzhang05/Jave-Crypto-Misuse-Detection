package z4;

import android.net.Uri;
import j6.n;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: z4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4230c {

    /* renamed from: a, reason: collision with root package name */
    public static final C4230c f41174a = new C4230c();

    private C4230c() {
    }

    public final boolean a(String url) {
        boolean z8;
        AbstractC3255y.i(url, "url");
        Uri parse = Uri.parse(url);
        if (!AbstractC3255y.d(parse.getScheme(), "https")) {
            return false;
        }
        String host = parse.getHost();
        if (!AbstractC3255y.d(host, "stripe.com")) {
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
