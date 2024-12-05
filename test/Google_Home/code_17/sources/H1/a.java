package H1;

import android.app.UiModeManager;
import android.content.Context;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static UiModeManager f3470a;

    public static B1.g a() {
        int currentModeType = f3470a.getCurrentModeType();
        if (currentModeType != 1) {
            if (currentModeType != 4) {
                return B1.g.OTHER;
            }
            return B1.g.CTV;
        }
        return B1.g.MOBILE;
    }

    public static void b(Context context) {
        if (context != null) {
            f3470a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
