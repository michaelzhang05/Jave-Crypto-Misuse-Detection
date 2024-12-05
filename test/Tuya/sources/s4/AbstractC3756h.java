package s4;

import android.content.Context;

/* renamed from: s4.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3756h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(Context context) {
        if ((context.getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }
}
