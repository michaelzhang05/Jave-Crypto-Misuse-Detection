package androidx.privacysandbox.ads.adservices.java.appsetid;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.N;
import l6.U;
import z0.InterfaceFutureC4218d;

/* loaded from: classes3.dex */
public abstract class AppSetIdManagerFutures {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class Api33Ext4JavaImpl extends AppSetIdManagerFutures {
        private final AppSetIdManager mAppSetIdManager;

        public Api33Ext4JavaImpl(AppSetIdManager mAppSetIdManager) {
            AbstractC3255y.i(mAppSetIdManager, "mAppSetIdManager");
            this.mAppSetIdManager = mAppSetIdManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.appsetid.AppSetIdManagerFutures
        @DoNotInline
        public InterfaceFutureC4218d getAppSetIdAsync() {
            U b8;
            b8 = AbstractC3364k.b(N.a(C3347b0.a()), null, null, new AppSetIdManagerFutures$Api33Ext4JavaImpl$getAppSetIdAsync$1(this, null), 3, null);
            return CoroutineAdapterKt.asListenableFuture$default(b8, null, 1, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final AppSetIdManagerFutures from(Context context) {
            AbstractC3255y.i(context, "context");
            AppSetIdManager obtain = AppSetIdManager.Companion.obtain(context);
            if (obtain != null) {
                return new Api33Ext4JavaImpl(obtain);
            }
            return null;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public static final AppSetIdManagerFutures from(Context context) {
        return Companion.from(context);
    }

    public abstract InterfaceFutureC4218d getAppSetIdAsync();
}
