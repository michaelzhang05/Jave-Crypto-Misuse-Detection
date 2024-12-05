package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import androidx.arch.core.executor.ArchTaskExecutor;
import com.stripe.android.stripe3ds2.views.b;
import j$.time.Duration;
import kotlin.jvm.internal.AbstractC3255y;
import o6.AbstractC3708h;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;

/* loaded from: classes3.dex */
public final class FlowLiveDataConversions {
    public static final <T> InterfaceC3706f asFlow(LiveData<T> liveData) {
        AbstractC3255y.i(liveData, "<this>");
        return AbstractC3708h.n(AbstractC3708h.e(new FlowLiveDataConversions$asFlow$1(liveData, null)));
    }

    public static final <T> LiveData<T> asLiveData(InterfaceC3706f interfaceC3706f) {
        AbstractC3255y.i(interfaceC3706f, "<this>");
        return asLiveData$default(interfaceC3706f, (S5.g) null, 0L, 3, (Object) null);
    }

    public static /* synthetic */ LiveData asLiveData$default(InterfaceC3706f interfaceC3706f, S5.g gVar, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = S5.h.f9825a;
        }
        if ((i8 & 2) != 0) {
            j8 = 5000;
        }
        return asLiveData(interfaceC3706f, gVar, j8);
    }

    public static final <T> LiveData<T> asLiveData(InterfaceC3706f interfaceC3706f, S5.g context) {
        AbstractC3255y.i(interfaceC3706f, "<this>");
        AbstractC3255y.i(context, "context");
        return asLiveData$default(interfaceC3706f, context, 0L, 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> LiveData<T> asLiveData(InterfaceC3706f interfaceC3706f, S5.g context, long j8) {
        AbstractC3255y.i(interfaceC3706f, "<this>");
        AbstractC3255y.i(context, "context");
        b.c cVar = (LiveData<T>) CoroutineLiveDataKt.liveData(context, j8, new FlowLiveDataConversions$asLiveData$1(interfaceC3706f, null));
        if (interfaceC3706f instanceof InterfaceC3698L) {
            if (ArchTaskExecutor.getInstance().isMainThread()) {
                cVar.setValue(((InterfaceC3698L) interfaceC3706f).getValue());
            } else {
                cVar.postValue(((InterfaceC3698L) interfaceC3706f).getValue());
            }
        }
        return cVar;
    }

    public static /* synthetic */ LiveData asLiveData$default(InterfaceC3706f interfaceC3706f, Duration duration, S5.g gVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            gVar = S5.h.f9825a;
        }
        return asLiveData(interfaceC3706f, duration, gVar);
    }

    @RequiresApi(26)
    public static final <T> LiveData<T> asLiveData(InterfaceC3706f interfaceC3706f, Duration timeout, S5.g context) {
        AbstractC3255y.i(interfaceC3706f, "<this>");
        AbstractC3255y.i(timeout, "timeout");
        AbstractC3255y.i(context, "context");
        return asLiveData(interfaceC3706f, context, Api26Impl.INSTANCE.toMillis(timeout));
    }
}
