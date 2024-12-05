package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.t;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f2014a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f2015b = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle a(t.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat d6 = aVar.d();
        bundle.putInt("icon", d6 != null ? d6.e() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(g1 g1Var) {
        new Bundle();
        throw null;
    }

    private static Bundle[] c(g1[] g1VarArr) {
        if (g1VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[g1VarArr.length];
        for (int i6 = 0; i6 < g1VarArr.length; i6++) {
            g1 g1Var = g1VarArr[i6];
            bundleArr[i6] = b(null);
        }
        return bundleArr;
    }
}
