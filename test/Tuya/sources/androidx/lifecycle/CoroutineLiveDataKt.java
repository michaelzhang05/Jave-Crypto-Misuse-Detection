package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import i6.AbstractC2825i;
import i6.C2812b0;
import j$.time.Duration;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class CoroutineLiveDataKt {
    public static final long DEFAULT_TIMEOUT = 5000;

    public static final <T> Object addDisposableSource(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, P5.d dVar) {
        return AbstractC2825i.g(C2812b0.c().G(), new CoroutineLiveDataKt$addDisposableSource$2(mediatorLiveData, liveData, null), dVar);
    }

    public static final <T> LiveData<T> liveData(P5.g context, X5.n block) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(block, "block");
        return liveData$default(context, 0L, block, 2, (Object) null);
    }

    public static /* synthetic */ LiveData liveData$default(P5.g gVar, long j8, X5.n nVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = P5.h.f7994a;
        }
        if ((i8 & 2) != 0) {
            j8 = 5000;
        }
        return liveData(gVar, j8, nVar);
    }

    public static final <T> LiveData<T> liveData(X5.n block) {
        AbstractC3159y.i(block, "block");
        return liveData$default((P5.g) null, 0L, block, 3, (Object) null);
    }

    @RequiresApi(26)
    public static final <T> LiveData<T> liveData(Duration timeout, X5.n block) {
        AbstractC3159y.i(timeout, "timeout");
        AbstractC3159y.i(block, "block");
        return liveData$default(timeout, (P5.g) null, block, 2, (Object) null);
    }

    public static /* synthetic */ LiveData liveData$default(Duration duration, P5.g gVar, X5.n nVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            gVar = P5.h.f7994a;
        }
        return liveData(duration, gVar, nVar);
    }

    public static final <T> LiveData<T> liveData(P5.g context, long j8, X5.n block) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(block, "block");
        return new CoroutineLiveData(context, j8, block);
    }

    @RequiresApi(26)
    public static final <T> LiveData<T> liveData(Duration timeout, P5.g context, X5.n block) {
        AbstractC3159y.i(timeout, "timeout");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(block, "block");
        return new CoroutineLiveData(context, Api26Impl.INSTANCE.toMillis(timeout), block);
    }
}
