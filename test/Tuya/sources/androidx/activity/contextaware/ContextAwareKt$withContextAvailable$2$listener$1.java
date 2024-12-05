package androidx.activity.contextaware;

import L5.s;
import L5.t;
import android.content.Context;
import i6.InterfaceC2837o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    final /* synthetic */ InterfaceC2837o $co;
    final /* synthetic */ Function1 $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(InterfaceC2837o interfaceC2837o, Function1 function1) {
        this.$co = interfaceC2837o;
        this.$onContextAvailable = function1;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public void onContextAvailable(Context context) {
        Object b8;
        AbstractC3159y.i(context, "context");
        InterfaceC2837o interfaceC2837o = this.$co;
        Function1 function1 = this.$onContextAvailable;
        try {
            s.a aVar = s.f6511b;
            b8 = s.b(function1.invoke(context));
        } catch (Throwable th) {
            s.a aVar2 = s.f6511b;
            b8 = s.b(t.a(th));
        }
        interfaceC2837o.resumeWith(b8);
    }
}
