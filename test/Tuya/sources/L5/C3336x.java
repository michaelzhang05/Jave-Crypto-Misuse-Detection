package l5;

import android.content.Context;
import com.uptodown.UptodownApp;
import kotlin.jvm.internal.AbstractC3159y;
import n0.AbstractC3449a;

/* renamed from: l5.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3336x {
    public final void a(Context context) {
        AbstractC3159y.i(context, "context");
        UptodownApp.a aVar = UptodownApp.f28003B;
        if (!aVar.x()) {
            aVar.C0(true);
            try {
                AbstractC3449a.a(context);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }
}
