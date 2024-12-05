package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.UUID;
import x0.InterfaceFutureC3857a;

/* loaded from: classes3.dex */
public interface ProgressUpdater {
    @NonNull
    InterfaceFutureC3857a updateProgress(@NonNull Context context, @NonNull UUID uuid, @NonNull Data data);
}
