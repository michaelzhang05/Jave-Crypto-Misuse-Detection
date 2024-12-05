package androidx.datastore;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class DataStoreFile {
    public static final File dataStoreFile(Context context, String fileName) {
        AbstractC3255y.i(context, "<this>");
        AbstractC3255y.i(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/" + fileName);
    }
}
