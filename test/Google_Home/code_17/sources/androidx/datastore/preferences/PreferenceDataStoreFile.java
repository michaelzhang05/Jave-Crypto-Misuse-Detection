package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import java.io.File;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class PreferenceDataStoreFile {
    public static final File preferencesDataStoreFile(Context context, String name) {
        AbstractC3255y.i(context, "<this>");
        AbstractC3255y.i(name, "name");
        return DataStoreFile.dataStoreFile(context, name + ".preferences_pb");
    }
}
