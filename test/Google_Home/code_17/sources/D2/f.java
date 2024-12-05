package D2;

import android.content.Context;
import kotlin.jvm.internal.AbstractC3255y;
import u2.InterfaceC4057d;

/* loaded from: classes4.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1797a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f1798b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4057d f1799c;

    public f(Context context) {
        boolean z8;
        AbstractC3255y.i(context, "context");
        if ((context.getApplicationInfo().flags & 2) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f1797a = z8;
        this.f1799c = InterfaceC4057d.f39950a.a(z8 || this.f1798b);
    }

    @Override // D2.h
    public void a(String message) {
        AbstractC3255y.i(message, "message");
        this.f1799c.c(message);
    }
}
