package j6;

import android.os.Looper;
import i6.J0;
import java.util.List;
import n6.t;

/* renamed from: j6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3090a implements t {
    @Override // n6.t
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // n6.t
    public J0 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C3093d(AbstractC3095f.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // n6.t
    public int c() {
        return 1073741823;
    }
}
