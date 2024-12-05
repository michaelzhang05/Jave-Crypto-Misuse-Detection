package E1;

import android.text.TextUtils;
import android.util.Log;
import x1.AbstractC3860c;

/* loaded from: classes3.dex */
public abstract class d {
    public static void a(String str) {
        if (AbstractC3860c.f39104a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    public static void b(String str, Exception exc) {
        if ((AbstractC3860c.f39104a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
