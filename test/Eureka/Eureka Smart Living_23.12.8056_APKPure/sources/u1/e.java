package u1;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes.dex */
public interface e {
    void b(String str, LifecycleCallback lifecycleCallback);

    LifecycleCallback e(String str, Class cls);

    Activity f();

    void startActivityForResult(Intent intent, int i6);
}
