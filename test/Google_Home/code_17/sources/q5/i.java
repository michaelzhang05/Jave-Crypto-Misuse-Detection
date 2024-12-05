package q5;

import android.content.Context;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3680t;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f38337a = new i();

    private i() {
    }

    private final float a(float f8) {
        float f9 = f8 - 2;
        if (f9 < 0.5d) {
            return 0.5f;
        }
        return f9;
    }

    private final float b(float f8) {
        if (f8 <= 2.0f) {
            return f8 + 2;
        }
        return f8;
    }

    public final float c(Context context) {
        float f8;
        AbstractC3255y.i(context, "context");
        float f9 = context.getResources().getDisplayMetrics().density;
        if (f9 > 4.0f) {
            f8 = 3.0f;
        } else {
            f8 = f9 - 1;
        }
        int l8 = SettingsPreferences.f30353b.l(context);
        if (l8 != 0) {
            if (l8 != 1) {
                if (l8 == 2 && UptodownApp.f29058B.U(context)) {
                    return b(f8);
                }
                return f8;
            }
            if (!C3680t.f36531a.c()) {
                return a(f8);
            }
            if (UptodownApp.f29058B.U(context)) {
                return b(f8);
            }
            return f8;
        }
        return a(f8);
    }
}
