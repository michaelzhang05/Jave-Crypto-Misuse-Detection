package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.UUID;
import z0.InterfaceFutureC4218d;

/* loaded from: classes3.dex */
public interface ProgressUpdater {
    @NonNull
    InterfaceFutureC4218d updateProgress(@NonNull Context context, @NonNull UUID uuid, @NonNull Data data);
}
