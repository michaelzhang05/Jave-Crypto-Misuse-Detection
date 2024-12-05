package W;

import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f11960a = Pattern.compile("\\$\\{(.*?)\\}");

    public static boolean a(String str) {
        if (str != null && !str.trim().isEmpty()) {
            return false;
        }
        return true;
    }
}
