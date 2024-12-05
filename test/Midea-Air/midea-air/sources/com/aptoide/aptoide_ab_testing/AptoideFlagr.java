package com.aptoide.aptoide_ab_testing;

import com.aptoide.aptoide_ab_testing.model.EvalContext;
import com.aptoide.aptoide_ab_testing.model.Flag;
import com.aptoide.aptoide_ab_testing.model.PostEvaluationResponseJson;
import com.aptoide.aptoide_ab_testing.service.FlagrService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.l;
import kotlin.text.t;
import kotlin.text.u;
import okhttp3.HttpUrl;

/* compiled from: AptoideFlagr.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/aptoide/aptoide_ab_testing/AptoideFlagr;", HttpUrl.FRAGMENT_ENCODE_SET, "service", "Lcom/aptoide/aptoide_ab_testing/service/FlagrService;", "(Lcom/aptoide/aptoide_ab_testing/service/FlagrService;)V", "getFlag", "Lcom/aptoide/aptoide_ab_testing/model/Flag;", "flagID", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postEvaluation", "Lcom/aptoide/aptoide_ab_testing/model/PostEvaluationResponseJson;", "body", "Lcom/aptoide/aptoide_ab_testing/model/EvalContext;", "(Lcom/aptoide/aptoide_ab_testing/model/EvalContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aptoide-ab-testing"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AptoideFlagr {
    private final FlagrService service;

    public AptoideFlagr(FlagrService flagrService) {
        l.f(flagrService, "service");
        this.service = flagrService;
    }

    public final Object getFlag(String str, Continuation<? super Flag> continuation) {
        boolean p;
        Integer g2;
        p = u.p(str);
        if (!p) {
            g2 = t.g(str);
            if (g2 != null) {
                return this.service.getFlag(str, continuation);
            }
            throw new FlagrException("Flag ID is not a number", 0, 2, null);
        }
        throw new FlagrException("Flag ID is blank", 0, 2, null);
    }

    public final Object postEvaluation(EvalContext evalContext, Continuation<? super PostEvaluationResponseJson> continuation) {
        return this.service.postEvaluation(evalContext, continuation);
    }
}
