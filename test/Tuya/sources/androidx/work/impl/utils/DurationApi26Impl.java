package androidx.work.impl.utils;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import j$.time.Duration;
import kotlin.jvm.internal.AbstractC3159y;

@RequiresApi(26)
/* loaded from: classes3.dex */
public final class DurationApi26Impl {
    @DoNotInline
    public static final long toMillisCompat(Duration duration) {
        AbstractC3159y.i(duration, "<this>");
        return duration.toMillis();
    }
}
