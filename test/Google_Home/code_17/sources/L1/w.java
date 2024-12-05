package l1;

import android.util.Base64;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f34362a = new w();

    /* renamed from: b, reason: collision with root package name */
    private static final String f34363b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f34364c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f34365d;

    static {
        String encodeToString = Base64.encodeToString(j6.n.p(v.f34361a.e()), 10);
        f34363b = encodeToString;
        f34364c = "firebase_session_" + encodeToString + "_data";
        f34365d = "firebase_session_" + encodeToString + "_settings";
    }

    private w() {
    }

    public final String a() {
        return f34364c;
    }

    public final String b() {
        return f34365d;
    }
}
