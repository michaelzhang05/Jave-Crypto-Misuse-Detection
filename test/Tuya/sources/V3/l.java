package V3;

import android.content.Context;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final U3.c f11923a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f11924b;

    public l(Context context, U3.c errorReporter) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(errorReporter, "errorReporter");
        this.f11923a = errorReporter;
        Context applicationContext = context.getApplicationContext();
        AbstractC3159y.h(applicationContext, "getApplicationContext(...)");
        this.f11924b = applicationContext;
    }
}
