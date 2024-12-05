package androidx.datastore.core;

import P5.g;
import java.io.File;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class MultiProcessCoordinatorKt {
    public static final InterProcessCoordinator createMultiProcessCoordinator(g context, File file) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(file, "file");
        return new MultiProcessCoordinator(context, file);
    }
}
