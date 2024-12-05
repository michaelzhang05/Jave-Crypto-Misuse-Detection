package M2;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.googlepaylauncher.h;
import l6.M;

/* loaded from: classes4.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private final com.stripe.android.googlepaylauncher.k f6470a;

    i(com.stripe.android.googlepaylauncher.k kVar) {
        this.f6470a = kVar;
    }

    public static x5.i b(com.stripe.android.googlepaylauncher.k kVar) {
        return x5.f.a(new i(kVar));
    }

    @Override // M2.h
    public com.stripe.android.googlepaylauncher.h a(M m8, h.d dVar, h.e eVar, ActivityResultLauncher activityResultLauncher, boolean z8) {
        return this.f6470a.b(m8, dVar, eVar, activityResultLauncher, z8);
    }
}
