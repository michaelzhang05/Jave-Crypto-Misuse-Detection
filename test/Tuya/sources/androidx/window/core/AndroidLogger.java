package androidx.window.core;

import android.util.Log;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class AndroidLogger implements Logger {
    public static final AndroidLogger INSTANCE = new AndroidLogger();

    private AndroidLogger() {
    }

    @Override // androidx.window.core.Logger
    public void debug(String tag, String message) {
        AbstractC3159y.i(tag, "tag");
        AbstractC3159y.i(message, "message");
        Log.d(tag, message);
    }
}
