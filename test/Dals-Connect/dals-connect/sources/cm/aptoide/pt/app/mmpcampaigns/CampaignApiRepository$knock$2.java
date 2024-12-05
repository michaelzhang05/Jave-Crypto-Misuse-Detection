package cm.aptoide.pt.app.mmpcampaigns;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.c;
import kotlin.coroutines.intrinsics.d;
import kotlin.coroutines.j.internal.DebugMetadata;
import kotlin.coroutines.j.internal.SuspendLambda;
import kotlin.coroutines.j.internal.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.l;
import kotlin.o;
import kotlin.u;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.m;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: CampaignApiRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "cm.aptoide.pt.app.mmpcampaigns.CampaignApiRepository$knock$2", f = "CampaignApiRepository.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class CampaignApiRepository$knock$2 extends SuspendLambda implements Function2<h0, Continuation<? super u>, Object> {
    final /* synthetic */ String $url;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CampaignApiRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CampaignApiRepository$knock$2(CampaignApiRepository campaignApiRepository, String str, Continuation<? super CampaignApiRepository$knock$2> continuation) {
        super(2, continuation);
        this.this$0 = campaignApiRepository;
        this.$url = str;
    }

    @Override // kotlin.coroutines.j.internal.BaseContinuationImpl
    public final Continuation<u> create(Object obj, Continuation<?> continuation) {
        return new CampaignApiRepository$knock$2(this.this$0, this.$url, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(h0 h0Var, Continuation<? super u> continuation) {
        return ((CampaignApiRepository$knock$2) create(h0Var, continuation)).invokeSuspend(u.a);
    }

    @Override // kotlin.coroutines.j.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c2;
        Continuation b2;
        OkHttpClient okHttpClient;
        Object c3;
        c2 = d.c();
        int i2 = this.label;
        if (i2 == 0) {
            o.b(obj);
            CampaignApiRepository campaignApiRepository = this.this$0;
            String str = this.$url;
            this.L$0 = campaignApiRepository;
            this.L$1 = str;
            this.label = 1;
            b2 = c.b(this);
            final m mVar = new m(b2, 1);
            mVar.w();
            okHttpClient = campaignApiRepository.client;
            okHttpClient.newCall(new Request.Builder().url(str).build()).enqueue(new Callback() { // from class: cm.aptoide.pt.app.mmpcampaigns.CampaignApiRepository$knock$2$1$1
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException e2) {
                    l.f(call, "call");
                    l.f(e2, "e");
                    if (mVar.b()) {
                        kotlinx.coroutines.l<u> lVar = mVar;
                        Result.a aVar = Result.f21603f;
                        lVar.resumeWith(Result.a(u.a));
                    }
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) throws IOException {
                    l.f(call, "call");
                    l.f(response, "response");
                    if (mVar.b()) {
                        kotlinx.coroutines.l<u> lVar = mVar;
                        Result.a aVar = Result.f21603f;
                        lVar.resumeWith(Result.a(u.a));
                    }
                    ResponseBody body = response.body();
                    if (body != null) {
                        body.close();
                    }
                }
            });
            Object t = mVar.t();
            c3 = d.c();
            if (t == c3) {
                g.c(this);
            }
            if (t == c2) {
                return c2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
        }
        return u.a;
    }
}
