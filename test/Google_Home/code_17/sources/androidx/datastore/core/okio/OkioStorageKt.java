package androidx.datastore.core.okio;

import S6.Q;
import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.InterProcessCoordinatorKt;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class OkioStorageKt {
    public static final InterProcessCoordinator createSingleProcessCoordinator(Q path) {
        AbstractC3255y.i(path, "path");
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(path.h().toString());
    }
}
