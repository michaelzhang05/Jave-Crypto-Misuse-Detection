package androidx.activity.contextaware;

import O5.s;
import O5.t;
import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import l6.InterfaceC3372o;

/* loaded from: classes.dex */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    final /* synthetic */ InterfaceC3372o $co;
    final /* synthetic */ Function1 $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(InterfaceC3372o interfaceC3372o, Function1 function1) {
        this.$co = interfaceC3372o;
        this.$onContextAvailable = function1;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public void onContextAvailable(Context context) {
        Object b8;
        AbstractC3255y.i(context, "context");
        InterfaceC3372o interfaceC3372o = this.$co;
        Function1 function1 = this.$onContextAvailable;
        try {
            s.a aVar = s.f8302b;
            b8 = s.b(function1.invoke(context));
        } catch (Throwable th) {
            s.a aVar2 = s.f8302b;
            b8 = s.b(t.a(th));
        }
        interfaceC3372o.resumeWith(b8);
    }
}
