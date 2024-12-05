package m6;

import android.os.Looper;
import java.util.List;
import l6.J0;
import q6.t;

/* renamed from: m6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3444a implements t {
    @Override // q6.t
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // q6.t
    public J0 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C3447d(AbstractC3449f.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // q6.t
    public int c() {
        return 1073741823;
    }
}
