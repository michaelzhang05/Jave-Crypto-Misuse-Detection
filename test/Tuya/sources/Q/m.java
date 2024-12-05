package Q;

import R.AbstractC1305b;
import com.google.android.gms.common.api.Status;
import r0.C3679j;

/* loaded from: classes3.dex */
public abstract class m {
    public static void a(Status status, Object obj, C3679j c3679j) {
        if (status.L()) {
            c3679j.c(obj);
        } else {
            c3679j.b(AbstractC1305b.a(status));
        }
    }
}
