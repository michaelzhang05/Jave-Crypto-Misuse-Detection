package A2;

import android.content.Context;
import kotlin.jvm.internal.AbstractC3159y;
import r2.InterfaceC3684d;

/* loaded from: classes4.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f95a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f96b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3684d f97c;

    public f(Context context) {
        boolean z8;
        AbstractC3159y.i(context, "context");
        if ((context.getApplicationInfo().flags & 2) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f95a = z8;
        this.f97c = InterfaceC3684d.f37570a.a(z8 || this.f96b);
    }

    @Override // A2.h
    public void a(String message) {
        AbstractC3159y.i(message, "message");
        this.f97c.c(message);
    }
}
