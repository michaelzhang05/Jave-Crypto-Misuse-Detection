package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.UUID;
import x0.InterfaceFutureC3857a;

/* loaded from: classes3.dex */
public interface ForegroundUpdater {
    @NonNull
    InterfaceFutureC3857a setForegroundAsync(@NonNull Context context, @NonNull UUID uuid, @NonNull ForegroundInfo foregroundInfo);
}
