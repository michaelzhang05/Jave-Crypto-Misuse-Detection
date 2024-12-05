package androidx.datastore.core;

import S5.g;
import java.io.File;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class MultiProcessCoordinatorKt {
    public static final InterProcessCoordinator createMultiProcessCoordinator(g context, File file) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(file, "file");
        return new MultiProcessCoordinator(context, file);
    }
}
