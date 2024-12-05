package androidx.datastore.core;

import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class InterProcessCoordinatorKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final InterProcessCoordinator createSingleProcessCoordinator(String filePath) {
        AbstractC3159y.i(filePath, "filePath");
        return new SingleProcessCoordinator(filePath);
    }
}
