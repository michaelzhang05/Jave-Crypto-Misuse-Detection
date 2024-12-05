package androidx.datastore.core;

import android.os.Build;
import java.io.File;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class FileMoves_androidKt {
    public static final boolean atomicMoveTo(File file, File toFile) {
        AbstractC3159y.i(file, "<this>");
        AbstractC3159y.i(toFile, "toFile");
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.INSTANCE.move(file, toFile);
        }
        return file.renameTo(toFile);
    }
}
