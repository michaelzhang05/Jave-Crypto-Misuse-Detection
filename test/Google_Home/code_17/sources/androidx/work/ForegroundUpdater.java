package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.UUID;
import z0.InterfaceFutureC4218d;

/* loaded from: classes3.dex */
public interface ForegroundUpdater {
    @NonNull
    InterfaceFutureC4218d setForegroundAsync(@NonNull Context context, @NonNull UUID uuid, @NonNull ForegroundInfo foregroundInfo);
}
