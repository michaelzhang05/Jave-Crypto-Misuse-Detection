package androidx.datastore.core;

import java.io.File;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class InterProcessCoordinator_jvmKt {
    public static final InterProcessCoordinator createSingleProcessCoordinator(File file) {
        AbstractC3255y.i(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        AbstractC3255y.h(absolutePath, "file.canonicalFile.absolutePath");
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(absolutePath);
    }
}
