package Y3;

import android.content.Context;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final X3.c f13561a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f13562b;

    public l(Context context, X3.c errorReporter) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(errorReporter, "errorReporter");
        this.f13561a = errorReporter;
        Context applicationContext = context.getApplicationContext();
        AbstractC3255y.h(applicationContext, "getApplicationContext(...)");
        this.f13562b = applicationContext;
    }
}
