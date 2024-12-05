package androidx.privacysandbox.ads.adservices.java.customaudience;

import O5.I;
import O5.t;
import S5.d;
import T5.b;
import a6.InterfaceC1668n;
import androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager;
import androidx.privacysandbox.ads.adservices.customaudience.JoinCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3255y;
import l6.M;

@f(c = "androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1", f = "CustomAudienceManagerFutures.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1 extends l implements InterfaceC1668n {
    final /* synthetic */ JoinCustomAudienceRequest $request;
    int label;
    final /* synthetic */ CustomAudienceManagerFutures.Api33Ext4JavaImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1(CustomAudienceManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl, JoinCustomAudienceRequest joinCustomAudienceRequest, d dVar) {
        super(2, dVar);
        this.this$0 = api33Ext4JavaImpl;
        this.$request = joinCustomAudienceRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1(this.this$0, this.$request, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CustomAudienceManager customAudienceManager;
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            customAudienceManager = this.this$0.mCustomAudienceManager;
            AbstractC3255y.f(customAudienceManager);
            JoinCustomAudienceRequest joinCustomAudienceRequest = this.$request;
            this.label = 1;
            if (customAudienceManager.joinCustomAudience(joinCustomAudienceRequest, this) == e8) {
                return e8;
            }
        }
        return I.f8278a;
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(M m8, d dVar) {
        return ((CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1) create(m8, dVar)).invokeSuspend(I.f8278a);
    }
}
