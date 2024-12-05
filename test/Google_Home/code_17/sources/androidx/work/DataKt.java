package androidx.work;

import O5.r;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.Data;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class DataKt {
    public static final /* synthetic */ <T> boolean hasKeyWithValueOfType(Data data, String key) {
        AbstractC3255y.i(data, "<this>");
        AbstractC3255y.i(key, "key");
        AbstractC3255y.n(4, ExifInterface.GPS_DIRECTION_TRUE);
        return data.hasKeyWithValueOfType(key, Object.class);
    }

    public static final Data workDataOf(r... pairs) {
        AbstractC3255y.i(pairs, "pairs");
        Data.Builder builder = new Data.Builder();
        for (r rVar : pairs) {
            builder.put((String) rVar.c(), rVar.d());
        }
        Data build = builder.build();
        AbstractC3255y.h(build, "dataBuilder.build()");
        return build;
    }
}
