package o5;

import android.content.Context;
import com.uptodown.UptodownApp;
import kotlin.jvm.internal.AbstractC3255y;
import m0.AbstractC3400a;

/* renamed from: o5.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3684x {
    public final void a(Context context) {
        AbstractC3255y.i(context, "context");
        UptodownApp.a aVar = UptodownApp.f29058B;
        if (!aVar.x()) {
            aVar.C0(true);
            try {
                AbstractC3400a.a(context);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }
}
