package androidx.privacysandbox.ads.adservices.java.topics;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import androidx.privacysandbox.ads.adservices.topics.TopicsManager;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.N;
import l6.U;
import z0.InterfaceFutureC4218d;

/* loaded from: classes3.dex */
public abstract class TopicsManagerFutures {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class Api33Ext4JavaImpl extends TopicsManagerFutures {
        private final TopicsManager mTopicsManager;

        public Api33Ext4JavaImpl(TopicsManager mTopicsManager) {
            AbstractC3255y.i(mTopicsManager, "mTopicsManager");
            this.mTopicsManager = mTopicsManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
        @DoNotInline
        public InterfaceFutureC4218d getTopicsAsync(GetTopicsRequest request) {
            U b8;
            AbstractC3255y.i(request, "request");
            b8 = AbstractC3364k.b(N.a(C3347b0.c()), null, null, new TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1(this, request, null), 3, null);
            return CoroutineAdapterKt.asListenableFuture$default(b8, null, 1, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final TopicsManagerFutures from(Context context) {
            AbstractC3255y.i(context, "context");
            TopicsManager obtain = TopicsManager.Companion.obtain(context);
            if (obtain != null) {
                return new Api33Ext4JavaImpl(obtain);
            }
            return null;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public static final TopicsManagerFutures from(Context context) {
        return Companion.from(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    public abstract InterfaceFutureC4218d getTopicsAsync(GetTopicsRequest getTopicsRequest);
}
