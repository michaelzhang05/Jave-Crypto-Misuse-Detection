package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import androidx.arch.core.executor.ArchTaskExecutor;
import com.stripe.android.stripe3ds2.views.b;
import j$.time.Duration;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;

/* loaded from: classes3.dex */
public final class FlowLiveDataConversions {
    public static final <T> InterfaceC3358f asFlow(LiveData<T> liveData) {
        AbstractC3159y.i(liveData, "<this>");
        return AbstractC3360h.l(AbstractC3360h.e(new FlowLiveDataConversions$asFlow$1(liveData, null)));
    }

    public static final <T> LiveData<T> asLiveData(InterfaceC3358f interfaceC3358f) {
        AbstractC3159y.i(interfaceC3358f, "<this>");
        return asLiveData$default(interfaceC3358f, (P5.g) null, 0L, 3, (Object) null);
    }

    public static /* synthetic */ LiveData asLiveData$default(InterfaceC3358f interfaceC3358f, P5.g gVar, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = P5.h.f7994a;
        }
        if ((i8 & 2) != 0) {
            j8 = 5000;
        }
        return asLiveData(interfaceC3358f, gVar, j8);
    }

    public static final <T> LiveData<T> asLiveData(InterfaceC3358f interfaceC3358f, P5.g context) {
        AbstractC3159y.i(interfaceC3358f, "<this>");
        AbstractC3159y.i(context, "context");
        return asLiveData$default(interfaceC3358f, context, 0L, 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> LiveData<T> asLiveData(InterfaceC3358f interfaceC3358f, P5.g context, long j8) {
        AbstractC3159y.i(interfaceC3358f, "<this>");
        AbstractC3159y.i(context, "context");
        b.c cVar = (LiveData<T>) CoroutineLiveDataKt.liveData(context, j8, new FlowLiveDataConversions$asLiveData$1(interfaceC3358f, null));
        if (interfaceC3358f instanceof InterfaceC3349K) {
            if (ArchTaskExecutor.getInstance().isMainThread()) {
                cVar.setValue(((InterfaceC3349K) interfaceC3358f).getValue());
            } else {
                cVar.postValue(((InterfaceC3349K) interfaceC3358f).getValue());
            }
        }
        return cVar;
    }

    public static /* synthetic */ LiveData asLiveData$default(InterfaceC3358f interfaceC3358f, Duration duration, P5.g gVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            gVar = P5.h.f7994a;
        }
        return asLiveData(interfaceC3358f, duration, gVar);
    }

    @RequiresApi(26)
    public static final <T> LiveData<T> asLiveData(InterfaceC3358f interfaceC3358f, Duration timeout, P5.g context) {
        AbstractC3159y.i(interfaceC3358f, "<this>");
        AbstractC3159y.i(timeout, "timeout");
        AbstractC3159y.i(context, "context");
        return asLiveData(interfaceC3358f, context, Api26Impl.INSTANCE.toMillis(timeout));
    }
}
