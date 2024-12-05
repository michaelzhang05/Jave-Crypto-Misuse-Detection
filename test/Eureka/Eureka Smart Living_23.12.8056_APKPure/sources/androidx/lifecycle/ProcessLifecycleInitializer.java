package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.v;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements k0.a {
    @Override // k0.a
    public List a() {
        List d6;
        d6 = a5.n.d();
        return d6;
    }

    @Override // k0.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m b(Context context) {
        f5.h.e(context, "context");
        androidx.startup.a e6 = androidx.startup.a.e(context);
        f5.h.d(e6, "getInstance(context)");
        if (!e6.g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        j.a(context);
        v.b bVar = v.f3112i;
        bVar.b(context);
        return bVar.a();
    }
}
