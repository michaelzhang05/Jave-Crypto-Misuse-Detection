package androidx.lifecycle;

import a6.InterfaceC1668n;
import androidx.annotation.RequiresApi;
import j$.time.Duration;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.C3347b0;

/* loaded from: classes3.dex */
public final class CoroutineLiveDataKt {
    public static final long DEFAULT_TIMEOUT = 5000;

    public static final <T> Object addDisposableSource(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, S5.d dVar) {
        return AbstractC3360i.g(C3347b0.c().G(), new CoroutineLiveDataKt$addDisposableSource$2(mediatorLiveData, liveData, null), dVar);
    }

    public static final <T> LiveData<T> liveData(S5.g context, InterfaceC1668n block) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(block, "block");
        return liveData$default(context, 0L, block, 2, (Object) null);
    }

    public static /* synthetic */ LiveData liveData$default(S5.g gVar, long j8, InterfaceC1668n interfaceC1668n, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = S5.h.f9825a;
        }
        if ((i8 & 2) != 0) {
            j8 = 5000;
        }
        return liveData(gVar, j8, interfaceC1668n);
    }

    public static final <T> LiveData<T> liveData(InterfaceC1668n block) {
        AbstractC3255y.i(block, "block");
        return liveData$default((S5.g) null, 0L, block, 3, (Object) null);
    }

    @RequiresApi(26)
    public static final <T> LiveData<T> liveData(Duration timeout, InterfaceC1668n block) {
        AbstractC3255y.i(timeout, "timeout");
        AbstractC3255y.i(block, "block");
        return liveData$default(timeout, (S5.g) null, block, 2, (Object) null);
    }

    public static /* synthetic */ LiveData liveData$default(Duration duration, S5.g gVar, InterfaceC1668n interfaceC1668n, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            gVar = S5.h.f9825a;
        }
        return liveData(duration, gVar, interfaceC1668n);
    }

    public static final <T> LiveData<T> liveData(S5.g context, long j8, InterfaceC1668n block) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(block, "block");
        return new CoroutineLiveData(context, j8, block);
    }

    @RequiresApi(26)
    public static final <T> LiveData<T> liveData(Duration timeout, S5.g context, InterfaceC1668n block) {
        AbstractC3255y.i(timeout, "timeout");
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(block, "block");
        return new CoroutineLiveData(context, Api26Impl.INSTANCE.toMillis(timeout), block);
    }
}
