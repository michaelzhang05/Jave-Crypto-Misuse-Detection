package J2;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.googlepaylauncher.h;
import i6.M;

/* loaded from: classes4.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private final com.stripe.android.googlepaylauncher.k f4764a;

    i(com.stripe.android.googlepaylauncher.k kVar) {
        this.f4764a = kVar;
    }

    public static u5.i b(com.stripe.android.googlepaylauncher.k kVar) {
        return u5.f.a(new i(kVar));
    }

    @Override // J2.h
    public com.stripe.android.googlepaylauncher.h a(M m8, h.d dVar, h.e eVar, ActivityResultLauncher activityResultLauncher, boolean z8) {
        return this.f4764a.b(m8, dVar, eVar, activityResultLauncher, z8);
    }
}
