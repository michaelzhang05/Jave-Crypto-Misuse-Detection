package R3;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class a extends RuntimeException {
    public /* synthetic */ a(String str, Throwable th, int i8, AbstractC3151p abstractC3151p) {
        this(str, (i8 & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String message, Throwable th) {
        super(message, th);
        AbstractC3159y.i(message, "message");
    }
}
