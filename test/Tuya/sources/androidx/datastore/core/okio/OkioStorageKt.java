package androidx.datastore.core.okio;

import P6.Q;
import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.InterProcessCoordinatorKt;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class OkioStorageKt {
    public static final InterProcessCoordinator createSingleProcessCoordinator(Q path) {
        AbstractC3159y.i(path, "path");
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(path.h().toString());
    }
}
