package androidx.window.core;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class WindowStrictModeException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowStrictModeException(String message) {
        super(message);
        AbstractC3255y.i(message, "message");
    }
}
